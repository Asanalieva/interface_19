package com.company;

public class Apartment implements PublicService {
    private String address;
    private Person[] people;

    public Apartment(String address, Person[] people) {
        this.address = address;
        this.people = people;
    }
    public Apartment(){}

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public void pay(){
        System.out.println("Paying for public services");
    }
    @Override
    public String toString(){
        return "Apartment address: " + address + '\n'+
                "Amount of people: " + people.length;
    }



}
