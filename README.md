---

# Student Management System

A simple console-based Java application that lets you manage student data efficiently using core object-oriented concepts and data structures.

## 🌲 Project Structure

```
StudentManagementSystem/
│
├── main/
│   └── StudentManagementSystem.java       # Main class with menu-driven UI
│
├── model/
│   ├── Person.java                        # Abstract class with common student attributes
│   └── Student.java                       # Extends Person, includes total marks logic
│
├── service/
│   ├── StudentOperations.java             # Interface defining all student operations
│   └── StudentService.java                # Implements the logic for operations
│
└── utils/
    └── CustomExceptions.java              # Custom exceptions (invalid marks, duplicate roll)
```

## ⚙️ How to Run

Make sure you are inside the project’s root folder and then compile and run:

### 1. **Compile all classes**:
```bash
javac main/StudentManagementSystem.java
```

### 2. **Run the program**:
```bash
java main.StudentManagementSystem
```

> ✅ **Note**: Ensure your terminal is in the same root directory as the folders (`main`, `model`, `service`, `utils`) when you compile and run.

## 📚 Features Used

### Java Concepts:
- Abstract Classes
- Inheritance
- Interfaces
- Encapsulation
- Custom Exceptions
- Exception Handling
- Java Collections Framework (Stack, Queue, LinkedList)

### DSA Concepts:
- Stack (Undo operation)
- Queue (Result announcement)
- LinkedList (Dynamic storage)
- Sorting using Comparators

---
