# Spring Data JPA - Quick Example

This is a basic Spring Boot project demonstrating how to use **Spring Data JPA** with **MySQL** to perform database operations using the repository pattern.

## Project Details

- **Project Name**: orm-learn  
- **Framework**: Spring Boot 3.2.4  
- **Database**: MySQL (using XAMPP)  
- **Build Tool**: Maven  
- **IDE Used**: IntelliJ IDEA  
- **Java Version**: 17+

## Technologies & Dependencies

- Spring Boot DevTools  
- Spring Data JPA  
- MySQL JDBC Driver  
- SLF4J (for logging)

##  Project Structure
src/
├── main/
│ ├── java/
│ │ └── com/cognizant/orm_learn/
│ │ ├── OrmLearnApplication.java
│ │ ├── model/
│ │ │ └── Country.java
│ │ ├── repository/
│ │ │ └── CountryRepository.java
│ │ └── service/
│ │ └── CountryService.java
│ └── resources/
│ └── application.properties

##  Steps Performed

1. Created a MySQL database and table:

CREATE DATABASE ormlearn;

CREATE TABLE country (
  code VARCHAR(2) PRIMARY KEY,
  name VARCHAR(50)
);

INSERT INTO country VALUES ('IN', 'India');
INSERT INTO country VALUES ('US', 'United States of America');

Configured application.properties for database connection and logging.

2.Created an @Entity class (Country) for mapping the database table.

3.Created a JpaRepository interface (CountryRepository) for CRUD operations.

4.Created a CountryService class with a getAllCountries() method using @Transactional.

5.Called the service method in the main() method of OrmLearnApplication.java.

