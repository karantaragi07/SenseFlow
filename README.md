# SenseFlow

## Overview
A backend system to track and monitor internal system flows using Spring Boot. Simulates flow logging, status tracking, and error reporting across services.

## Tech Stack
- Java 17
- Spring Boot
- PostgreSQL / IBM Db2
- Kafka
- Swagger UI

## Modules
- Controller Layer: REST APIs for flow status and reports
- Service Layer: Business logic for flow tracking
- Repository Layer: JPA Repositories for DB access
- Model Layer: Entity models for flow data

## Setup
1. Clone the repo
2. Configure DB in `application.properties`
3. Run with `mvn spring-boot:run`

## Progress
- [x] Repo setup
- [ ] Base APIs for flow ingestion
- [ ] DB integration with JPA
- [ ] Add Kafka producer/consumer (optional)
- [ ] Add Swagger documentation

## Author
Karan Taragi
