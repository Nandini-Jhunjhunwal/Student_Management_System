# Student Management System (Console-Based)

A Java console application to manage student records. This system demonstrates core Java concepts and DSA techniques including OOP (abstraction, inheritance), exception handling, interface implementation, and usage of data structures like Stack, Queue, and LinkedList — all wrapped in a package-structured format.

---

## 📁 Project Structure

```
StudentManagementSystem/
├── main/
│   └── StudentManagementSystem.java       # Entry point with menu-driven interface
├── model/
│   ├── Person.java                        # Abstract base class
│   └── Student.java                       # Inherits from Person, contains student details
├── service/
│   ├── StudentOperations.java             # Interface defining student-related actions
│   └── StudentService.java                # Implements business logic and operations
├── utils/
│   └── CustomExceptions.java              # Custom exception classes for input validation
```

---

## 💡 Features

- ✅ Add new student with marks validation
- 📋 Display all students
- 🔍 Search student by roll number
- ✏️ Update student marks
- 🗑️ Delete student records
- 🔁 Undo last addition (using `Stack`)
- 📣 Announce results (using `Queue`)
- 📊 Sort students by total marks (descending)
- ❗ Custom exception handling for invalid marks and duplicate roll numbers
- 📦 Package-structured for modular design
- 🧠 Uses core DSA concepts (`Stack`, `Queue`, `LinkedList`)

---

## 🚀 How to Run

1. **Compile the project** (from root directory):
   ```bash
   javac main/StudentManagementSystem.java
   ```

2. **Run the application**:
   ```bash
   java main.StudentManagementSystem
   ```

> Make sure you run these from the **root** directory where `main/`, `model/`, etc., are located.

---

## 🔧 Prerequisites

- JDK 17 or later installed
- Console / terminal access
- No external libraries or database required

---

## 👩‍💻 Author

**Nandini Jhunjhunwal**  
2nd-year B.Tech CSE student  
Focused on mastering backend development with practical, hands-on projects.
