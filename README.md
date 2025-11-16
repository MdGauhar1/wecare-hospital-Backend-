🏥 wEcare Hospital Management System – Backend (Spring Boot)

This is the backend API for wEcare Hospital Management System built using Java Spring Boot 3, Spring Security + JWT, MySQL, and Hibernate/JPA.

🚀 Features

✅ JWT Authentication (Login, protected APIs)

✅ Patient Management (CRUD)

✅ Doctor Management

✅ Hospital Locations & Overview

✅ Specialties API

✅ Appointment Booking API

✅ CORS enabled for Angular frontend

✅ Clean layered architecture

🏗️ Tech Stack

Java 22

Spring Boot 3.5.5

Spring Security + JWT

Spring Data JPA (Hibernate)

MySQL Database

Maven

⚙️ Run Backend
1️⃣ Update application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/wecare
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

2️⃣ Start the Backend
mvn spring-boot:run


Server starts at:
👉 http://localhost:8082

🔑 Authentication APIs
Login
POST /api/auth/login


Body:

{
  "username": "king",
  "password": "1234"
}


Response:

{ "token": "eyJhbGciOi..." }

Register Patient
POST /api/patients/register

👥 Patient APIs
Method	Endpoint	Description
GET	/api/patients	Get all patients
GET	/api/patients/{id}	Get patient by ID
PUT	/api/patients/{id}	Update patient
DELETE	/api/patients/{id}	Delete patient
🧑‍⚕️ Doctor APIs
GET /api/doctors
POST /api/doctors
GET /api/doctors/{id}

📅 Appointment APIs
POST /api/appointments
GET /api/appointments

🔐 Security (JWT)

Public (no login needed):

/api/auth/login
/api/patients/register
/api/hospital/**
/api/doctors/**
/api/specialties/**


Protected (login required):

/api/patients/**
/api/appointments/**


JWT is validated through the custom classes:

JwtUtil.java

JwtAuthenticationFilter.java

SecurityConfig.java

🤝 Frontend

Angular frontend consumes these APIs.
CORS is enabled in SecurityConfig.

📂 Project Structure
src/main/java/com/wecare/
│
├── controller/
├── service/
├── repository/
├── config/        // JWT + Security
├── model/         // Entities
└── dto/

📜 License

Free for personal and learning use.
