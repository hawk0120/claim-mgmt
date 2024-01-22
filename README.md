# Claim Management System

A simple Java-based Claim Management System to manage and track insurance claims. This project utilizes Spring Boot for the backend, PostgreSQL for data storage, and provides RESTful API endpoints for claim creation, resolution, and retrieval.

## Features

- **Claim Creation:** Users can create new insurance claims by providing a description.
- **Claim Resolution:** Claims can be marked as resolved, indicating that the issue has been addressed.
- **Claim Retrieval:** Retrieve a list of all claims, including their status and descriptions.

### Prerequisites

Before running the application, make sure you have the following installed:

- Java Development Kit (JDK)
- Maven (for building the project)
- PostgreSQL (for data storage)


### Installation

To build the project, run the following command in bash:
`./mvnw clean package`

### Configuration
Ensure that your PostgreSQL database is configured, and update the database connection details in application.properties:
`spring.datasource.url=jdbc:postgresql://localhost:5432/'DATABASE'
spring.datasource.username='YOUR_USERNAME'
spring.datasource.password='YOUR_PASSWORD'
spring.jpa.hibernate.ddl-auto=update`

### Usage
Start the application using:
`./mvnw spring-boot:run`

The application will be available at http://localhost:8080.

### API Endpoints
Create Claim: POST /api/claims
Resolve Claim: POST /api/claims/{id}/resolve
Get All Claims: GET /api/claims
Database Schema
The application uses a PostgreSQL database with a simple claim table:

## Sql
`CREATE TABLE claim (
    id SERIAL PRIMARY KEY,
    description VARCHAR(255) NOT NULL,
    resolved BOOLEAN NOT NULL
);`
