# Tipos de Datos

## Primitivos

| Tipo     | Tamaño         | Rango / Características                                      | Notas                           | Ejemplo          |
|----------|----------------|--------------------------------------------------------------|--------------------------------|------------------|
| `byte`   | 8 bits         | -128 a 127                                                  |                                | `byte b = 100;`  |
| `short`  | 16 bits        | -32,768 a 32,767                                            |                                | `short s = 3000;`|
| `int`    | 32 bits        | -2,147,483,648 a 2,147,483,647                              |                                | `int i = 100000;`|
| `long`   | 64 bits        | -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807      | Añadir `L` al final del número | `long l = 100000L;`|
| `float`  | 32 bits        | Precisión de 6-7 decimales                                  | Añadir `F` al final del número | `float f = 3.14F;`|
| `double` | 64 bits        | Precisión de 15 decimales                                   | Añadir `D` al final es opcional| `double d = 3.1415;`|
| `char`   | 16 bits        | Almacena un solo carácter                                   | Comillas simples para texto    | `char c = 'A';`  |
| `boolean`| 1 bit (lógico) | Solo `true` o `false`                                       | Por defecto es `false`         | `boolean flag = true;`|

## Tipos Object

| Tipo       | Descripción                               | Notas                               | Ejemplo                        |
|------------|-------------------------------------------|-----------------------------------|-------------------------------|
| `String`   | Cadena de texto                          | Datos entre comillas dobles         | `String nombre = "Juan";`     |
| `Array`    | Colección de elementos                   |                                   | `int[] nums = {1, 2, 3};`     |
| `Clases`   | Plantillas para objetos                  |                                   | Definir tus propias clases     |
| `Interfaces`| Definen métodos que las clases implementan |                                 | `interface Runnable { ... }`   |
