# Employee Management System Using Hibernate

This is a desktop Employee Management System built with Java Swing and Hibernate ORM. It allows you to add, view, update, and delete employee records stored in a MySQL database.

## Features

- Add new employees
- View employee details by ID
- Update employee information
- Delete employees
- User-friendly GUI built with Swing
- Hibernate ORM for database operations

## Technologies Used

- Java 8+
- Swing (GUI)
- Hibernate ORM
- MySQL
- Maven

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
    email VARCHAR(100) NOT NULL,
    department VARCHAR(50),
    salary DOUBLE
);
```

> **Note:** If your `Employee` entity has different fields, adjust the table definition accordingly.

## Hibernate Configuration

Update `hibernate.cfg.xml` with your MySQL credentials:

```xml
<property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/Database_Name</property>
<property name="hibernate.connection.username">Your_Username</property>
<property name="hibernate.connection.password">Your_password</property>
```

## Build & Run

1. **Clone the repository**  
   `git clone <repo-url>`

2. **Build the project**  
   `mvn clean install`

3. **Run the application**  
   Run the main class:  
   `MainFrame` (`src/main/java/com/kodnest/EMSUsingHibernate/MainFrame.java`)

## Running Tests

Unit tests are in `src/test/java/com/kodnest/EMSUsingHibernate/AppTest.java`.  
Run tests with:

```
mvn test
```

## License

This project is for educational purposes.

---

**Author:**
