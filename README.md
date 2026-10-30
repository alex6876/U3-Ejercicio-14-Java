Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Registro de Pilotos y Horas de Vuelo (Encapsulamiento y Acumulación de Estado en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# ✈️ Simulación de Registro de Pilotos y Horas de Vuelo (Encapsulamiento y Acumulación en Java)

Este proyecto es una aplicación en Java que modela la administración de información profesional de un piloto de aviación, permitiendo el registro y acumulación segura de sus horas de vuelo operativas. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como el **encapsulamiento de atributos privados**, el control de estado defensivo mediante constructores y la validación de operaciones incrementales en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase de dominio encapsulada y un punto de ejecución:

* **`Piloto`**: Modela al aviador y protege la integridad de sus credenciales y su bitácora de vuelo acumulada.
* **Atributos privados (`private`)**: `numeroLicencia`, `nombre` y `horasVueloAcumuladas`, impidiendo la alteración directa desde el exterior.
* **Constructor**: Inicializa el perfil del piloto asignando su número de licencia y nombre, estableciendo de manera predeterminada las horas de vuelo acumuladas en cero.
* **Métodos accesores (*getters*)**: Permiten consultar de forma controlada el nombre, la licencia y el total de horas de vuelo registradas.
* **Métodos operativos de negocio**:
* `registrarVuelo(double horas)`: Incrementa las horas de vuelo acumuladas siempre que el valor ingresado sea estrictamente mayor a cero. Si se reciben valores negativos o nulos, rechaza la operación e informa una advertencia por consola.




* **`Main`**: Punto de entrada del programa. Instancia un objeto de tipo `Piloto` (Carlos), ejecuta múltiples registros de horas de vuelo válidos, simula ingresos inválidos (con valores negativos o cero) y muestra por consola la información completa junto al acumulado final.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Validación Defensiva de Incrementos:** El método `registrarVuelo` comprueba que las horas aportadas sean estrictamente mayores a cero (`horas > 0`), previniendo alteraciones ilógicas en la bitácora.
2. **Encapsulamiento Estricto de la Bitácora:** El campo `horasVueloAcumuladas` es privado, garantizando que la única forma de sumar horas de vuelo sea mediante la ejecución controlada y validada del método de negocio.
3. **Acumulación Progresiva Coherente:** Cada registro exitoso se suma de manera acumulativa al estado previo almacenado en la memoria del objeto, reflejando de forma fidedigna la experiencia del piloto.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
--- Registro de vuelos ---
Vuelo registrado correctamente.
Vuelo registrado correctamente.
Vuelo registrado correctamente.
Las horas deben ser mayores que cero.
Las horas deben ser mayores que cero.

--- Información del piloto ---
Nombre: Carlos
Licencia: LIC-1234
Horas acumuladas: 17.0

```

---

## 🚀 Conceptos de Programación Aplicados

* **Encapsulamiento de Estado:** Ocultamiento de los datos internos del piloto para prevenir alteraciones accidentales o modificaciones directas de la bitácora de vuelo.
* **Gestión de Invariantes Operativas:** Aseguramiento de que las horas acumuladas mantengan una progresión lógica y positiva durante todo el ciclo de vida del objeto.
* **Diseño Modular:** Clara separación entre la lógica del dominio aeronáutico (`Piloto`) y la ejecución de pruebas del usuario (`Main`).
