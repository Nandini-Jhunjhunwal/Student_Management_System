package service;

import model.Student;
import utils.CustomExceptions;

import java.util.*;

public class StudentService implements StudentOperations {
    private final LinkedList<Student> studentList = new LinkedList<>();
    private final Stack<Student> historyStack = new Stack<>();
    private final Queue<Student> resultQueue = new LinkedList<>();
    private final Scanner sc = new Scanner(System.in);

    @Override
    public void addStudent() {
        try {
            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine();

            for (Student s : studentList) {
                if (s.getRollNo() == rollNo) {
                    throw new CustomExceptions.DuplicateRollNoException("Roll number already exists!");
                }
            }

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            int[] marks = new int[3];
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter marks for Subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
                if (marks[i] < 0 || marks[i] > 100) {
                    throw new CustomExceptions.InvalidMarksException("Marks must be between 0 and 100.");
                }
            }

            Student student = new Student(rollNo, name, marks);
            studentList.add(student);
            historyStack.push(student);
            resultQueue.offer(student);

            System.out.println("Student added successfully.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter correct data.");
            sc.nextLine(); // Clear buffer
        } catch (CustomExceptions.InvalidMarksException | CustomExceptions.DuplicateRollNoException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n--- Student List ---");
        for (Student s : studentList) {
            s.display();
        }
    }

    @Override
    public void sortStudents() {
        studentList.sort(Comparator.comparing(Student::getTotal).reversed());
        System.out.println("Students sorted by total marks in descending order.");
    }

    @Override
    public void searchStudent() {
        System.out.print("Enter roll number to search: ");
        int rollNo = sc.nextInt();

        for (Student s : studentList) {
            if (s.getRollNo() == rollNo) {
                s.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    @Override
    public void updateStudent() {
        System.out.print("Enter roll number to update: ");
        int rollNo = sc.nextInt();

        for (Student s : studentList) {
            if (s.getRollNo() == rollNo) {
                int[] newMarks = new int[3];
                for (int i = 0; i < 3; i++) {
                    System.out.print("Enter new marks for Subject " + (i + 1) + ": ");
                    newMarks[i] = sc.nextInt();
                }
                s.setMarks(newMarks);
                System.out.println("Marks updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    @Override
    public void deleteStudent() {
        System.out.print("Enter roll number to delete: ");
        int rollNo = sc.nextInt();

        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getRollNo() == rollNo) {
                iterator.remove();
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    @Override
    public void undoLastStudent() {
        if (historyStack.isEmpty()) {
            System.out.println("No student to undo.");
            return;
        }

        Student removed = historyStack.pop();
        studentList.remove(removed);
        resultQueue.remove(removed);
        System.out.println("Removed student: " + removed.getName());
    }

    @Override
    public void announceResults() {
        if (resultQueue.isEmpty()) {
            System.out.println("No results to announce.");
            return;
        }

        System.out.println("\n--- Result Announcement ---");
        while (!resultQueue.isEmpty()) {
            Student s = resultQueue.poll();
            System.out.println("Result for " + s.getName() + " - Total: " + s.getTotal());
        }
    }
}
