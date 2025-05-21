package com.db_test;

public class Office {
    private int officeCode;
    private String city, state;

    public Office(int officeCode, String state, String city) {
        this.officeCode = officeCode;
        this.state = state;
        this.city = city;
    }

    public int getOfficeCode() {
        return officeCode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Office{" +
                "officeCode=" + officeCode +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
