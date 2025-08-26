# CalculadoraBases

Calculadora en Java (POO) que realiza operaciones básicas (suma, resta, multiplicación y división) con números en bases entre 2 y 10, mostrando el resultado en la base elegida por el usuario.

---

## Descripción

Este proyecto implementa una calculadora orientada a objetos en Java que permite:  

- Ingresar dos números en **cualquier base entre 2 y 10**.  
- Seleccionar la operación a realizar: suma (`+`), resta (`-`), multiplicación (`*`) o división (`/`).  
- Elegir la base en la que se mostrará el resultado.  
- Trabajar internamente con los números en **base 10**, convirtiendo los resultados a la base deseada.  

Todos los números se manejan como **duplas `(valor, base)`**.

---

## Ejecución

El archivo principal del proyecto es `Main.java`.  

Para ejecutar la calculadora, simplemente se debe ejecutar esta clase desde el IDE o desde la consola.

### Ejemplo de ejecución:

Ingrese el primer número: 505
Ingrese la base del primer número (2-10): 6
Ingrese el segundo número: 100
Ingrese la base del segundo número (2-10): 2
Ingrese la operación (+, -, *, /): +
Ingrese la base para el resultado (2-10): 10
Resultado: 189 (base 10)

---

## Diagrama UML

El diagrama de clases del proyecto se encuentra en el archivo `UML_CalculadoraBases.pdf`.  
Muestra las clases `NumberClass`, `Operation` y las implementaciones de las operaciones básicas (`Addition`, `Substraction`, `Multiplication`, `Division`) y sus relaciones.

---

## Autor

Giseth Natalia Murcia Monsalve