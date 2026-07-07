<<<<<<< HEAD
# Getting Started with Create React App

This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).

## Available Scripts

In the project directory, you can run:

### `npm start`

Runs the app in the development mode.\
Open [http://localhost:3000](http://localhost:3000) to view it in your browser.

The page will reload when you make changes.\
You may also see any lint errors in the console.

### `npm test`

Launches the test runner in the interactive watch mode.\
See the section about [running tests](https://facebook.github.io/create-react-app/docs/running-tests) for more information.

### `npm run build`

Builds the app for production to the `build` folder.\
It correctly bundles React in production mode and optimizes the build for the best performance.

The build is minified and the filenames include the hashes.\
Your app is ready to be deployed!

See the section about [deployment](https://facebook.github.io/create-react-app/docs/deployment) for more information.

### `npm run eject`

**Note: this is a one-way operation. Once you `eject`, you can't go back!**

If you aren't satisfied with the build tool and configuration choices, you can `eject` at any time. This command will remove the single build dependency from your project.

Instead, it will copy all the configuration files and the transitive dependencies (webpack, Babel, ESLint, etc) right into your project so you have full control over them. All of the commands except `eject` will still work, but they will point to the copied scripts so you can tweak them. At this point you're on your own.

You don't have to ever use `eject`. The curated feature set is suitable for small and middle deployments, and you shouldn't feel obligated to use this feature. However we understand that this tool wouldn't be useful if you couldn't customize it when you are ready for it.

## Learn More

You can learn more in the [Create React App documentation](https://facebook.github.io/create-react-app/docs/getting-started).

To learn React, check out the [React documentation](https://reactjs.org/).

### Code Splitting

This section has moved here: [https://facebook.github.io/create-react-app/docs/code-splitting](https://facebook.github.io/create-react-app/docs/code-splitting)

### Analyzing the Bundle Size

This section has moved here: [https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size](https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size)

### Making a Progressive Web App

This section has moved here: [https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app](https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app)

### Advanced Configuration

This section has moved here: [https://facebook.github.io/create-react-app/docs/advanced-configuration](https://facebook.github.io/create-react-app/docs/advanced-configuration)

### Deployment

This section has moved here: [https://facebook.github.io/create-react-app/docs/deployment](https://facebook.github.io/create-react-app/docs/deployment)

### `npm run build` fails to minify

This section has moved here: [https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify](https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify)
=======
# Employee CRUD Operations

A Java Full Stack Desktop Application developed using **Java Swing**, **JDBC**, and **MySQL** to perform Employee Management System operations.

The application allows users to manage employee records through a graphical user interface with complete CRUD (Create, Read, Update, Delete) functionality.

---

# Project Overview

This project demonstrates how Java Swing can be integrated with a MySQL database using JDBC.

The application provides a user-friendly interface where users can:

- Add Employee
- Update Employee
- Delete Employee
- Search Employee
- View All Employees

The data is permanently stored in a MySQL database.

---

# Technologies Used

### Frontend

- Java Swing
- AWT
- JTable
- JFrame
- JTextField
- JButton
- JOptionPane

### Backend

- Core Java
- JDBC (Java Database Connectivity)
- MySQL Database
- Object-Oriented Programming (OOP)

---

# Features

✅ Add New Employee

- Employee ID
- Employee Name
- Employee Role
- Employee Salary

---

✅ Update Employee

Modify employee details using Employee ID.

---

✅ Delete Employee

Delete an employee record permanently.

---

✅ Search Employee

Search employee using Employee ID.

---

✅ Display Employees

Display all employees inside JTable.

---

✅ Duplicate ID Validation

The system prevents duplicate employee IDs.

---

✅ Database Connectivity

All employee data is stored inside MySQL.

---

# Project Structure

```
EmployeeCRUDOperations
│
├── src
│   └── com
│       └── employees
│            │
│            ├── Employee.java
│            ├── EmployeeGUI.java
│            ├── EmployeeManager.java
│            ├── DatabaseHelper.java
│            └── Main.java
│
├── README.md
└── employee_db.sql
```

---

# Database

Database Name

```
employee_db
```

Table Name

```
employees
```

Create Table

```sql
CREATE TABLE employees(

id INT PRIMARY KEY,

name VARCHAR(100),

role VARCHAR(100),

salary DOUBLE

);
```

---

# Screens

The GUI contains

- Employee ID
- Employee Name
- Employee Role
- Employee Salary

Buttons

- Add
- Update
- Delete
- Search
- Show All
- Clear

Table

- ID
- Name
- Role
- Salary

---

# JDBC Connection

Example Connection

```java
String url = "jdbc:mysql://localhost:3306/employee_db";
String username = "root";
String password = "your_password";

Connection con = DriverManager.getConnection(url, username, password);
```

---

# How to Run

## Step 1

Clone Repository

```bash
git clone https://github.com/yourusername/EmployeeCRUDOperations.git
```

---

## Step 2

Open Project

Open the project in

- Eclipse
- IntelliJ IDEA
- NetBeans

---

## Step 3

Create Database

Create

```
employee_db
```

Import

```
employee_db.sql
```

---

## Step 4

Update DatabaseHelper.java

Change

```java
username
password
database name
```

according to your MySQL configuration.

---

## Step 5

Add MySQL JDBC Driver

Download

```
mysql-connector-j
```

Add it to your project build path.

---

## Step 6

Run

Run

```
Main.java
```

---

# Project Workflow

```
User

↓

Java Swing GUI

↓

EmployeeManager

↓

JDBC

↓

MySQL Database

↓

Return Result

↓

GUI Updates JTable
```

---

# Object-Oriented Concepts Used

- Classes
- Objects
- Constructors
- Encapsulation
- Getters & Setters
- ArrayList
- Iterators
- Exception Handling

---

# CRUD Operations

### Create

Insert new employee into database.

### Read

Load all employees from MySQL.

### Update

Modify employee information.

### Delete

Remove employee from database.

---

# Future Enhancements

- Login Authentication
- Admin Dashboard
- Search by Name
- Filter Employees
- Employee Photo
- Export to Excel
- Export to PDF
- Pagination
- Salary Statistics
- Charts
- Dark Theme

---

# Learning Outcomes

This project helped in understanding:

- Java Swing GUI Development
- Event Handling
- JTable
- JDBC
- SQL Queries
- MySQL Integration
- Object-Oriented Programming
- CRUD Operations
- Exception Handling
- Desktop Application Development

---

# Author

**VASMHI KARTHIK**

Java Full Stack Developer

---

# License

This project is developed for educational and learning purposes.
>>>>>>> 2b6cc8fec0dbfb91c5962c6c87e667388e08844d
