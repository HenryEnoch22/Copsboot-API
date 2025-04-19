# SpringBoot API + Keycloak + PostgreSQL

Este proyecto es una API REST construida con Spring Boot, asegurada mediante Keycloak y respaldada por PostgreSQL.
Link de la guia: https://docs.google.com/viewerng/viewer?url=https://eminus.uv.mx/eminusapi/drive%5Ccur_85666%5CActividades%5Cact_589341%5Cb18cf21e-1262-4e9d-a708-c45c4b5cac0d.pdf

## Requisitos

- Docker & Docker Compose  
- Java 17 o superior  
- Maven  

## Pasos para ejecutar el proyecto

### 1. Clonar o hacer Fork del Repositorio

git clone https://github.com/HenryEnoch22/Copsboot-API.git

### 2. Instalar Maven para correr la aplicación (Si es que no lo tiene)

Al realizar el docker compose con la aplicación no reconoce el servicio de autenticacion, por lo que la app tendrá que correrse de manera local.

### 3. Correr el docker compose con los servicios de base de datos y la autenticación con Keycloak.

Ubicarse en el directorio del proyecto clonado y correr docker-compose up --build

### 4. Realizar la configuración del Keycloak como se indica en la guía del PDF.

Crear el Realm de copsboot, crear el cliente y el usuario de prueba cómo se muestra en la guia.

### 5. Ejecutar el contenedor de la base de datos de manera interactiva con el comando:

- docker exec -it springboot_api-db-1 bash
Dentro del contenedor ejecutar:
- psql -U postgres
Esto abrirá el servicio de postgres dentro del contenedor.
Creamos la base de datos:
- CREATE DATABASE copsbootdb;
- \q
- exit

### 6. Correr la aplicacion de Spring Boot.

Con esto, si el servicio de autenticación está correctamente configurado y la base de datos está creada, la aplicación arrancará correctamente.
- mvn spring-boot:run

### 7. Puede realizar las peticiones a la API si desea, con la autenticación marcada en la guía.
  


