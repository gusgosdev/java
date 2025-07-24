# Operadores

- Son símbolos especiales que se utilizan para realizar operaciones sobre variables y valores.

### Operadores de Asignación
| Nombre              | Operador | Ejemplo  | Descripción                        |
|---------------------|----------|----------|----------------------------------|
| Asignación simple   | =        | a = 5    | Asigna el valor 5 a la variable a |
| Suma y asigna       | +=       | a += 3   | Suma 3 a a y asigna el resultado a a |
| Resta y asigna      | -=       | a -= 2   | Resta 2 a a y asigna el resultado a a |
| Multiplica y asigna | *=       | a *= 4   | Multiplica a por 4 y asigna el resultado a a |
| Divide y asigna     | /=       | a /= 2   | Divide a entre 2 y asigna el resultado a a |
| Módulo y asigna     | %=       | a %= 3   | Asigna a el residuo de dividir a entre 3 |

### Operadores Aritméticos
| Nombre            | Operador | Ejemplo     | Descripción                   |
|-------------------|----------|-------------|-------------------------------|
| Suma              | +        | a + b       | Suma dos valores              |
| Resta             | -        | a - b       | Resta dos valores             |
| Multiplicación    | *        | a * b       | Multiplica dos valores        |
| División          | /        | a / b       | Divide dos valores            |
| Módulo            | %        | a % b       | Devuelve el residuo de a / b  |

### Operadores de Comparación
| Nombre              | Operador | Ejemplo      | Descripción                              |
|---------------------|----------|--------------|------------------------------------------|
| Igual a             | ==       | a == b       | Verdadero si a es igual a b              |
| Distinto de         | !=       | a != b       | Verdadero si a es diferente de b         |
| Mayor que           | \>        | a > b        | Verdadero si a es mayor que b            |
| Menor que           | <        | a < b        | Verdadero si a es menor que b            |
| Mayor o igual que   | \>=       | a >= b       | Verdadero si a es mayor o igual a b      |
| Menor o igual que   | <=       | a <= b       | Verdadero si a es menor o igual a b      |

### Operadores Lógicos
| Nombre | Operador | Ejemplo             | Descripción                                      |
|--------|----------|---------------------|--------------------------------------------------|
| AND    | &&       | (a > 0) && (b > 0)   | Verdadero si ambas condiciones son verdaderas    |
| OR     | \|\|     | (a > 0) \|\| (b > 0) | Verdadero si al menos una condición es verdadera |
| NOT    | !        | !(a > 0)             | Niega la condición; verdadero si es falsa        |

### Operador Ternario
`condición ? valorSiVerdadero : valorSiFalso;`

### Prioridad entre Operadores en Java
| Nivel | Operadores                  | Descripción                         |
|-------|-----------------------------|-----------------------------------|
| 1     | Paréntesis `()`, corchetes `[]` | Se evalúan primero, controlan el orden |
| 2     | Unarios `-`, `++`, `--`     | Operadores que actúan sobre un solo operando |
| 3     | Aritméticos `*`, `/`, `%`   | Multiplicación, división y módulo  |
| 4     | Aritméticos `+`, `-`        | Suma y resta                      |
| 5     | Relacionales `<`, `<=`, `>`, `>=` | Comparaciones                    |
| 6     | Equivalencia `==`, `!=`     | Igualdad y desigualdad             |
| 7     | Lógicos `&&`, `\|\|`          | AND y OR lógico                   |
| 8     | Asignación `=`, `+=`, `-=`, `*=` | Asignación simple y compuesta     |