# solid-principles-java-lab

**nombre: Wilson Alirio Delgado Hernandez**

Para cada principio, se creó un archivo GoodExample.java con una clase base GoodExample. Dentro de estos archivos
debajo se agregó las buenas prácticas de SOLID en cada caso. Para cada reto se pueden tener en cuenta los siguientes patrones.

1. SRP

Cada clase hace una sola cosa: calcular, imprimir o guardar facturas, evitando mezclar responsabilidades.

Patrones útiles:

Strategy: Permite agregar nuevos tipos de descuento sin modificar la clase principal.

Factory: Crea el descuento correcto según el tipo de cliente.

Chain of Responsibility: Permite aplicar múltiples descuentos en secuencia sin acoplarlos entre sí.

2. OCP

Se pueden agregar nuevos descuentos creando nuevas clases, sin modificar el código existente, reduciendo el riesgo de romper funcionalidades previas.

Patrones útiles:

Strategy: Permite agregar nuevas formas de cálculo o impresión sin tocar el código base.

Decorator: Agrega funcionalidades a facturas (impuestos, comisiones, descuentos) dinámicamente.

Factory: Permite crear componentes según configuración sin modificar la lógica central.

3. LSP

GasolineCar y ElectricCar pueden intercambiarse sin romper la lógica del sistema porque respetan el comportamiento esperado por la clase base.

Patrones útiles:

Strategy: Permite cambiar el tipo de mantenimiento según el motor.

Bridge: Separa el vehículo del tipo de motor, aumentando flexibilidad.


4. ISP

Workable y Eatable están separadas para que cada clase implemente solo lo que necesita, evitando métodos innecesarios.

Patrones útiles:

Composite: Permite manejar grupos de trabajadores como una sola unidad.

Adapter: Integra sistemas legacy que no cumplen con las nuevas interfaces.

Decorator: Agrega capacidades adicionales sin modificar la clase base.

5. DIP

OrderProcessor usa una interfaz Database en vez de una clase concreta, permitiendo cambiar la implementación sin afectar la lógica principal.

Patrones útiles:

Strategy: Cambiar cómo se guardan los datos (MySQL, Mongo, BigQuery).

Factory: Crear la base de datos correcta según configuración.

Dependency Injection: Inyectar la implementación desde afuera, reduciendo acoplamiento.