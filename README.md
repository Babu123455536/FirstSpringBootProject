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
├── src
│   ├── main
│   │   ├── java
│   │   │   └── ...
│   │   └── resources
│   │       ├── static
│   │       └── application.properties
│   │
│   └── test
│
├── .gitignore
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
---

## 🔗 REST API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/students` | Get all students |
| GET | `/students/{id}` | Get student by ID |
| POST | `/students` | Add a new student |
| PUT | `/students/{id}` | Update student |
| DELETE | `/students/{id}` | Delete student |
| GET | `/students/search` | Search students |
| GET | `/students/page` | Get paginated students |
| GET | `/students/filter` | Filter students |
| GET | `/students/filter-advanced` | Advanced filtering |
| GET | `/students/course` | Get students by course |

---

## 🗄️ Database

This project uses **MySQL** as the database.

The student records contain:

- Student ID
- Student Name
- Course

---

## ⚙️ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/Babu123455536/FirstSpringBootProject.git