# Ejercicio Informe

---

## 1. Introducción

En este ejercicio he hecho un ejercicio en Java que ejecuta comandos del sistema Linux para mostrar información sobre los recursos del sistema. Los comandos usados son:

- `ps`: muestra los procesos activos.
- `df`: muestra el espacio disponible en disco.
- `free`: muestra la memoria disponible y usada.

El programa ejecuta estos comandos utilizando la clase `Runtime` de Java y guarda el resultado en un fichero con formato Markdown.

---

## 2. Descripción general del programa

En el ejercicio he creado 3 ficheros java:

- **Lanzador**: Clase principal que ejecuta los comandos y coordina la generación del informe.
- **EjecutorComando**: Clase que encapsula la ejecución de un comando y captura su salida.
- **GenerarInforme**: Clase responsable de guardar el resultado en un archivo Markdown.

---

## 3. Tabla de comandos ejecutados

| Comando | Descripción                             |
|---------|---------------------------------------|
| ps      | Lista los procesos en ejecución.      |
| df      | Muestra espacio en disco usado/libre. |
| free    | Muestra memoria libre y usada.        |

---

## 4. Explicación del código 

Para ejecutar un comando del sistema desde Java usamos:
```java
    Process proceso = Runtime.getRuntime().exec(comando);
```

Después para leer la salida del comando:

```java
BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
String linea;
while ((linea = reader.readLine()) !=null)
```
## Clase `generarInforme`

Esta clase se encarga de guardar texto en un archivo llamado informe.md. Su función principal es el método guardarInforme.

```java
    public void guardarInforme (String contenido) 
```
Constantes
```java
    public static final String INFORME = "informe.md"
```
## gitHub
https://github.com/alex12345-123/informe