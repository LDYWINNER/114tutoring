package com.company;

public class RepairDept {
    private Component[] componentList = {};
    private Part[] partsOnHand = {};
    private int nextPart;
    private int nextComponent;
    private int maxParts;
    private int maxComponent;

    // Methods
    public void addComponent(Component comp) {
        // This adds a component to the list and sets its state to ‘waiting for diagnosis’.
        // If the component list is too small to handle a new part, you have to allocate a new list and copy the existing components.
        // You can choose how many new slots to create.
        Component[] newList = new Component[componentList.length + 1];
        for (int i = 0; i < componentList.length; i++) {
            newList[i] = componentList[i];
        }
        newList[componentList.length] = comp;
        componentList = newList;
        comp.setState(Component.state_waitingForDiagnosis);
    }

    public void addPart(Part part) {
        // This adds a part to the list of parts in the shop.
        // If the part list is too small to handle a new part, you have to allocate a new list and copy the existing parts.
        // You can choose how many new slots to create.
        Part[] newList = new Part[partsOnHand.length + 1];
        for (int i = 0; i < partsOnHand.length; i++) {
            newList[i] = partsOnHand[i];
        }
        newList[partsOnHand.length] = part;
        partsOnHand = newList;
    }

    public void diagnose(Component comp, String fail, String[] partsRequired) {
        // Indicates what caused the failure and what is needed for repair.
        // Calls the component’s diagnose() method to fill in the part list.
        // It should look up each part (by the String part number supplied) in the partsOnHand array to verify there are enough parts.
        // If there are insufficient parts to repair the unit, this sets the state to waitingForPart.
        // If the parts are all in stock, sets the state to waitingForRepair.

        // example
        // partsOnHand = 1 2 3 4 5
        // partsRequired = 3 4
        // 3 = 3 (PartNo is equal) -> partsOnHand > 0 -> check!
        comp.diagnose(fail, partsRequired);
        boolean tmp = false;
        int check = 0;
        for (int i = 0; i < partsRequired.length; i++) {
            for (int j = 0; j < partsOnHand.length; j++) {
                if (Integer.parseInt(partsRequired[i]) == Integer.parseInt(partsOnHand[j].getPartNo())){
                    if(partsOnHand[j].getCountOnHand() > 0){
                        check++;
                    }
                }
            }
        }
        if (check == partsRequired.length) {
            tmp = true;
        }
        if (tmp) {
            comp.setState(Component.state_waitingForRepair);
        } else {
            comp.setState(Component.state_waitingForPart);
        }
    }

    public void repair(Component comp) {
        // Calls the repaired() method on the component which will set the component’s state to waitingForTest.
        // When a unit is repaired, this should go through the partsNeeded array,
        // find each part in the parts inventory for the RepairDept, and decrement the countOnHand by 1.

        // PartsNeeded from comp -> check index of parts -> decrement
        comp.repaired();
        String[] PartsNeeded = comp.getPartsNeeded();
        for (String partNeeded : PartsNeeded) {
            partsOnHand[findPart(partNeeded)].decrementInventory();
        }
    }

    public void ship(Component comp) {
        // Sets the components state to ‘shipped’
        comp.setState(Component.state_shipped);
    }

    public Component[] componentsWaiting() {
        // This returns a list of components waiting for diagnosis or repair
        // (so active components that need attention).
        Component[] newComponents = new Component[componentList.length];
        int i = 0;
        for (Component comp : componentList) {
            if(comp.getState() == Component.state_waitingForDiagnosis || comp.getState() == Component.state_waitingForRepair){
                newComponents[i] = comp;
                i++;
            }
        }
        Component[] resultComponents = new Component[i];
        for (int j = 0; j < i; j++) {
            resultComponents[j] = newComponents[j];
        }
        return resultComponents;

    }

    public void partArrived(String partnumber, int count) {
        // indicates which part arrived and how many.
        // This method should call the addInventory () method in Part.
        partsOnHand[findPart(partnumber)].addInventory(count);
    }

    public int findPart(String partnumber) {
        // This returns the index of the part in the parts list. If the part doesn’t exist, it returns -1.
        // That can be used to call methods on the part like addInventory() or decrementInventory().

        for (int i = 0; i < partsOnHand.length; i++) {
            if (partsOnHand[i].getPartNo().equals(partnumber)) {
                return i;
            }
        }
        return -1;
    }

    public void dumpRepairDept() {
        // Finally, add a method, dumpRepairDept() which will print out information
        // on the list of components in the shop as well as the list of parts.
        // You can use the various dump methods you wrote for the other classes to save effort.
        // This will be used for debugging as you write more of the code for the system.
        for (Component comp : componentList) {
            comp.dumpComponent();
        }
        for (Part part : partsOnHand) {
            part.dumpPart();
        }
    }



    // The class RunRepairDept is provided.
    // It performs a number of test operations including running through the component list,
    // deciding which parts need diagnosis, repair, etc.

    // It will need to use the APIs described above for some operations.
    // Be sure your protoypes match the ones given! Also, for getters,
    // use the form getItem() where Item is the member name with capitals at the start of each word.
    // For instance, for member countOnHand, write a getter getCountOnHand().
    // If in question, make sure it runs with the copy of RunRepairDept provided!

    // It exits when all parts have been repaired, tested, and shipped.
    // You may add your own code to RunRepairDept if you want to give your code an additional workout
    // but turn in the original copy I give you so when it is graded,
    // all the code is present and can be built and run by the grader

}
