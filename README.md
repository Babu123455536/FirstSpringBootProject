# Student Management System

A full-stack Student Management System built using **Java, Spring Boot, Spring Data JPA, MySQL, HTML, CSS, and JavaScript**.

The application provides REST APIs to manage student records with features such as CRUD operations, search, filtering, sorting, pagination, validation, exception handling, and Swagger API documentation.

---

## 🚀 Features

- Add new students
- View all students
- View student by ID
- Update student details
- Delete students
- Search students by name
- Filter students by course
- Advanced filtering
- Pagination
- Sorting
- Input validation
- Global exception handling
- RESTful APIs
- Swagger API documentation
- Responsive web interface

---

## 🛠️ Technologies Used

### Backend

- Java 21
- Spring Boot
- Spring Data JPA
- REST API
- Maven

### Database

- MySQL

### Frontend

- HTML5
- CSS3
- JavaScript

### API Documentation

- Swagger / OpenAPI

### Version Control

- Git
- GitHub

---

## 📂 Project Structure

```text
FirstSpringBootProject
│
├── .mvn
│   └── wrapper
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── [Java Packages]
│   │   │       ├── Student.java
│   │   │       ├── StudentRepository.java
│   │   │       ├── StudentJsonController.java
│   │   │       └── ...
│   │   │
│   │   └── resources
│   │       ├── static
│   │       │   ├── index.html
│   │       │   ├── students.html
│   │       │   ├── add-student.html
│   │       │   └── css
│   │       │       └── style.css
│   │       │
│   │       └── application.properties
│   │
│   └── test
│
├── .gitattributes
├── .gitignore
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```
🔗 REST API Endpoints
Method	Endpoint	Description
GET	/students	Get all students
GET	/students/{id}	Get student by ID
POST	/students	Add a new student
PUT	/students/{id}	Update student
DELETE	/students/{id}	Delete student
GET	/students/search	Search students
GET	/students/page	Get paginated students
GET	/students/filter	Filter students
GET	/students/filter-advanced	Advanced filtering
GET	/students/course	Get students by course
🗄️ Database

This project uses MySQL as the database.

Student records contain:

Student ID
Student Name
Course
⚙️ How to Run
1. Clone the Repository
git clone https://github.com/Babu123455536/FirstSpringBootProject.git
2. Open the Project

Open the project using:

Eclipse
Spring Tool Suite
VS Code
IntelliJ IDEA
3. Configure MySQL

Update the database details in:

application.properties

Example:

spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Replace YOUR_PASSWORD with your own MySQL password.

4. Run the Application

Run the Spring Boot application from your IDE.

Or use:

mvn spring-boot:run
🧪 API Testing

The REST APIs can be tested using:

Swagger UI
Postman
Browser
curl

Example POST request:

{
  "name": "Ravi",
  "course": "Java Full Stack"
}
📖 Swagger API Documentation

After starting the application, open:

http://localhost:8080/swagger-ui/index.html

Swagger UI can be used to view and test the available REST APIs.

The port may be different if it is configured differently in application.properties.

🎯 Learning Outcomes

This project demonstrates practical knowledge of:

Java
Spring Boot
REST API development
Spring Data JPA
MySQL database integration
CRUD operations
DTOs
Validation
Exception handling
Pagination
Sorting
Filtering
Git and GitHub
👨‍💻 Author

B. Baburao

GitHub: https://github.com/Babu123455536

📄 License

This project is created for learning and portfolio purposes.