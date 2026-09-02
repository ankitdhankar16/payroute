# Database Connection

**Date:** 2026-09-02  
**Project:** Payroute

## Objective

Configure PostgreSQL as the database for PayRoute and establish a
connection between the Spring Boot application and PostgreSQL.

## Database Configuration

The PostgreSQL connection was configured using Spring Boot's
`application.yml`.

The configuration uses environment variables for database credentials
instead of storing sensitive information directly in the source code.

```yaml
spring:
  application:
    name: payroute

  datasource:
    url: ${DB_URL}
    username: ${DB_USER}
    password: ${DB_PASS}

  jpa:
    hibernate:
      ddl-auto: create
    show-sql: true
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect