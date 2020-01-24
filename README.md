# SpringBoot | Rest | MVC | JPA | H2
**************************************************************************************************************************************
The main page will let you enter the employee information and store it in memory database H2. And you can retrieve that information by typing in "localhost:8080/employeesdb"
**************************************************************************************************************************************

This project includes:

- Employee class is used to declare objects that can be used to stored data in the H2 database

- EmployeeController class maps the url entered by the user to their respetive methods
such as default homepage with "/" and "/addEmployee" for form submit button.

- EmployeeRepo is an interface where it extends CRUDRepository to handle CRUD operations such as Create, Read, Update and Delete. But, in this project we are only Creating and Reading data it in this case.

- MainResource uses RestController and has two methods:
1) getEmployees has hardwired information of the employees which can be displayed when user types in "localhost:8080/employees"
2) getEmployeesdb retrieves data from H2 database which can be displayed when user types in "localhost:8080/employeesdb"

- application.properties file I have enabled H2 database, made H2 database as a platform and defined the database name 'restdb'.

- data.sql file has pre-defined information of one employee that will be inserted into the Employee table in H2 database during runtime.

- home.jsp contains form that is used to send an employee's data to the H2 database


**************************************************************************************************************************************
**************************************************************************************************************************************

Instructions:
1) "localhost:8080" will give you the form to enter the employee's information (uses @controller annotation)
2) "localhost:8080/employeesdb" will display the updated table as entered in the step 1 (uses @RestController annotation)
3) "localhost:8080/employees" will display the hardwired employee's information in the program

In this project I have used dependencies such as Web Starter, H2 and Tomcat Jasper.
