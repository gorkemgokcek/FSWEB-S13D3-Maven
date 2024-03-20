package org.example;

public class Person {
    String firstname;
    String lastName;
    int age;
    int height;
    int weight;
    String job;

    public Person(String firstname, String lastName, int age){
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    // constructor overloading
    public Person(String firstname, String lastName, int age, int height, int weight, String job) {
        this(firstname,lastName,age);
        this.height = weight;
        this.weight = height;
        this.job = job;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isTeen() {
        if(this.age >= 13 && this.age <= 19) {
            return true;
        } else {
            return false;
        }
    }
}
