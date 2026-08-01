# Person Java - Modelo de persona

Microejercicio para practicar el modelado de una entidad (clase con estado y comportamiento) en Java, hecho con TDD como parte de mi formación en F5 Bootcamp.

## Qué hace

Modela el concepto de una persona, con los siguientes atributos:

- Nombre
- Apellido
- Número de documento de identidad
- Año de nacimiento
- Edad (calculada, no almacenada directamente)

La clase tiene un constructor que inicializa nombre, apellido, documento y año de nacimiento. La edad **no se recibe como parámetro**, sino que se calcula mediante un método a partir del año de nacimiento y el año actual.

## Cómo lo he hecho

A diferencia de los ejercicios anteriores (FizzBuzz, tabla de multiplicar), aquí no se trata de una función pura, sino de modelar una **entidad** con estado propio. La clase guarda los datos básicos en atributos privados y expone getters para consultarlos, salvo la edad, que no es un atributo fijo: se calcula en el momento con `Year.now().getValue() - birthYear`, así siempre está actualizada aunque pase el tiempo.

Para los tests, en vez de hardcodear el año actual (que cambiaría cada 1 de enero), uso también `Year.now()` dentro del propio test para calcular la edad esperada dinámicamente y comparar contra el resultado real.

Los tests cubren: el cálculo correcto de la edad y que cada getter devuelve el valor correcto que se pasó por el constructor.

## Tecnologías

- Java 8
- Maven (gestión de dependencias y build)
- JUnit 5 (tests unitarios)
- Checkstyle (estilo de código)
- JaCoCo (cobertura de tests, mínimo 70%)

## Cómo ejecutarlo

Clona el repo y desde la carpeta del proyecto:

```bash
mvn clean test
```

Esto compila, revisa el estilo con Checkstyle, ejecuta los tests con JUnit y genera el reporte de cobertura con JaCoCo en `target/site/jacoco/index.html`.

## Estructura del proyecto

```
ex-my-first-model-java/
├── src/
│   ├── main/java/ikerdevmodel/Person.java
│   └── test/java/ikerdevmodel/PersonTest.java
├── pom.xml
└── README.md
```

## Pruebas de Test

<img width="680" height="383" alt="Captura de pantalla 2026-07-30 144255" src="https://github.com/user-attachments/assets/9235a48d-1ae5-4cb0-8b33-5a86b55f9d92" />

<img width="922" height="518" alt="Captura de pantalla 2026-07-30 144351" src="https://github.com/user-attachments/assets/ba95fb5c-3145-40e9-bc00-473e58faf2fa" />

<img width="608" height="365" alt="Captura de pantalla 2026-07-30 144733" src="https://github.com/user-attachments/assets/d10ed75d-0678-4eef-9b5b-e25ce8f2948f" />
