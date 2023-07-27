# Spring WebApp Todo

This is a simple Spring Boot Todo app that uses an in-memory database (H2) and Spring Security for user authentication.

## Users

There are two pre-configured users for testing the application:

1. Username: chetan, Password: test1
2. Username: megha, Password: test2

## How to Run

1. Clone the repository to your local machine.
2. Make sure you have Java and Maven installed.
3. Navigate to the project directory and run the following command to build the application:
   `mvn clean package`
4. Once the build is successful, run the following command to start the application:
   `java -jar target/spring-webapp-todo.jar`
5. The application will now be running on [http://localhost:8181](http://localhost:8181).

## Usage

1. Access the application using the provided URL.
2. Use the login credentials of either "chetan:test1" or "megha:test2" to log in.
3. After logging in, you will be able to view and manage your todo items.

## Contributing

If you'd like to contribute to this project, please fork the repository and create a pull request. We welcome your suggestions and improvements!

---
Please note that the provided information assumes a basic knowledge of Spring Boot applications and is meant to be a starting point for setting up and using the Spring WebApp Todo application. If you encounter any issues, refer to the project's documentation or seek help from the maintainers.



