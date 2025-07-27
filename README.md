# 🛠️ Hibernate CRUD Operations – Employee Management

A Java-based CRUD (Create, Read, Update, Delete) application built using **Hibernate ORM**, performing operations on an `Employee` table connected to a **MySQL database** (configured via MySQL Workbench). This project demonstrates how to use Hibernate for managing persistent employee data in a relational database.

---

## 📂 Project Overview

This application allows you to:

- ➕ Add new employees
- 🔍 Retrieve all employees
- ✏️ Update employee details
- ❌ Delete employees

Hibernate handles the object-relational mapping (ORM) to keep your Java objects in sync with the relational database.

---

## ⚙️ Technologies Used

| Technology       | Description                         |
|------------------|-------------------------------------|
| 🧑‍💻 Java          | Core programming language           |
| 🏗️ Hibernate      | ORM framework for database access   |
| 🐬 MySQL          | Relational database (via Workbench) |
| 📦 Maven/Gradle   | Dependency management               |
| 📑 JDBC Driver    | MySQL Connector/J for connectivity  |

---

## 🧾 Database Schema

**Database Name:** `employee_db`  
**Table Name:** `employee`

```sql
CREATE TABLE employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    department VARCHAR(100),
    salary DOUBLE
);
