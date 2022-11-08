package com.company;

public class Message {
    private String from;
    private String to;
    private String date;
    private String subject;
    private String body;

    public Message() {
        this.from = "";
        this.to = "";
        this.date = "";
        this.subject = "";
        this.body = "";
    }

    public Message(String from, String to, String date, String subject, String body) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.subject = subject;
        this.body = body;
    }


    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getDate() {
        return date;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public int getLength() {
        return body.length();
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }


    public void setDate(String date) {
        this.date = date;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isImportant() {
        return (this.body.contains("notice") || this.body.contains("meeting")) && this.body.contains("deadline");
    }


    public String toString() {
        return from + " " + to + " " + date + " " + subject + " "  + " " + body;
    }

}

