# Core Banking System

A banking management system built with Java Spring Boot and MySQL.

## Features (In Progress)
- ✅ Customer management entity
- 🚧 Account operations
- 🚧 Money transfers with ACID compliance
- 🚧 Transaction ledger tracking
- 🚧 Comprehensive audit logs
- 🚧 Deposit/Withdrawal operations

## Tech Stack
- **Backend:** Java 21, Spring Boot 4.0.2
- **Database:** MySQL 8.0.45
- **Build Tool:** Maven
- **ORM:** JPA/Hibernate

## Database Schema
8 normalized tables:
- CUSTOMER - Customer information
- ACCOUNT_TYPE - Savings/Current account configurations
- ACCOUNT - Customer accounts with balances
- TRANSFER - Internal money transfers
- TRANSACTION - All debit/credit transactions
- LEDGER - Running balance history
- AUDIT_LOG - Complete change tracking
- DEPOSIT_WITHDRAWAL - ATM/Branch/Online operations

## Project Structure
```
src/
├── main/
│   ├── java/com/banking/corebanking/
│   │   ├── entity/          # JPA entity classes
│   │   ├── repository/      # Data access layer
│   │   ├── service/         # Business logic (coming soon)
│   │   └── controller/      # REST APIs (coming soon)
│   └── resources/
│       └── application.properties
```

## Status
🚧 **Under Development** 
