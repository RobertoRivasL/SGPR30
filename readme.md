![Contribuidores](https://img.shields.io/badge/contribuidores%20-%20cuatro%20-%20blue?cacheSeconds=7200
) 
![GitHub last commit](https://img.shields.io/badge/Integrantes%20%3A%20-%20%237E7E73?cacheSeconds=7200
) 
Billy Alvarez, Nicolas Masot, Roberto Orellana, Roberto Rivas.

# Importante

## Github

https://github.com/RobertoRivasL/SGPR30


## Informacion de Archivos del proyecto

• Si desea conectarse a la base de datos del proyecto recuerde cambiar la contraseña y Usuario de MySQL
en el archivo Conexion.java en la ruta: src\main\java\conexion\Conexion.java

• La base de datos se encuentra en :  src\main\resources\bdPrevRiesgo.sql

• El Archivo WAR del Proyecto se encuentra en : src\main\resources\Prevencion_De_Riesgos.war

# Detalle
Proyecto final del Sistema de Gestion Prevencion de Riesgos version 3.0, aplicando Java, Maven, Spring Boot, Jpa, Autentificacion, Mysql.


## Descripcion del Proyecto


El proyecto "Prevención de Riesgos" es una aplicación web que tiene como objetivo gestionar y mejorar la seguridad y prevención de riesgos laborales en un entorno profesional. La aplicación parece estar desarrollada con tecnologías como JavaServer Pages (JSP) y Bootstrap para el diseño y la interactividad.

### Privilegios y pestañas en la navegación:

• Inicio: Es la página principal que permite a los usuarios ver información general sobre la aplicación y sus funciones.

• Team: Esta pestaña posiblemente muestra información sobre el equipo o grupo de personas involucradas en el proyecto.

• Contacto: Si el usuario tiene un rol de "Cliente", esta pestaña le permite acceder a la sección de contacto para comunicarse con el personal encargado de la prevención de riesgos.

• Capacitación: Si el usuario tiene un rol de "Cliente", esta pestaña despliega un menú desplegable con dos opciones: "Capacitación" y "Lista Capacitación". Esto sugiere que los 
  clientes pueden acceder a información sobre las capacitaciones disponibles y ver una lista de las capacitaciones a las que han asistido.

• Gestionar Accidentes: Si el usuario tiene un rol de "Cliente", esta pestaña le permite acceder a una sección para gestionar información relacionada con accidentes laborales.

• Administrar Asistentes: Si el usuario tiene un rol de "Cliente", esta pestaña permite administrar y ver la información de los asistentes a las capacitaciones.

• Lista Usuarios: Si el usuario tiene un rol de "Administrativo", esta pestaña le permite acceder a una lista de usuarios registrados en la aplicación.

• Lista Pagos: Si el usuario tiene un rol de "Administrativo", esta pestaña le permite ver una lista de pagos relacionados con las capacitaciones o servicios ofrecidos.

• Administrar Chequeos: Si el usuario tiene un rol de "Administrativo", esta pestaña permite administrar y registrar información sobre chequeos realizados, posiblemente relacionados  con la seguridad laboral.

• Lista Visita: Si el usuario tiene un rol de "Profesional", esta pestaña muestra una lista de visitas realizadas en el contexto de la prevención de riesgos laborales.

• Lista Asesorias: Si el usuario tiene un rol de "Profesional", esta pestaña muestra una lista de asesorías brindadas en temas de seguridad y prevención.

### Funcionamiento de la página:
La página ofrece una navegación adaptada a diferentes roles de usuario: "Cliente", "Administrativo" y "Profesional". Cada rol tiene acceso a pestañas y opciones específicas relacionadas con sus funciones y responsabilidades en el proyecto de prevención de riesgos. Al acceder a la página, el sistema verifica si el usuario ha iniciado sesión y muestra el contenido correspondiente según el rol. También se muestra un mensaje de bienvenida personalizado con el nombre del usuario y su rol.

La interfaz utiliza el framework Bootstrap para mejorar la apariencia y la experiencia del usuario, proporcionando una navegación responsive y atractiva. Además, se utiliza JavaScript con Bootstrap para habilitar ciertas funciones interactivas en la página, como desplegar el menú de capacitaciones al hacer clic en el botón "Capacitación" y al hacer clic en el botón para abrir el menú de navegación en dispositivos móviles.

En resumen, el proyecto de "Prevención de Riesgos" es una aplicación web que se enfoca en mejorar la seguridad laboral mediante la gestión de capacitaciones, accidentes, visitas y asesorías. Proporciona diferentes niveles de acceso y funcionalidades según el rol del usuario y utiliza tecnologías web modernas para brindar una experiencia amigable al usuario.
