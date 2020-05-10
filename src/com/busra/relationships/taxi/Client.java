package com.busra.relationships.taxi;

public class Client {

    private String clientName;
    private String clientGSM;
    private String location;

    public Client(String clientName, String clientGSM, String location) {
        this.clientName = clientName;
        this.clientGSM = clientGSM;
        this.location = location;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientGSM() {
        return clientGSM;
    }

    public void setClientGSM(String clientGSM) {
        this.clientGSM = clientGSM;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
