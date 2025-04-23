package main;

import service.StudentService;

import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentService ss = new StudentService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Student Management Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Sort Students by Marks");
            System.out.println("4. Search Student");
            System.out.println("5. Update Student Marks");
            System.out.println("6. Delete Student");
            System.out.println("7. Undo Last Student");
            System.out.println("8. Announce Results");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> ss.addStudent();
                case 2 -> ss.displayStudents();
                case 3 -> ss.sortStudents();
                case 4 -> ss.searchStudent();
                case 5 -> ss.updateStudent();
                case 6 -> ss.deleteStudent();
                case 7 -> ss.undoLastStudent();
                case 8 -> ss.announceResults();
                case 9 -> {
                    System.out.println("Exiting program. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
