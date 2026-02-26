# Taller_3
Tercer taller lógica de programación en equipo

---

## 📌 Descripción del Proyecto

Este proyecto corresponde al desarrollo de un taller práctico en Java enfocado en el uso de variables, tipos de datos y buenas prácticas de trabajo colaborativo con Git y GitHub. El objetivo principal es comprender cómo declarar, inicializar y reasignar variables utilizando distintos tipos primitivos y referencias, aplicando valores compatibles y ejemplos reales basados en los contenidos estudiados en los videos propuestos.

El trabajo se desarrolla en equipo, integrando control de versiones mediante commits organizados, documentación en README y evidencias del proceso. Además, se busca fortalecer habilidades fundamentales de programación como el manejo de datos int, long (L), float (F), char, boolean y String, así como la correcta estructura de un proyecto Java dentro de un repositorio colaborativo.

---

## ▶️ Instrucciones para ejecutar el programa

###✅ Requisitos

Tener instalado Java JDK.

Terminal (Git Bash, CMD o PowerShell).

Proyecto descargado o clonado desde GitHub.

Verificar instalación:

java -version
javac -version

### 💻 1. Abrir el proyecto

Ubicarse en la carpeta del repositorio:

cd Taller_3

###⚙️ 2. Compilar el programa
javac src/Taller3.java

(Este comando genera el archivo .class del programa).

### 🚀 3. Ejecutar el programa
java -cp src Taller3

El programa mostrará en consola la declaración, inicialización y reasignación de las variables definidas en el taller.

---

### 👥 Integrantes del Equipo
👤 Felipe Londoño Ospina 

👤 Ian Isaza Bermudez 

👤 Jordan Restrepo Tobón 

---

## Codico completo de variables y condicionales
### variables.java

```java
public class variables {

    public static void main(String[] args) {

        // 20 DECLARACIONES DE VARIABLES 

        int edad;
        int añosExperiencia;
        double altura;
        float peso;
        char inicial;
        boolean activo;
        String nombre;
        int año;
        short nivel;
        byte numero;

        int numero2;
        double promedio;
        float temperatura;
        char letra;
        boolean Tienecarro;
        String ciudad;
        String curso;
        char Letra;
        boolean esMayor;
        int semestre;

        // INICIALIZACION DE LAS VARIABLES

        edad = 17;
        añosExperiencia = 2;
        altura = 1.85;
        peso = 70.0F;
        inicial = 'F';
        activo = true;
        nombre = "Felipe";
        año = 2026;
        nivel = 3;
        numero = 10;

        numero2 = 5;
        promedio = 4.5;
        temperatura = 25.3F;
        letra = 'A';
        Tienecarro = false;
        ciudad = "Medellin";
        curso = "Programacion";
        Letra = 'B';
        esMayor = false;
        semestre = 3;

        // REASIGNACIÓN DE VARIABLES

        // Usando valores de otras variables 

        edad = numero2;            // int ← int
        añosExperiencia = nivel;   // int ← short
        altura = promedio;         // double ← double
        peso = temperatura;        // float ← float
        nombre = ciudad;           // String ← String

        // Datos nuevos hardcoded (quemados)
        año = 2026;
        nivel = 5;
        numero = 20;
        letra = 'Z';
        Letra = 'C';
        activo = false;
        Tienecarro = true;
        esMayor = true;
        curso = "Logica de Programacion";
        semestre = 3;

        // VARIABLES QUE REQUIEREN F, L Y COMILLAS SIMPLES

        // uso de F obligatorio en float
        float precioProducto = 19.99F;   
        float distancia = 120.5F;        

        // uso de L obligatorio en long
        long poblacion = 5000000L;       
        long codigo = 123456789L;        

        // comillas simples
        char genero = 'M';                
        char simbolo = '#';               

    }
}
```

---

## Enlaces a recursos utilizados 

