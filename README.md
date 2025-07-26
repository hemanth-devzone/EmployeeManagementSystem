# Employee Management System Using Hibernate

This is a simple desktop Employee Management System built with Java Swing and Hibernate ORM. It allows you to add, view, update, and delete employee records stored in a MySQL database.

## Features

- Add new employees
- View employee details by ID
- Update employee information
- Delete employees
- User-friendly GUI built with Swing
- Hibernate ORM for database operations

## Technologies Used

- Java 8
- Swing (GUI)
- Hibernate ORM
- MySQL
- Maven (for dependency management)

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

## Setup Instructions

1. **Clone the repository**  
   `git clone <repo-url>`

2. **Configure MySQL**  
   - Create a database named `febhibernate`.
   - Update `hibernate.cfg.xml` with your MySQL credentials if needed.

3. **Build the project**  
   - Run:  
     `mvn clean install`

4. **Run the application**  
   - Execute the main class:  
     `MainFrame` ([src/main/java/com/kodnest/EMSUsingHibernate/MainFrame.java](src/main/java/com/kodnest/EMSUsingHibernate/MainFrame.java))

## Database Configuration

The Hibernate configuration file ([src/main/java/hibernate.cfg.xml](src/main/java/hibernate.cfg.xml)) contains:

```xml
<property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/febhibernate</property>
<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password">admin</property>
```

Change these properties as per your MySQL setup.

## Running Tests

Unit tests are located in [src/test/java/com/kodnest/EMSUsingHibernate/AppTest.java](src/test/java/com/kodnest/EMSUsingHibernate/AppTest.java).  
Run tests with:

```
mvn test
```

## License

This project is for educational
