# SenseFlow

**SenseFlow** is a microservices-based sensor data pipeline using Spring Boot, Kafka, and PostgreSQL. It simulates real-time sensor data generation and consumption with full Docker support.

---

## 📁 Project Structure

```text
SenseFlow/
├── docker-compose.yml         # Orchestrates Kafka, Zookeeper, PostgreSQL, and microservices
├── sensor-simulator/          # Kafka Producer Microservice
│   ├── Dockerfile
│   └── src/...
└── sensor-data-consumer/      # Kafka Consumer Microservice
    ├── Dockerfile
    └── src/...
```

---

## ⚙️ Tech Stack

- **Java 17**
- **Spring Boot**
- **Apache Kafka**
- **PostgreSQL**
- **Docker & Docker Compose**

---

## 🚀 Setup Instructions

### 1. Build Both Microservices

```bash
cd sensor-simulator
mvn clean package -DskipTests

cd ../sensor-data-consumer
mvn clean package -DskipTests
```

### 2. Run the Docker Containers
Go to the root SenseFlow/ directory:
```bash
docker compose up --build
```

---

🧠 Future Improvements

- **Add Grafana for monitoring**

- **Add Swagger UI for APIs**

- **Secure Kafka and DB connections**

- **Add health check endpoints**

---

👤 Author

Karan Taragi

📧 ksingh064002@gmail.com

📍 Uttarakhand, India


