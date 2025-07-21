SenseFlow - Real-time Sensor Data Streaming Application
📡 SenseFlow
SenseFlow is a real-time sensor data streaming application built using Spring Boot, Kafka, PostgreSQL, and Docker. It simulates sensor data, produces it to Kafka, and consumes + stores it into a PostgreSQL database.
🧱 Project Structure
SenseFlow/
├── docker-compose.yml
├── sensor-simulator/          # Microservice 1: Simulates and produces sensor data to Kafka
│   ├── Dockerfile
│   ├── src/
│   └── pom.xml
└── sensor-data-consumer/      # Microservice 2: Consumes Kafka messages and stores them in PostgreSQL
    ├── Dockerfile
    ├── src/
    └── pom.xml
🚀 Features
- Sensor data simulator producing to Kafka
- Kafka consumer saving data to PostgreSQL
- Dockerized microservices + Kafka + Zookeeper + Postgres
- Built using Spring Boot & Maven
🔧 Tech Stack
- Java 17
- Spring Boot 3.x
- Apache Kafka
- PostgreSQL
- Docker & Docker Compose
- Maven
🛠️ Setup Instructions
1. ✅ Prerequisites
Ensure the following are installed:
- Docker Desktop
- Maven
- Java 17+

2. 📦 Build Both Microservices
Open terminal in each microservice directory (`sensor-simulator` and `sensor-data-consumer`) and run:

mvn clean package -DskipTests

3. 🐳 Run the Application
Go to the root `SenseFlow/` folder and run:

docker-compose up --build
⚙️ Services Overview
🧪 sensor-simulator
- Sends dummy JSON sensor data to Kafka topic `sensor-data`
- Configured via `application.yml`

📥 sensor-data-consumer
- Listens to `sensor-data` topic
- Saves incoming messages into PostgreSQL (`sensor_readings` table)
📝 Environment Configuration
Kafka:
  image: bitnami/kafka:latest
  environment:
    KAFKA_CFG_NODE_ID: 1
    KAFKA_CFG_PROCESS_ROLES: broker
    KAFKA_CFG_CONTROLLER_QUORUM_VOTERS: 1@kafka:9093
    KAFKA_CFG_CONTROLLER_LISTENER_NAMES: CONTROLLER
    KAFKA_CFG_LISTENER_SECURITY_PROTOCOL_MAP: CONTROLLER:PLAINTEXT,PLAINTEXT:PLAINTEXT
    KAFKA_CFG_LISTENERS: PLAINTEXT://:9092,CONTROLLER://:9093
    KAFKA_CFG_ADVERTISED_LISTENERS: PLAINTEXT://kafka:9092

PostgreSQL:
  image: postgres:15
  environment:
    POSTGRES_USER: user
    POSTGRES_PASSWORD: password
    POSTGRES_DB: sensor_db
🔐 Default Credentials
PostgreSQL:
- Username: user
- Password: password
🧪 Sample Sensor Payload
{
  "sensorId": "sensor-123",
  "temperature": 27.3,
  "humidity": 55.1,
  "timestamp": "2025-07-21T10:00:00Z"
}
🧹 Cleanup
- To stop everything and remove containers: `docker-compose down`
- To remove all unused Docker images and volumes:
  docker system prune -a --volumes
🧭 Troubleshooting Tips
- ❌ Don’t use `localhost:9092` inside `application.yml`, use `kafka:9092`
- ❗ If Kafka disconnects, ensure all services are using the same Docker network
- 🔁 Always rebuild images if config changes: `docker-compose up --build`
📈 Future Improvements
- Expose REST API to retrieve stored sensor data
- Add Grafana dashboard for monitoring
