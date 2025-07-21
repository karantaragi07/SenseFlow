📘 SenseFlow: Real-time Sensor Data Pipeline using Kafka & Spring Boot

SenseFlow simulates a real-world IoT use case where sensors emit data in real-time. This data is sent through Apache Kafka, processed by a Spring Boot consumer, and stored in a PostgreSQL database. All services run in Docker containers with a single docker-compose file.


🚀 Project Overview

SenseFlow/

├── docker-compose.yml         # Orchestrates Kafka, Zookeeper, PostgreSQL, and microservices
├── sensor-simulator/          # Kafka Producer Microservice
│   ├── Dockerfile
│   └── src/...
└── sensor-data-consumer/      # Kafka Consumer Microservice
    ├── Dockerfile
    └── src/...
