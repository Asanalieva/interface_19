package com.company;

public class Hotel implements Rent {
    private String address;
    private Person[] person;

    public Hotel(String address, Person[] person) {
        this.address = address;
        this.person = person;
    }
    public Hotel(){}

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
        System.out.println("Paying for rent");
    }
    @Override
    public String toString(){
        return "Hotel address: " + address+'\n'+
                "Amount of people: "+ person.length;
    }
}
