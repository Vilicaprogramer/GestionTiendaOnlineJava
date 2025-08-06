# 🛍️ GestionTiendaOnlineJava

Aplicación de consola que simula el funcionamiento básico de una 
tienda online: permite registrar clientes, productos y ventas, 
así como consultar y gestionar esta información desde un menú interactivo. 
Proyecto estructurado profesionalmente con Maven, Git, Javadoc y 
pruebas JUnit.

---

## 📌 Funcionalidades principales

- Alta, baja, modificación y consulta de **clientes**
- Alta, baja, modificación y búsqueda de **productos**
- Registro y gestión de **ventas**
- Consulta de ventas por cliente y cálculo de importe total
- Menús interactivos en consola para navegar por las opciones
- Estructura profesional del proyecto con control de versiones, testing y documentación técnica

---

## 📁 Estructura del proyecto

```
GestionTiendaOnlineJava/
├── src/                        # Código fuente Java
│   └── GestionTiendaOnlineJava/
│       ├── Producto.java
│       ├── Cliente.java
│       ├── Venta.java
│       ├── Tienda.java
│       └── FuncionesMenu.java
├── test/                       # Tests con JUnit 5
│   └── GestionTiendaOnlineJava/
│       ├── ProductoTest.java
│       ├── ClienteTest.java
│       ├── VentaTest.java
│       └── TiendaTest.java
├── docs/                       # Documentación HTML generada con Javadoc
├── pom.xml                     # Gestión de dependencias con Maven
├── README.md                   # Archivo presentación del repositorio del proyecto
└── .gitignore                  # Archivos a excluir del control de versiones
```

---

## 🚀 Requisitos para compilar y ejecutar

- **Java 17 o superior**
- **Maven** instalado
- **IntelliJ IDEA** o cualquier otro IDE compatible con proyectos Maven

---

## ▶️ Instrucciones de uso

1. Clona el repositorio:

   ```bash
   git clone https://github.com/Vilicaprogramer/GestionTiendaOnlineJava.git
   ```

2. Accede al proyecto y compílalo con Maven:

   ```bash
   cd GestionTiendaOnlineJava
   mvn clean compile
   ```

3. Ejecuta desde tu IDE o cmd.

4. Navega por los menús para registrar clientes, productos o realizar ventas.

---

## 🧪 Testing automático con JUnit 5

El proyecto incluye pruebas unitarias automatizadas con **JUnit 5**, ubicadas en la carpeta `/test/`.

- Se han creado clases de prueba para `Producto`, `Cliente`, `Venta` y `Tienda`.
- Se incluyen casos positivos y negativos, con uso de anotaciones como `@Test`, `@BeforeEach`, `@AfterEach`.


Esto permite validar el correcto funcionamiento de las funciones principales del programa antes de desplegar nuevas versiones.

---

## 📚 Documentación técnica con Javadoc

El código está comentado siguiendo el estándar **Javadoc**.

Para generar la documentación en HTML:

```bash
mvn javadoc:javadoc
```

Los archivos se almacenarán en la carpeta `/docs`.

---

## 🌿 Estrategia de ramas (Git)

- `main` → versión estable del proyecto
- `dev` → rama de desarrollo activo
- `feature/<nombre>` → ramas para nuevas funcionalidades

---

## 👨‍💻 Autoría

Proyecto desarrollado por **Vicente Limones** como parte del módulo de
Programación y Entorno de Desarrollo (DAW).

---

## 🪪 Licencia

Este proyecto no tiene licencia de momento.  
Uso educativo y personal únicamente.

