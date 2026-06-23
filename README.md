SoporteTecnicoAPI
Descripción

SoporteTecnicoAPI es una aplicación desarrollada con Java y Spring Boot que permite gestionar solicitudes de soporte técnico mediante una API RESTful. La aplicación implementa operaciones CRUD (Crear, Consultar, Actualizar y Eliminar) y almacena la información temporalmente en memoria utilizando listas (List), sin necesidad de una base de datos.

Objetivo del proyecto

Desarrollar una API REST para una empresa de servicios tecnológicos que permita registrar y administrar solicitudes de soporte técnico de manera eficiente, aplicando una arquitectura en capas y buenas prácticas de programación con Spring Boot.

Tecnologías utilizadas
Java 21
Spring Boot
Maven
IntelliJ IDEA
Postman (para pruebas)
Git y GitHub
Estructura del proyecto
src/main/java/com/soporte/soportetecnicoapi
│
├── controller
│   └── SolicitudController.java
│
├── service
│   ├── ISolicitudService.java
│   └── SolicitudService.java
│
├── model
│   ├── Cliente.java
│   ├── Tecnico.java
│   └── Solicitud.java
│
├── exception
│   └── GlobalExceptionHandler.java
│
└── SoporteTecnicoApiApplication.java
Funcionalidades implementadas
Registrar solicitudes de soporte técnico.
Consultar todas las solicitudes registradas.
Buscar una solicitud por su identificador.
Actualizar la información de una solicitud.
Eliminar solicitudes existentes.
Validación de datos mediante anotaciones (@Valid, @NotBlank, @NotNull).
Manejo centralizado de excepciones con @RestControllerAdvice.
Almacenamiento temporal en memoria utilizando List.
Requisitos

Antes de ejecutar el proyecto es necesario contar con:

JDK 21 o superior
Maven
IntelliJ IDEA (opcional)
Git (opcional)
Postman o cualquier cliente REST para probar la API
Instalación
Clonar el repositorio:
git clone https://github.com/Eddicn/SoporteTecnicoAPI.git
Ingresar al proyecto:
cd SoporteTecnicoAPI
Abrir el proyecto en IntelliJ IDEA.
Esperar a que Maven descargue las dependencias automáticamente.
Ejecutar la clase:
SoporteTecnicoApiApplication.java

También puede ejecutarse desde consola con:

mvn spring-boot:run
Ejecución

Una vez iniciada la aplicación, el servidor quedará disponible en:

http://localhost:8080
Endpoints disponibles
Obtener todas las solicitudes
GET /solicitudes
Buscar una solicitud por ID
GET /solicitudes/{id}

Ejemplo:

GET /solicitudes/1
Registrar una solicitud
POST /solicitudes

Body JSON de ejemplo:

{
"id": 1,
"titulo": "Error de impresora",
"descripcion": "La impresora no responde",
"estado": "Pendiente",
"clienteId": 101,
"tecnicoId": 201
}
Actualizar una solicitud
PUT /solicitudes/{id}

Ejemplo:

PUT /solicitudes/1

Body:

{
"id": 1,
"titulo": "Error corregido",
"descripcion": "Se actualizó la impresora",
"estado": "Resuelto",
"clienteId": 101,
"tecnicoId": 201
}
Eliminar una solicitud
DELETE /solicitudes/{id}

Ejemplo:

DELETE /solicitudes/1
Pruebas realizadas

La API fue probada utilizando Postman, verificando correctamente el funcionamiento de las operaciones CRUD:

POST: Registrar solicitud.
GET: Listar solicitudes.
GET por ID: Consultar una solicitud específica.
PUT: Actualizar una solicitud existente.
DELETE: Eliminar una solicitud.
Almacenamiento de datos

La aplicación no utiliza una base de datos. Toda la información se almacena temporalmente en memoria mediante una colección List<Solicitud>, por lo que los datos se pierden al detener la ejecución del programa.