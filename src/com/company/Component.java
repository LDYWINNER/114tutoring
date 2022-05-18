package com.company;

import java.util.Random;

public class Component {

    // State
    public final static int state_nostate = 0;
    public final static int state_waitingForDiagnosis = 1;
    public final static int state_waitingForPart = 2;
    public final static int state_waitingForRepair = 3;
    public final static int state_waitingForTest = 4;
    public final static int state_repaired = 5;
    public final static int state_shipped = 6;

    // Component Class member
    private String customer;
    private String modelNumber;
    private String serialNumber;
    private String componentName;
    private String failDesc;
    private int state = state_nostate;
    private String[] partsNeeded = {};

    // getter
    public String getCustomer() {
        return customer;
    }
    public String getModelNumber() {
        return modelNumber;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public String getComponentName() {
        return componentName;
    }
    public String getFailDesc() {
        return failDesc;
    }
    public int getState() {
        return state;
    }
    public String[] getPartsNeeded() {
        return partsNeeded;
    }

    //setter
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }
    public void setFailDesc(String failDesc) {
        this.failDesc = failDesc;
    }
    public void setState(int state) {
        this.state = state;
    }
    public void setPartsNeeded(String[] partsNeeded) {
        this.partsNeeded = partsNeeded;
    }

    public Component(String customer, String modelNumber, String serialNumber, String componentName, String failDesc) {
        this.customer = customer;
        this.modelNumber = modelNumber;
        this.serialNumber = serialNumber;
        this.componentName = componentName;
        this.failDesc = failDesc;
    }

    public void diagnose(String diagnosis, String[] partsNeeded) {
        if (state == state_waitingForDiagnosis) {
            failDesc +=  (" : " + diagnosis);
            for (String part : partsNeeded) {
                addToPartsNeededList(part);
            }
        }
        // If the component is not in waitingForDiagnosis state, this method exits without doing anything.
        // This method will append the diagnosis string to the failDesc string
        // (with a ‘:’ between the two strings for visual separation.)
        // It will step through the array of partsNeeded and add them to the partsNeeded list by calling addToPartsNeededList().
    }

    public void repaired() {
        if (state == state_waitingForRepair) {
            state = state_waitingForTest;
        }
        // This method changes the state of the Component from waitingForRepair to waitingForTest.
        // IF the Component is not in waitingForRepair, then the method should return without doing anything.
    }

    public void addToPartsNeededList(String partNumber) {
        String[] temp = new String[partsNeeded.length + 1];
        for (int i = 0; i < partsNeeded.length; i++) {
            temp[i] = partsNeeded[i];
        }
        temp[partsNeeded.length] = partNumber;
        partsNeeded = temp;
        // This adds the partNumber given to the array of partsNeeded Note that you will have to create a new array with one additional element
        // and copy the existing parts to the new array.
    }

    public void partArrived() {
        // This method indicates that all needed parts have arrived and changes the state of the Component from waitingForPart to waitingForRepair.
        // The method should verify the Component is in waitingForPart.
        // If not, it should return without taking any action.
        if (state == state_waitingForPart) {
            state = state_waitingForRepair;
        }
    }

    public void testComponent() {
        // Tests repaired component. Sets state to waitingForRepair (if the test fails which is about 25% of the time)
        // or calls repaired() if the test succeeds (75% of the time). The latter case changes the state to repaired.
        // Use a Random object to get the test result. The method should first verify that the Component is in waitingForTest state.
        // If it is not, the method should just return without changing the Component.
        Random r = new Random();
        double a = r.nextInt();
        boolean tmp = a > 0.25;
        if (state == state_waitingForTest) {
            if (tmp) {
                repaired();
            }
            else {
                state = state_repaired;
            }
        }
    }

    public void dumpComponent() {
        // Finally, add a method, dumpComponent() which will print out information on the component.
        // It should minimally list the customer, component name, and state.
        // This will be used for debugging as you write more of the code for the system.
        System.out.println("Customer: " + customer + " : model number: " + modelNumber + " : serial number: " + serialNumber + " : state: " + state);
    }
}




