# Hibernate ORM Demo Project

This repository demonstrates the use of **Hibernate ORM** for performing database operations in a Java application. It includes setup, entity mapping, relationship handling, and different fetching strategies such as **lazy loading**, **eager loading**, and **join fetching**.

---

## 📘 What is Hibernate?

**Hibernate** is a powerful Java framework used for **Object-Relational Mapping (ORM)**. It simplifies the development of Java applications that interact with relational databases by automatically mapping Java classes to database tables.

---

## 🚀 Features of Hibernate

- ✅ **ORM-based Data Persistence** – Maps Java objects to database tables without SQL.
- ✅ **Automatic Table Generation** – Creates tables and relationships based on entity classes.
- ✅ **Database Independence** – Switch databases with minimal code changes.
- ✅ **HQL (Hibernate Query Language)** – Object-oriented query language similar to SQL.
- ✅ **Annotation and XML Support** – Flexible configuration options.
- ✅ **Transaction Management** – Integrates with JTA and Spring for declarative transactions.
- ✅ **Caching** – Built-in support for first-level and second-level caches.
- ✅ **Fetching Strategies** – Lazy, eager, batch, and join fetching for optimized data access.

---

## 🛠️ Technologies Used

| Technology      | Description                        |
|-----------------|------------------------------------|
| Java            | Backend programming language       |
| Hibernate ORM   | ORM framework                      |
| MySQL / H2 DB   | Relational database                |
| Maven / Gradle  | Dependency and build management    |
| JUnit           | Unit testing                       |
| SLF4J / Log4j   | Logging                            |

---

## ✅ Merits of Hibernate

1. **Reduces Boilerplate Code** – No need to write repetitive JDBC code.
2. **Database Portability** – Works with various databases like MySQL, PostgreSQL, Oracle, etc.
3. **Improved Productivity** – HQL, annotations, and auto table generation save time.
4. **Built-in Caching** – Boosts performance using caching mechanisms.
5. **Supports Relationships** – Easy mapping for One-to-One, One-to-Many, Many-to-Many.

---

## ❌ Demerits of Hibernate

1. **Learning Curve** – Requires understanding of ORM and annotations.
2. **Overhead for Small Projects** – More complex than plain JDBC for basic CRUD.
3. **Lazy Loading Issues** – May throw `LazyInitializationException` if misused.
4. **Debugging Difficulty** – HQL and auto-generated queries can be harder to debug.

---

## ⚡ Loading Techniques in Hibernate

Hibernate provides multiple strategies to control how data is fetched from the database:

### 1. **Lazy Loading** (Default)

- Data is loaded **on-demand**.
- Example:
  ```java
  @OneToMany(fetch = FetchType.LAZY)
  private List<Order> orders;
