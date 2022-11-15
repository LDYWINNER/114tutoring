package com.company;

import java.util.Arrays;

public class EmailHost{
    private final int capacity = 100;
    private Message[] messages;
    private int nextMessage = 0;
    private String hostname;

    public EmailHost(String hostname){
        this.hostname = hostname;
    }

    public String getHostname(){
        return hostname;
    }
    public void send(Message msg){
        String[] str = msg.getTo().split("[@]");
        if(hostname.equals(str[1])){
            messages[nextMessage] = msg;
            nextMessage++;
        }
        else{
            System.out.println("Bad Host");
        }
    }

    public Message[] getMessagesForUser(String userEmail){
        Message[] temporaryMatchedMessages = new Message[100];
        int index1 = 0;
        for(int i = 0; i < nextMessage; i++) {
            if(messages[i].getTo().equals(userEmail)) {
                temporaryMatchedMessages[index1] = messages[i];
                index1++;
            }
        }

        Message[] finalMatchedMessages = new Message[index1];
        int index2 = 0;
        for(int j = 0; j < index1; j++) {
            if(temporaryMatchedMessages[j] != null) {
                finalMatchedMessages[index2] = temporaryMatchedMessages[j];
                index2++;
            }
        }
        return finalMatchedMessages;
    }

}
