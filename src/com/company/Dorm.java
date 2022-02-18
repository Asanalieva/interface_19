package com.company;

public class Dorm implements Rent {
    private String address;
    private Person[] person;

    public Dorm(String address, Person[] person) {
        this.address = address;
        this.person = person;
    }

    public Dorm(){}
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person[] getPerson() {
        return person;
    }

    public void setPerson(Person[] person) {
        this.person = person;
    }
    @Override
    public void rent(){
        System.out.println("Pays for rent");
    }
    @Override
    public String toString(){
        return "Dormitory address: " + address+'\n'+
        "Amount of people: " + person.length;
    }

}
