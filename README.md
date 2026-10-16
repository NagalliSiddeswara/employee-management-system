# Employee Management System

A RESTful backend application developed using Java, Spring Boot,
Spring Data JPA, Hibernate, and MySQL.

The application provides APIs for managing employee information
and performing CRUD operations.

## Technologies Used

- Java 21
- Spring Boot 4.1.1
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- REST APIs
- Git and GitHub

## Features

- Add new employees
- Retrieve all employees
- Retrieve employee details by ID
- Update employee information
- Delete employee records
- Search employees by department
- Employee data persistence using MySQL
- RESTful API architecture
- Exception handling

## Project Structure

src/main/java/com/ems/employee_management/
├── EmployeeManagementApplication.java
├── controller/
│   └── EmployeeController.java
├── entity/
│   └── Employee.java
├── repository/
│   └── EmployeeRepository.java
└── service/
    └── EmployeeService.java

## REST API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/employees | Get all employees |
| GET | /api/employees/{id} | Get employee by ID |
| POST | /api/employees | Add employee |
| PUT | /api/employees/{id} | Update employee |
| DELETE | /api/employees/{id} | Delete employee |

## Database Configuration

The application uses MySQL.

Database name:

employee_management

Configure the database connection in
src/main/resources/application.properties.

Set the DB_PASSWORD environment variable to your
local MySQL password.

Do not commit database credentials to GitHub.

## Running the Application

1. Install Java 21 and MySQL.
2. Create a MySQL database named employee_management.
3. Configure the DB_PASSWORD environment variable.
4. Open the project in Eclipse or another Java IDE.
5. Run the Spring Boot application using Maven:

   mvn spring-boot:run

6. Access the API at:

   http://localhost:8081/api/employees

## Author

Nagalli Siddeswara

GitHub: https://github.com/NagalliSiddeswara
