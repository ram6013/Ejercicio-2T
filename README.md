# Ejercicio-2T
Ejercicio examen
Biblioteca
Este proyecto implementa un sistema básico de gestión de una biblioteca. Permite realizar operaciones como agregar libros, agregar usuarios, prestar y devolver libros, y realizar búsquedas en la biblioteca.

Requisitos
Java JDK 8 o superior.
Biblioteca Gson (para leer archivos JSON). Puedes descargarla desde aquí o usar una herramienta de gestión de dependencias como Maven o Gradle.
Uso
Descarga el código fuente del proyecto y asegúrate de tener los requisitos mencionados anteriormente.

Abre el proyecto en tu entorno de desarrollo preferido.

Coloca los archivos JSON de libros y clientes en una ubicación accesible. Asegúrate de que los archivos tengan la estructura adecuada.

Actualiza el archivo Main.java con la ubicación de los archivos JSON:

java
Copy code
String librosFile = "ruta/del/archivo/libros.json";
String clientesFile = "ruta/del/archivo/clientes.json";
Ejecuta la aplicación desde el método main en la clase Main.java.

Estructura de archivos JSON
libros.json

json
Copy code
[
  {
    "titulo": "El Gran Gatsby",
    "autores": ["F. Scott Fitzgerald"],
    "identificador": "ISBN9788491050871",
    "categoria": "Drama",
    "edadRecomendada": 16
  },
  // Resto de los libros...
]
clientes.json


[
  {
    "nombre": "Juan",
    "apellidos": "Pérez",
    "fechaNacimiento": "15/02/1990",
    "dni": "DNI12345678"
  },
  // Resto de los clientes...
]
Asegúrate de seguir el formato correcto al crear tus propios archivos JSON.

Contribución
Si deseas contribuir a este proyecto, puedes hacerlo siguiendo estos pasos:

Haz un fork del repositorio.
Crea una rama con la nueva funcionalidad: git checkout -b nueva-funcionalidad.
Realiza los cambios y guarda los archivos modificados.
Realiza un commit con tus cambios: git commit -m "Agrega nueva funcionalidad".
Envía tus cambios al repositorio remoto: git push origin nueva-funcionalidad.
Crea una nueva Pull Request en GitHub.
Licencia
Este proyecto se encuentra bajo la Licencia MIT. Puedes consultar el archivo LICENSE para más detalles.
