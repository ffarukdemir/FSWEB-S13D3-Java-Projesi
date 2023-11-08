package com.workintech.model;

import org.w3c.dom.ls.LSOutput;

class Person {
    String firstName;
    String lastName;
    int age;
    boolean isMarried;
    String[] langs;
    double heightInMeter;
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName, int age, boolean isMarried, String[] langs, double heightInMeter) {
        this(firstName, lastName, age);
        this.isMarried = isMarried;
        this.langs = langs;
        this.heightInMeter = heightInMeter;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public boolean isTeen() {
        return (age > 13 && age <= 19);
    }


    public static void main(String[] args){

       Person person = new Person("John", "Doe", 20);
       Person ahmet = new Person("ahmet", "yılmaz", 20, true, new String[]{"ing","tr"}, 1.78);

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());
        System.out.println("------------");
        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }


}
