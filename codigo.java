import java.util.Scanner;

public class codigo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        int estado = 0;
        double x = 0;
        double z = 0;
        double resultado = 0;   
        double resultadoPT1 = 0;
        double resultadoPT2 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("que opcion desea?: \n(1)ecuacion 1 \n(2)ecuacion 2 \n(3)salir");
        estado = sc.nextInt();
        sc.nextLine();

        if (estado == 1 || estado == 2){
            System.out.println("ingrese el valor de x: ");
            x = sc.nextInt();
            sc.nextLine();
            System.out.println("ingrese el valor de z: ");
            z = sc.nextInt();
            sc.nextLine();
        }

        if ( estado == 1 || estado == 2 ){
            resultadoPT1 = ((3*x)/(1+((3*x)/(3*z*z+2))));
            resultadoPT2 = (1/((1/(1+z))+(3*x*x)+(2*z)+(3)));
            resultado = resultadoPT1 / resultadoPT2;
            System.out.println("el resultado de la ecuacion 1 es: " + resultado);
        }

        else if (estado == 2){
            resultadoPT1 = (((x * x) + (3 * z) + 2) / ( 2 + ( 1 / (1 + (2 * z)))));
            resultadoPT2 = (2 / (1 + (3 * x * x * x) + (3 * z) + 2))  *  (      (1 / (1 + (3 * x)))      +        (((3 * x) + 1) / ((2 * z) + (3 / (1 + (5 / z))))) );
            resultado = resultadoPT1 + resultadoPT2;
            System.out.println("el resultado de la ecuacion 2 es: " + resultado);
        }
        else if (estado == 3){
            System.out.println("gracias por usar el programa");
        }
        else {
            System.out.println("opcion no valida");
        }

        System.out.println(z + " y " + x);

        if ( estado == 1 ){
            resultadoPT1 = ((3*x)/(1+((3*x)/(3*z*z+2))));
            resultadoPT2 = (1/((1/(1+z))+(3*x*x)+(2*z)+(3)));
            resultado = resultadoPT1 / resultadoPT2;
            System.out.println("el resultado de la ecuacion 1 es: " + resultado);
        }
        else if (estado == 2){
            resultadoPT1 = (((x * x) + (3 * z) + 2) / ( 2 + ( 1 / (1 + (2 * z)))));
            resultadoPT2 = (2 / (1 + (3 * x * x * x) + (3 * z) + 2))  *  (      (1 / (1 + (3 * x)))      +        (((3 * x) + 1) / ((2 * z) + (3 / (1 + (5 / z))))) );
            resultado = resultadoPT1 + resultadoPT2;
            System.out.println("el resultado de la ecuacion 2 es: " + resultado);
        }
        else if (estado == 3){
            System.out.println("gracias por usar el programa");
        }
        else {
            System.out.println("opcion no valida");
        }

        sc.close();
    }
}