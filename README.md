# Spring Boot CRUD
Crud Demo with Spring Boot using JPA and a H2 DB. 

See also [https://rieckpil.de/howto-crud-application-with-spring-boot-2-2-java-11-and-h2/](https://rieckpil.de/howto-crud-application-with-spring-boot-2-2-java-11-and-h2/)

## Usage of lombok
When starting with a fresh eclipse installation you, in fact, need to "install" Lombok before being able to use it.

Go where you Lombok jar is (e.g. (e.g. you can find in ~/.m2/repository/org/projectlombok/lombok/1.18.10/lombok-1.16.10.jar), run it (Example: java -jar lombok-1.16.10.jar). A window should appear, browse to your eclipse.exe location.
Click on install.
Launch Eclipse, update project configuration on all projects.

## Usage of H2 Console

Goto [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

Change JDBC URL to jdbc:h2:mem:testdb
(user: sa, password: empty)

## Rest Endpoint
[http://localhost:8080/api/books](http://localhost:8080/api/books)

Swagger UI: ([http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)).

## CLI
[![Build Status](https://travis-ci.com/ashburnere/spring-boot-crud.svg?branch=master)](https://travis-ci.com/ashburnere/spring-boot-crud)