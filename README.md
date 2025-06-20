# 🛡️ Spring Boot JWT Authentication with Role-Based Access Control

A secure REST API built with **Spring Boot**, implementing **JWT (JSON Web Token)** based authentication and **role-based authorization**. It allows users to register, log in, and access endpoints based on their assigned roles (e.g., `USER`, `ADMIN`).

---

## 🚀 Features

* ✅ User Registration and Login
* 🔐 Password hashing with BCrypt
* 🪪 JWT Token generation and validation
* 👥 Role-based access control
* ⛔ Secured endpoints (e.g., `/admin`, `/user`)
* 🌐 Stateless session (no server-side sessions)
* 🧪 Easy to test with `curl` or Postman

---

## 📆 API Endpoints

### Public

| Method | Endpoint             | Description              |
| ------ | -------------------- | ------------------------ |
| POST   | `/api/auth/register` | Register a new user      |
| POST   | `/api/auth/login`    | Authenticate and get JWT |

### Protected – Requires JWT

| Method | Endpoint          | Role Required |
| ------ | ----------------- | ------------- |
| GET    | `/api/user/info`  | USER or ADMIN |
| GET    | `/api/admin/info` | ADMIN only    |

---

## 🛠️ Tech Stack

* Java 21
* Spring Boot 3.x
* Spring Security
* JWT (jjwt or java-jwt)
* H2 / PostgreSQL / MySQL
* Maven

---

## ⚙️ Running the Project

1. Clone the repo:

   ```bash
   git clone https://github.com/nick0411/Spring-Boot-JWT-Authentication-with-Role-Based-Access-Control.git
   
   cd Spring-Boot-JWT-Authentication-with-Role-Based-Access-Contro
   ```

2. Configure database and JWT secret in `application.properties` or `application.yml`.

3. Run the application:

   ```bash
   ./mvnw spring-boot:run
   ```

4. Use `curl` or Postman to test the endpoints.

---

## 🧪 Example Usage (with curl)

### Register

```bash
curl -X POST http://localhost:8080/api/auth/register \
  -H "Content-Type: application/json" \
  -d '{"username": "john", "email": "john@example.com", "password": "password"}'
```

### Login

```bash
curl -X POST http://localhost:8080/api/auth/login \
  -H "Content-Type: application/json" \
  -d '{"username": "john", "password": "password"}'
```

> The response contains the JWT token. Use it in subsequent requests:

```bash
curl -H "Authorization: Bearer <your-token>" http://localhost:8080/api/user/info
```

---

## 🧱 Project Structure

```
src
└── main
    ├── java
    │   └── com.example.auth
    │       ├── controller
    │       ├── config
    │       ├── security
    │       ├── model
    │       ├── repository
    │       └── service
    └── resources
        └── application.properties
```

---

## 🔐 Roles and Access

| Role  | Permissions                     |
| ----- | ------------------------------- |
| USER  | Access user-level APIs          |
| ADMIN | Access both user and admin APIs |

Roles are assigned during registration or updated via admin functions.

---

## 🧑‍💻 Author

**Nick**
[GitHub](https://github.com/nick0411)


## 📄 License

MIT License — free to use and modify.

---

## 🤝 Contributing

PRs welcome! Feel free to submit issues or suggest features.

---
