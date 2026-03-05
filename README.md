# AE Transaction System

A full-stack financial transaction platform built with Spring Boot and vanilla JavaScript. Supports both fiat bank transfers and crypto transfers with a real authentication system.

![Java](https://img.shields.io/badge/Java-17-orange) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.2-green) ![H2](https://img.shields.io/badge/Database-H2-blue) ![Security](https://img.shields.io/badge/Spring%20Security-BCrypt-red)

## Features

- **REST API** — full CRUD endpoints for transactions built with Spring Boot
- **Persistent Database** — H2 file-based database that survives app restarts
- **Authentication** — real register/login system with BCrypt password hashing via Spring Security
- **Bank Transfers** — send USD transfers between users with instant processing
- **Crypto Bridge** — swap between BTC, ETH, SOL, and USDC with live exchange rate calculations
- **Dark/Light Mode** — animated sun/moon theme toggle
- **Responsive UI** — works on desktop and mobile

## Tech Stack

| Layer | Technology |
|-------|-----------|
| Backend | Java 17, Spring Boot 4.0.2 |
| Security | Spring Security, BCrypt |
| Database | H2 (file-based persistence) |
| ORM | Spring Data JPA, Hibernate |
| Frontend | HTML, CSS, Vanilla JavaScript |
| Build | Maven |

## Getting Started

### Prerequisites
- Java 17+
- Maven (or use the included `mvnw` wrapper)

### Run the app

```bash
git clone https://github.com/AhmedGElnaggar/transaction-system.git
cd transaction-system
./mvnw spring-boot:run
```

Then open `http://localhost:8081` in your browser.

### API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/auth/register` | Register a new user |
| POST | `/auth/login` | Login with username and password |
| POST | `/transactions` | Create a new transaction |
| GET | `/transactions` | Get all transactions |
| GET | `/transactions/{id}` | Get transaction by ID |

### Example Request

```bash
curl -X POST http://localhost:8081/transactions \
  -H "Content-Type: application/json" \
  -d '{"sender":"Ahmed","receiver":"John","amount":500}'
```

## Project Structure

```
src/main/java/com/ahmed/transactionsystem/
├── controller/
│   ├── AuthController.java
│   └── TransactionController.java
├── model/
│   ├── Transaction.java
│   └── User.java
├── repository/
│   ├── TransactionRepository.java
│   └── UserRepository.java
├── service/
│   ├── TransactionService.java
│   └── UserService.java
└── SecurityConfig.java
```

## Ahmed Elnaggar

**Ahmed Elnaggar**  
[LinkedIn](https://www.linkedin.com/in/ahmeddnaggar) • [GitHub](https://github.com/AhmedGElnaggar) • [Instagram](https://www.instagram.com/a7md.gm/)
