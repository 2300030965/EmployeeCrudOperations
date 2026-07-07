# Employee CRUD Operations

A Full Stack Employee Management System developed using **React.js**, **Spring Boot**, **Java Swing**, **JDBC**, and **MySQL**. The project includes both a modern web application and a desktop GUI application for managing employee records.

---

# 📌 Project Overview

This project demonstrates Employee CRUD (Create, Read, Update, Delete) operations using different Java technologies.

The project contains:

- 🌐 React.js Frontend
- ☕ Spring Boot Backend (REST API)
- 🖥 Java Swing Desktop GUI
- 🗄 MySQL Database

Users can:

- Add Employee
- Update Employee
- Delete Employee
- Search Employee
- View All Employees

---

# 🛠 Technologies Used

## Frontend (Web)

- React.js
- JavaScript (ES6)
- HTML5
- CSS3
- Bootstrap
- Axios
- React Router

## Backend

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- REST API
- Maven

## Desktop GUI

- Java Swing
- AWT
- JTable
- JFrame
- JTextField
- JButton
- JOptionPane
- JDBC

## Database

- MySQL

## Version Control

- Git
- GitHub

---

# ✨ Features

## React Application

- Responsive User Interface
- Employee CRUD Operations
- REST API Integration
- Employee List
- Search Employees

## Spring Boot Backend

- REST APIs
- CRUD Operations
- MySQL Integration
- Exception Handling

## Java Swing GUI

- Add Employee
- Update Employee
- Delete Employee
- Search Employee
- Display All Employees
- JTable Integration
- Duplicate Employee ID Validation
- JDBC Connectivity

---

# 📂 Project Structure

```text
EmplyeeCRUDOperations
│
├── frontend
│   ├── src
│   ├── public
│   ├── package.json
│   └── ...
│
├── backend
│   ├── src
│   ├── pom.xml
│   └── ...
│
├── desktop-gui
│   ├── src
│   │   └── com
│   │       └── employees
│   │            ├── Employee.java
│   │            ├── EmployeeGUI.java
│   │            ├── EmployeeManager.java
│   │            ├── DatabaseHelper.java
│   │            └── Main.java
│   └── ...
│
└── README.md
```

---

# 🗄 Database

Database Name

```sql
employee_db
```

Table

```sql
CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    role VARCHAR(100),
    salary DOUBLE
);
```

---

# 🌐 Spring Boot REST APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | /employees | Get All Employees |
| GET | /employees/{id} | Get Employee By ID |
| POST | /employees | Add Employee |
| PUT | /employees/{id} | Update Employee |
| DELETE | /employees/{id} | Delete Employee |

---

# 🖥 Java Swing GUI

The desktop application provides:

- Employee Registration
- Update Employee Details
- Delete Employee
- Search Employee
- Display Employee Records using JTable
- Clear Form
- MySQL Database Connectivity

GUI Components:

- JFrame
- JTable
- JTextField
- JButton
- JScrollPane
- JPanel
- JOptionPane

---

# 🚀 How to Run

## Clone Repository

```bash
git clone https://github.com/2300030965/EmplyeeCRUDOperations.git
```

---

## Run React Frontend

```bash
cd frontend
npm install
npm start
```

Runs on:

```
http://localhost:3000
```

---

## Run Spring Boot Backend

```bash
cd backend
mvn spring-boot:run
```

Runs on:

```
http://localhost:8080
```

---

## Run Java Swing Application

Open the `desktop-gui` project in Eclipse, IntelliJ IDEA, or NetBeans.

Configure the MySQL database connection in `DatabaseHelper.java`.

Run:

```text
Main.java
```

---

# 📊 Project Workflow

## Web Application

```text
React Frontend
      │
      ▼
Axios HTTP Requests
      │
      ▼
Spring Boot REST API
      │
      ▼
Service Layer
      │
      ▼
JPA Repository
      │
      ▼
MySQL Database
```

## Desktop Application

```text
Java Swing GUI
      │
      ▼
EmployeeManager
      │
      ▼
JDBC
      │
      ▼
MySQL Database
```

---

# 📚 Learning Outcomes

This project helped me understand:

- React.js Development
- Spring Boot Development
- Java Swing GUI Development
- JDBC Connectivity
- REST API Development
- MySQL Database
- Object-Oriented Programming
- CRUD Operations
- MVC Architecture
- Git & GitHub

---

# 🔮 Future Enhancements

- JWT Authentication
- Role-Based Access Control
- Employee Image Upload
- Export to Excel
- Export to PDF
- Dashboard & Analytics
- Pagination
- Search Filters
- Docker Deployment

---

# 👨‍💻 Author

**VASMHI KARTHIK**

**Java Full Stack Developer**

### Technologies

- Java
- Spring Boot
- React.js
- Java Swing
- JDBC
- MySQL
- Git
- GitHub

---

# 📄 License

This project is developed for educational and learning purposes.
