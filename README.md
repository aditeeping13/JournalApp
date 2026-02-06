# JournalApp

A feature-rich Spring Boot application for personal journaling with E2EE (End-to-End Encryption) concepts, sentiment analysis, and third-party integrations.

## 🚀 Features

- **Journal Management**: Create, read, update, and delete personal journal entries.
- **Security & Auth**: 
  - JWT-based authentication.
  - Google OAuth2 integration.
  - Spring Security protection.
- **Sentiment Analysis**: Asynchronous processing using **Kafka** to analyze the sentiment of journal entries.
- **Weather Integration**: Integration with external Weather APIs to fetch weather data.
- **Caching**: Performance optimization using **Redis** for frequently accessed api data.
- **Database**: Persistent storage with **MongoDB**.

## 🛠 Tech Stack

- **Backend**: Java 8/17+, Spring Boot 2.7.x
- **Database**: MongoDB
- **Caching**: Redis
- **Messaging**: Apache Kafka
- **Security**: Spring Security, JJWT
- **Build Tool**: Maven
- **Lombok**: Reduced boilerplate code

## ⚙️ Local Setup

### Prerequisites
- Java JDK 8 or higher
- MongoDB installed and running on `localhost:27017`
- Redis (Optional for dev, defaults to `localhost:6379`)
- Kafka (Optional for dev, defaults to `localhost:9092`)

### Configuration
The application uses environment variables for sensitive data. For local development, sensible defaults are provided in `src/main/resources/application.yml`.

| Variable | Description | Default |
|----------|-------------|---------|
| `MONGODB_URI` | Connection string for MongoDB | `mongodb://localhost:27017/journaldb` |
| `REDIS_HOST` | Redis server host | `localhost` |
| `SERVER_PORT` | Port for the application | `8081` |
| `JAVA_EMAIL` | Email for notifications | `mock@gmail.com` |

### Running the Application
1. Clone the repository:
   ```bash
   git clone https://github.com/aditeeping13/JournalApp.git
   ```
2. Navigate to the project directory:
   ```bash
   cd JournalApp
   ```
3. Run using Maven:
   ```bash
   ./mvnw spring-boot:run
   ```
   The server will start on `http://localhost:8081/journal`.

## 📂 Project Structure
- `net.eng.journalApp.controller`: REST Controllers for handling requests.
- `net.eng.journalApp.service`: Business logic layer.
- `net.eng.journalApp.repository`: Data access layer for MongoDB.
- `net.eng.journalApp.entity`: POJO/Entity classes for MongoDB.
- `net.eng.journalApp.model`: Common models and DTOs.
- `net.eng.journalApp.scheduler`: Background tasks (e.g., Sentiment analysis).
- `net.eng.journalApp.config`: Configuration classes (Security, Redis, Swagger).

## 📄 License
This project is for educational purposes.
