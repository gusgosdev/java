# Matrices

- Una matriz es una tabla de datos → tiene filas y columnas
- Es un arreglo de arreglos (arreglo bidimensional)

### Declarar una matriz vacía
```java
// Sintaxis:
// tipoDato[][] nombreMatriz = new tipoDato[filas][columnas];

// Ejemplo:
int[][] matriz1 = new int[2][3];
```
- Son 2 filas × 3 columnas
- Si son se asignan valores, por defecto es 0
- Los índices empiezan en 0

### Declarar con valores
```java
int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
};
```
### Acceder a elementos  
- matriz[0][0] → primera fila, primera columna
- matriz[1][2] → segunda fila, tercera columna