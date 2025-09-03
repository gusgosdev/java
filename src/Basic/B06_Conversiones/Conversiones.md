# Conversiones

Es la transformación de un tipo de dato a otro

### De Strings a Primitivos
| Tipo Primitivo | Conversión desde String             | Ejemplo Java                          | Notas                                                                                                   |
|----------------|-------------------------------------|---------------------------------------|---------------------------------------------------------------------------------------------------------|
| `char`         | `str.charAt(0)`                     | `char c = "A".charAt(0);`             | Toma solo el primer carácter del `String`, el 0 indica el indice del string; cuidado con strings vacíos |
| `byte`         | `Byte.parseByte(str)`               | `byte b = Byte.parseByte("127");`     | Rango: -128 a 127; lanza `NumberFormatException` si es inválido                                         |
| `short`        | `Short.parseShort(str)`             | `short s = Short.parseShort("32000");`| Rango: -32,768 a 32,767                                                                                 |
| `int`          | `Integer.parseInt(str)`             | `int i = Integer.parseInt("123");`    | Valor fuera de rango lanza excepción                                                                    |
| `long`         | `Long.parseLong(str)`               | `long l = Long.parseLong("123456789");` | CajeroAutomatico valores grandes, pero también puede lanzar excepción                                             |
| `float`        | `Float.parseFloat(str)`             | `float f = Float.parseFloat("3.14");` | Menor precisión; acepta notación científica (e.g., "1e3")                                               |
| `double`       | `Double.parseDouble(str)`           | `double d = Double.parseDouble("2.718");` | Mayor precisión que `float`                                                                             |