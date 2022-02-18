package com.company;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Dilbara","programmer");
        Person person2 = new Person("Aziz","chemist");
        Person person3 = new Person("Dinara","designer");
        Person person4 = new Person("Beksultan","data scientist");
        Person person5 = new Person("Anara","businesswomen");
        Person person6 = new Person("Vener","businessman");
        Person[] families = {person1,person2,person3};
        Person[] person = {person4,person5};
        Person[] people = {person6};

        Dorm dorm = new Dorm("Djal29",person);
        Hotel hotel = new Hotel("Ala-Arch",people);
        Apartment apartment = new Apartment("Asanbai",families);

        dorm.rent();
        System.out.println(dorm);
        System.out.println("");
        hotel.rent();
        System.out.println(hotel);
        System.out.println("");
        apartment.pay();
        System.out.println(apartment);






    }
}
