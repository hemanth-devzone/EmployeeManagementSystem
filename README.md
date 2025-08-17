# Employee Management System Using Hibernate

This is a desktop Employee Management System built with Java Swing and Hibernate ORM. It allows you to add, view, update, and delete employee records stored in a MySQL database.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Database Setup](#database-setup)
- [Hibernate Configuration](#hibernate-configuration)
- [Build & Run](#build--run)
- [Running Tests](#running-tests)
- [License](#license)

---

## Features

- Add new employees
- View employee details by ID
- Update employee information
- Delete employees
- User-friendly GUI built with Swing
- Hibernate ORM for database operations

---

## Technologies Used

- Java 8+
- Swing (GUI)
- Hibernate ORM 7.0.6
- MySQL Connector/J 9.3.0
- Jakarta Persistence API 3.2.0
- Maven

---

## Project Structure

```
src/
  main/
    java/
      hibernate.cfg.xml
      com/
        kodnest/
          EMSUsingHibernate/
            App.java
            Employee.java
            MainFrame.java
            AddEmployeeFrame.java
            ViewEmployeeFrame.java
            UpdateEmployeeFrame.java
            DeleteEmployeeFrame.java
test/
  java/
    com/
      kodnest/
        EMSUsingHibernate/
          AppTest.java
pom.xml
```

---

## Database Setup

### 1. Create Database

Run this query in your MySQL client:

```sql
CREATE DATABASE (Database_Name);
```

### 2. Create Employee Table

Run this query to create the required table:

```sql
USE (Database_Name);

CREATE TABLE employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    department VARCHAR(50),
    salary INT
);
```

> **Note:** The table will be automatically created if you set `hibernate.hbm2ddl.auto` to `create` or `update` in the hibernate configuration.

---

## Hibernate Configuration

Update `hibernate.cfg.xml` with your MySQL credentials:

```xml
<property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/schema_Name</property>
<property name="hibernate.connection.username">your_username</property>
<property name="hibernate.connection.password">your_password<property>

<property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
<property name="hibernate.show_sql">true</property>
<property name="hibernate.format_sql">true</property>
<property name="hibernate.hbm2ddl.auto">update</property>
```

---

## Build & Run

1. **Clone the repository**  
   `git clone <repo-url>`

2. **Build the project**  
   `mvn clean install`

3. **Run the application**  
   Run the main class:  
   `MainFrame` (`src/main/java/com/kodnest/EMSUsingHibernate/MainFrame.java`)

---

## Running Tests

Unit tests are in `src/test/java/com/kodnest/EMSUsingHibernate/AppTest.java`.  
Run tests with:

```
mvn test
```

---

## License

This project is for educational purposes.

---
