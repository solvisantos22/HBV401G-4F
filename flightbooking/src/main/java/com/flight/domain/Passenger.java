package com.flight.domain;

public class Passenger {
    private String name;
    private String socialSecurityNo;

    public Passenger(String name, String socialSecurityNo) {
        this.name = name;
        this.socialSecurityNo = socialSecurityNo;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNo() {
        return socialSecurityNo;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSocialSecurityNo(String socialSecurityNo) {
        this.socialSecurityNo = socialSecurityNo;
    }

}
