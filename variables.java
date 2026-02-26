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
