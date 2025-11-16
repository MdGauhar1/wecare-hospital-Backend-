# 🏥 wEcare Hospital Management System – Backend (Spring Boot)

This is the backend REST API for the **wEcare Hospital Management System**, built using **Spring Boot 3**, **Spring Security with JWT**, **MySQL**, and **Hibernate/JPA**.

The system provides secure authentication, patient and doctor management, appointment booking, and hospital-related information for the Angular frontend.

---

## 🚀 Features

- ✅ **JWT Authentication** (Login + token validation + secured routes)  
- ✅ **Patient Management** (Create, update, delete, list)  
- ✅ **Doctor Management** (Add doctors, list specialities)  
- ✅ **Hospital Overview API** (Locations, departments, info)  
- ✅ **Medical Specialties API**  
- ✅ **Appointment Booking APIs**  
- ✅ **CORS Enabled** for Angular frontend communication  
- ✅ **Layered architecture** (Controller → Service → Repository)  
- ✅ **MySQL + JPA + Hibernate** ORM  

---

## 🏗️ Tech Stack

| Component        | Technology            |
|------------------|------------------------|
| Language         | Java 22                |
| Framework        | Spring Boot 3.5.5      |
| Security         | Spring Security 6 + JWT|
| Database         | MySQL 8                |
| ORM              | JPA / Hibernate        |
| Build Tool       | Maven                  |

---

## ⚙️ Running the Backend

### **1️⃣ Configure `application.properties`**

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/wecare
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8082
