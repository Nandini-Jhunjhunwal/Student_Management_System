package model;

public abstract class Person {
    protected int rollNo;
    protected String name;

    public Person(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public abstract void display();
}
