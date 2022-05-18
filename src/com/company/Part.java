package com.company;

public class Part {
    private String partNo;
    private String partName;
    private String partDesc;
    private int countOnHand;

    // getter
    public String getPartNo() {
        return partNo;
    }
    public String getPartName() {
        return partName;
    }
    public String getPartDesc() {
        return partDesc;
    }
    public int getCountOnHand() {
        return countOnHand;
    }
    // setter
    public void setCountOnHand(int countOnHand) {
        this.countOnHand = countOnHand;
    }

    public Part(String partNo, String partName, String partDesc, int countOnHand) {
        this.partNo = partNo;
        this.partDesc = partDesc;
        this.countOnHand = countOnHand;
        this.partName = partName;
    }

    // Methods
    public void addInventory(int amount) {
        countOnHand = amount + countOnHand;
    }

    public void decrementInventory() {
        countOnHand--;
    }

    public void dumpPart() {
        //Finally, add a method, dumpPart() which will print out information on the part.
        // It should minimally list the partNo, partName and countOnHand.
        // This will be used for debugging as you write more of the code for the system.
        System.out.println("Part Number: " + partNo + " : Part Name: " + partName + " : part Description: " + partDesc + " : count On Hand: " + countOnHand);
    }
}
