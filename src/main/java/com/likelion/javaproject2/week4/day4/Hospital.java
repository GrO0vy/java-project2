package com.likelion.javaproject2.week4.day4;

public class Hospital {
    private String name;
    private String websiteAddress;
    private Address address;

    public Hospital(String name, String websiteAddress, Address address) {
        this.name = name;
        this.websiteAddress = websiteAddress;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsiteAddress() {
        return websiteAddress;
    }

    public void setWebsiteAddress(String phoneNumber) {
        this.websiteAddress = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
