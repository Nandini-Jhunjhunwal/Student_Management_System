package model;

public class Student extends Person {
    private int[] marks;
    private int total;

    public Student(int rollNo, String name, int[] marks) {
        super(rollNo, name);
        this.marks = marks;
        calculateTotal();
    }

    private void calculateTotal() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
    }

    public int getTotal() {
        return total;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
        calculateTotal();
    }

    @Override
    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Total Marks: " + total);
    }
}
