# ForoAlura-Challenge
Este es un proyecto del programa de Oracle: ONE desarrollado con Spring Boot.
## Tabla de Contenidos

- [Descripción](#descripción)
- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Uso](#uso)
- [Licencia](#licencia)

## Descripción

Este proyecto es un foro desarrollado utilizando Spring Boot y MySQL. Permite a los usuarios crear, editar y eliminar temas de discusión en un foro en línea. Cada tema tiene un título, un mensaje, un autor y un curso relacionado.

## Requisitos

Antes de comenzar, asegúrate de tener los siguientes requisitos en tu entorno de desarrollo:

- Java 17
- Maven
- MySQL
- Spring Boot

## Instalación

Sigue estos pasos para configurar y ejecutar la aplicación:

1. Clona este repositorio en tu máquina local:
```git
git clone https://github.com/TheJose24/ForoAlura-Challenge.git
```
3. Configura la base de datos MySQL en el archivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/alura_foro
spring.datasource.username=USUARIO_DE_MYSQL
spring.datasource.password=CONTRASEÑA_DE_MYSQL
spring.jpa.hibernate.ddl-auto=update
```

## Uso
Una vez que la aplicación esté en funcionamiento, puedes acceder a ella en tu navegador web:
```http://localhost:8080```

La aplicación te permitirá realizar las siguientes acciones:

- Listar todos los temas de discusión.
- Ver detalles de un tema de discusión específico.
- Agregar nuevos temas de discusión.
- Editar temas de discusión existentes.
- Eliminar temas de discusión.

## Licencia
Este proyecto se distribuye bajo la Licencia MIT. Consulta el archivo LICENSE para obtener más detalles.
