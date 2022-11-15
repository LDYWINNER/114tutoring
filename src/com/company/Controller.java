package com.company;

public class Controller{
    private EmailHost[] eHosts;
    private int nextHost = 0;

    public Controller(int num){
        eHosts = new EmailHost[num];
    }
    public boolean registerHost(String hostName, EmailHost eHost){
        //if the EmailHost is already in the array
        for(int i = 0; i < nextHost; i++) {
            if(hostName.equals(eHosts[i].getHostname())) {
                return false;
            }
        }

        //if the array exceeds its capacity
        try {
            eHosts[nextHost] = eHost;
            nextHost++;
        } catch (Exception e) {
            return false;
        }

        return true;
    }
    public EmailHost findHost(String hostname){
        for(int j = 0; j < nextHost; j++) {
            if(eHosts[j].getHostname().equals(hostname)) {
                return eHosts[j];
            }
        }
        return null;
    }
    public EmailHost getHostFor(String address){
        String[] str = address.split("[@]");
        for(int j = 0; j < nextHost; j++) {
            if(eHosts[j].getHostname().equals(str[1])) {
                return eHosts[j];
            }
        }
        return null;
    }
}
