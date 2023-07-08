# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.1/maven-plugin/reference/html/#build-image)
* [Spring Data R2DBC](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#data.sql.r2dbc)
* [Spring Reactive Web](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#web.reactive)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#using.devtools)

### Guides

The following guides illustrate how to use some features concretely:

* [Accessing data with R2DBC](https://spring.io/guides/gs/accessing-data-r2dbc/)
* [Building a Reactive RESTful Web Service](https://spring.io/guides/gs/reactive-rest-service/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

### Additional Links

These additional references should also help you:

* [R2DBC Homepage](https://r2dbc.io)



### Como usar

Inicie uma instancia MySQL na sua maquina.

Rode o schema em /resources/schema.sql

Obter lista de usuarios - `curl --location 'http://localhost:8080/users'`

Criar novo usuário no banco de dados - 

`curl --location 'http://localhost:8080/users' \
--header 'Content-Type: application/json' \
--data-raw '{
"username": "willbigas",
"password": "abc",
"email": "williambmauro@hotmail.com"
}'`


