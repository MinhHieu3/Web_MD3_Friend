package org.example.friend.models;

public class Status {
    private int idRecipient;
    private int idSender;
    private String status;

    public Status() {
    }

    public Status(int idRecipient, int idSender, String status) {
        this.idRecipient = idRecipient;
        this.idSender = idSender;
        this.status = status;
    }

    public int getIdRecipient() {
        return idRecipient;
    }

    public void setIdRecipient(int idRecipient) {
        this.idRecipient = idRecipient;
    }

    public int getIdSender() {
        return idSender;
    }

    public void setIdSender(int idSender) {
        this.idSender = idSender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
