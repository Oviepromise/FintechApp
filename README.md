# FintechApp REST API

A secure Fintech backend that simulates wallet operations, built with Java Spring Boot. Designed to understand how modern banking and payment systems work behind the scenes.

### Features
- User registration and authentication
- Create wallet and check balance
- Fund transfer between users
- Transaction history and statements
- Secure validation and error handling

### Tech Stack
- Java 21
- Spring Boot
- Spring Security + JWT
- Spring Data JPA
- MySQL
- Maven

### API Endpoints (example)
- `POST /api/auth/register` - Register new user
- `POST /api/auth/login` - Login and get token
- `GET /api/wallet/balance` - Check wallet balance
- `POST /api/wallet/transfer` - Transfer money
- `GET /api/transactions` - View transaction history

### How to Run
```bash
git clone https://github.com/Oviepromise/FintechApp.git
cd FintechApp
mvn spring-boot:run
