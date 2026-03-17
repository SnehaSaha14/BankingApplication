# 🏦 Banking System API

A robust **Spring Boot** based REST API designed to manage banking operations including account creation, deposits, withdrawals, and account management. Built with clean architecture and industry-standard practices. 🚀

![Java](https://img.shields.io/badge/Java-21-orange)
![SpringBoot](https://img.shields.io/badge/SpringBoot-3.x-brightgreen)
![Database](https://img.shields.io/badge/Database-MySQL-blue)
![Postman](https://img.shields.io/badge/Tools-Postman-ff69b4)

---

## 🧠 Overview

The **Banking System API** provides a backend solution for modern digital banking. It allows users to perform core financial transactions securely and efficiently.

**Key Features:**
* ✅ **Account Creation:** Register new users with unique account numbers.
* ✅ **Fund Management:** Seamlessly Deposit and Withdraw money.
* ✅ **Balance Tracking:** Real-time balance updates and account details.
* ✅ **Error Handling:** Global exception handling for invalid transactions.

---

## 🛠 Tech Stack

| Layer | Technology                  |
| :--- |:----------------------------|
| **Backend Framework** | Spring Boot (v3.x)          |
| **Language** | Java 21                     |
| **Database** | MySQL                       |
| **ORM** | Spring Data JPA (Hibernate) |
| **Architecture** | Layered MVC + DTO Pattern   |
| **Build Tool** | Maven                       |

---

## 📁 Project Structure

```text
BankingApplication/
├── src/
│   ├── main/
│   │   ├── java/com/bankingsystem/bankingapp/
│   │   │   ├── controller/    # REST Endpoints
│   │   │   ├── service/       # Business Logic
│   │   │   ├── repository/    # Database Access
│   │   │   ├── entity/        # JPA Entities
│   │   │   ├── dto/           # Data Transfer Objects
│   │   │   └── mapper/        # Entity-DTO Mappers
│   └── resources/
│       └── application.properties
├── postman/                   # API Collection JSON
└── pom.xml

🌐 API Endpoints

🏦 Account Management
 Method | Endpoint             | Description          |
 POST   | /api/accounts        | Create a new account |
 GET    | /api/accounts/{id}   | Get account details  |
 GET    | /api/accounts        | Get all accounts     |
 DELETE | /api/accounts/{id}   | Delete an account    |

💸 Transactions
 Method | Endpoint                      | Description    |
 PUT    | /api/accounts/{id}/deposit    | Deposit money  |
 PUT    | /api/accounts/{id}/withdraw   | Withdraw money |

🚀 Getting Started
 1️⃣ Clone the Repository
git clone https://github.com/SnehaSaha14/BankingApplication.git
cd BankingApplication
```
2️⃣ Configure Database

Update`src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/banking_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 3️⃣ Run the Application

```bash
mvn spring-boot:run
```

OR run `BankingApplication.java` from your IDE.

---

## 🧪 Testing with Postman

✔ Import the Postman collection from `/postman` folder
✔ Ensure the server is running at:

```
http://localhost:8000
```

✔ Test endpoints like:

```
GET /api/accounts
POST /api/accounts
```

---



## 🎯 Why This Project Stands Out

✔ Industry-level **layered architecture** ,
✔ Clean implementation of **DTO pattern** , 
✔ Proper **REST API design principles**, 
✔ Handles **financial transactions logic**, 
✔ Strong foundation in **Spring Boot + MySQL**

---

## 🔒 Future Improvements

* 🔐 Add JWT Authentication & Authorization
* 📜 Transaction History Tracking
* ☁️ Deploy on AWS
* 🔄 Add Transfer Between Accounts

---

## 👩‍💻 Author

**Sneha Saha**
📚 BCA Student @ MAKAUT
💻 Tech Enthusiast | Java & Spring Boot Enthusiast |
🚀 Passionate about building scalable REST APIs

---

## 🌐 Connect With Me

[![GitHub](https://img.shields.io/badge/GitHub-Follow-black?style=for-the-badge\&logo=github)](https://github.com/SnehaSaha14)

---

