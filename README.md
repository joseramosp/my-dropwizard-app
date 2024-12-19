# My Dropwizard Application

This is a simple Dropwizard application that demonstrates the use of resources and health checks.

## Project Structure

```
my-dropwizard-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           ├── Application.java
│   │   │           ├── resources
│   │   │           │   └── MyResource.java
│   │   │           └── health
│   │   │               └── MyHealthCheck.java
│   │   └── resources
│   │       └── config.yml
├── pom.xml
└── README.md
```

## Setup Instructions

1. **Clone the repository:**
   ```
   git clone <repository-url>
   cd my-dropwizard-app
   ```

2. **Build the application:**
   ```
   mvn clean install
   ```

3. **Run the application:**
   ```
   java -jar target/my-dropwizard-app-1.0-SNAPSHOT.jar server src/main/resources/config.yml
   ```

## Usage

- Access the API at `http://localhost:8080/`.
- Use the defined endpoints in `MyResource.java` to interact with the application.

## Health Check

- The health check can be accessed at `http://localhost:8080/health`.

## Dependencies

This project uses Maven for dependency management. Please refer to `pom.xml` for the list of dependencies.