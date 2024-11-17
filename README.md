# Conversor de Monedas

Un programa interactivo escrito en Java que permite convertir entre diferentes monedas utilizando la API de ExchangeRate.

---

## Funcionalidades

- Conversión entre las siguientes monedas:
  -Dólar EEUU      => Peso Chileno
  -Peso Chileno    => Dólar EEUU
  -Dólar EEUU      => Peso Argentino
  -Peso Argentino  => Dólar EEUU
  -Dólar EEUU      => Soles Peruanos
  -Peso Colombiano => Dólar EEUU
  
- Utiliza la API de ExchangeRate para obtener tasas de cambio actualizadas.
- Guarda los resultados de la conversión en un archivo JSON.


## Tecnologías Utilizadas

- **Java 11+**
- **Gson**: Para parsear JSON.
- **Java HTTP Client**: Para realizar solicitudes a la API.
- **API de ExchangeRate**: Proporciona las tasas de cambio en tiempo real.


## Requisitos Previos

1. **Java instalado**: Asegúrate de tener Java 11 o superior instalado en tu máquina.
2. **Dependencia Gson**:
   - Descarga Gson desde [Maven Central](https://mvnrepository.com/artifact/com.google.code.gson/gson).
   - Inclúyelo en el proyecto como una biblioteca.

---

## Configuración

1. **Clave de API**:
   - Regístrate en la API de ExchangeRate para obtener una clave de API.
   - Reemplaza la línea correspondiente en `Consulta.java`:
     ```java
     private static final String API_KEY = "TU_CLAVE_API";
     ```

2. **Compilar y ejecutar el programa**:
   - Para compilar el proyecto:
     ```bash
     javac -d bin src/main/java/com/alura/alumnos/*.java
     ```
   - Para ejecutarlo:
     ```bash
     java -cp bin com.alura.alumnos.Main
     ```


## Cómo Usarlo

1. Ejecuta el programa.
2. Selecciona la moneda de origen y destino en el menú.
3. Ingresa la cantidad que deseas convertir.
4. El programa mostrará la conversión en la consola y guardará los resultados en un archivo JSON.

---

## Ejemplo de Uso

### Conversión: Dólar EEUU a Peso Chileno

1. Selecciona la opción `1` en el menú.
2. Ingresa la cantidad a convertir (por ejemplo, `100`).
3. El resultado será algo como:

El valor de 100.00 [USD] es 81100.00 [CLP] Conversión guardada en archivo JSON.

### Archivo JSON generado:

{
"base_code": "USD",
"target_code": "CLP",
"conversion_rate": 811.00
}

-----------------------------------------------------------------------------------------------

## Próximos pasos

Validaciones avanzadas:
Evitar conversiones con valores negativos.
Manejo más robusto de errores.
Soporte para más monedas.
Implementación de una interfaz gráfica.


## Contribución
Si deseas contribuir a este proyecto, siéntete libre de enviar un pull request o abrir un issue en el repositorio.

## Autor
Creado por Cristian Andrés Godoy Angel.








