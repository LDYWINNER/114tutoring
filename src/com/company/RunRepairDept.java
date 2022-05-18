package com.company;

import java.util.Random;

public class RunRepairDept {
    public static RepairDept rd;

    public static void main(String[] args) {
        Part p1 = new Part("00010002", "Widget", "Avionics Widget type 1", 1);
        Part p2 = new Part("00020003", "Thingamabob", "Avionics Thingamabob type 2", 0);
        Part p3 = new Part("00030004", "Doohicky", "Avionics Doohicky type 3", 1);
        Part p4 = new Part("00040005", "Roundtuit", "Roundtuit type 4", 1);
        Component c1 = new Component("United", "VSI000S1", "A00010002000", "Visual Speed Indicator Series 1", "No Power");
        Component c2 = new Component("Korean Air", "AH000T1", "B00010003002", "Artificial Horizon Indicator Series 5", "Periodically reads left 10% of true horizon");
        Component c3 = new Component("Alaska Air", "AS000T2", "C00010004002", "Airspeed Indicator", "Periodic failure when altitude above FL200");
        Component c4 = new Component("Delta", "AS000Z2", "D00020004002", "ILS System", "Delay in response when setting ILS frequency");
        Component c5 = new Component("United", "AS00X32", "E00010004007", "Airspeed Indicator", "Periodic failure when altitude above FL200");
        Component c6 = new Component("Korean Air", "AS000T2", "C00010004007", "Airspeed Indicator", "Periodic failure when altitude above FL250");

        rd = new RepairDept();

        rd.addComponent(c1);
        rd.addComponent(c2);
        rd.addComponent(c3);
        rd.addComponent(c4);
        rd.addComponent(c5);
        rd.addComponent(c6);
        rd.addPart(p1);
        rd.addPart(p2);
        rd.addPart(p3);
        rd.addPart(p4);

        Component[] cList = rd.componentsWaiting();

        while (cList != null) {
            if (allNull(cList)) {
                break;
            }
            for (int i = 0; i < cList.length; i++) {
                if (cList[i] == null) {
                    continue;
                }
                processComponent(cList[i]);
            }

            cList = rd.componentsWaiting();
        }

        System.out.println("\n\n");
        rd.dumpRepairDept();
        System.out.println("\n\n");
        System.out.println("Repairs completed on all units. Shutting down");
        System.out.println("\n\n");
    }
    public static void processComponent(Component c) {
        String[] parts = {"00010002", "00020003", "00030004", "00040005"};
        String[] diags = {"Diagnosis is fried", "Diagnosis is boiled", "Diagnosis is toast", "Diagnosis is fixable"};
        Random mr = new Random();
        String[][] pLists = {{"00010002", "00020003"},
                {"00030004", "00040005"},
                {"00010002"},
                {"00040005"}};

        if (c.getState() == Component.state_waitingForDiagnosis) {
            System.out.print ("Diagnosing: ");
            c.dumpComponent();
            int r1 = mr.nextInt(4); // 0-3
            int r2 = mr.nextInt(4); // 0-3

            rd.diagnose(c, diags[r1], pLists[r2]);
        } else if (c.getState() == Component.state_waitingForPart) {
            System.out.print ("Get Parts for ");
            c.dumpComponent();
            int r1 = mr.nextInt(4);
            int r2 = mr.nextInt(4);
            rd.partArrived(parts[r1], r2);  // part r1 arrived , r2 parts recvd
            c.partArrived(); // Continue with repair
        } else if (c.getState() == Component.state_waitingForRepair) {
            System.out.print ("Repairing ");
            c.dumpComponent();
            rd.repair(c);
        } else if (c.getState() == Component.state_waitingForTest) {
            System.out.print ("Testing ");
            c.dumpComponent();
            c.testComponent();
        } else if (c.getState() == Component.state_repaired) {
            System.out.print ("Shipping ");
            c.dumpComponent();
            rd.ship(c);

        }
    }
    public static boolean allNull(Object[] objects) {
        boolean ret = true;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null) {
                ret = false;
                break;
            }
        }
        return ret;
    }

    public void dumpComponents(Component[] cl) {
        for (Component c : cl) {
            c.dumpComponent();
        }
    }


}


