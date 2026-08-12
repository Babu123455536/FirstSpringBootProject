# 🎓 Student Management System

A full-stack Student Management System developed using Java, Spring Boot, MySQL, HTML, CSS and JavaScript.

## 🚀 Features

- 🔐 Admin Login
- 📊 Dashboard
- ➕ Add Student
- 👨‍🎓 View Students
- ✏️ Edit Student
- 🗑️ Delete Student
- 🔍 Search Students
- 🎯 Filter Students
- 📄 Pagination
- ↕️ Sorting
- 🔗 REST APIs
- 📚 Swagger API Documentation
- 📱 Responsive UI
- 🔄 Dashboard Refresh
- 🕒 Recent Students
- 🔧 Git & GitHub Version Control

## 🛠️ Technologies Used

### Backend
- Java
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

### Tools
- Eclipse
- VS Code
- Git
- GitHub

## 📂 Project Structure

```text
FirstSpringBootProject
│
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── ...
│       │
│       └── resources
│           ├── static
│           │   ├── css
│           │   │   └── style.css
│           │   ├── index.html
│           │   ├── login.html
│           │   ├── students.html
│           │   ├── add-student.html
│           │   └── ...
│           │
│           └── application.properties
│
├── screenshots
│   ├── login.png
│   ├── dashboard.png
│   ├── student.png
│   ├── add-student.png
│   └── swagger.png
│
├── pom.xml
├── README.md
└── .gitignore

## 🔗 REST API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/students` | Get all students |
| GET | `/students/{id}` | Get student by ID |
| POST | `/students` | Add new student |
| PUT | `/students/{id}` | Update student |
| DELETE | `/students/{id}` | Delete student |
| GET | `/students/search` | Search students |
| GET | `/students/page` | Pagination |
| GET | `/students/filter` | Filter students |
| GET | `/students/filter-advanced` | Advanced filtering |
| GET | `/students/course` | Search students by course |

## 📸 Screenshots

### 🔐 Login Page

<img src="./screenshots/login.png" alt="Login Page" width="800">

### 📊 Dashboard

<img src="./screenshots/dashboard.png" alt="Dashboard" width="800">

### 👨‍🎓 Student List

<img src="./screenshots/student.png" alt="Student List" width="800">

### ➕ Add Student

<img src="./screenshots/add-student.png" alt="Add Student" width="800">

### 📚 Swagger API

<img src="./screenshots/swagger.png" alt="Swagger API" width="800">

## ▶️ How to Run

### Step 1: Clone the Repository

```bash
git clone https://github.com/Babu123455536/FirstSpringBootProject.git