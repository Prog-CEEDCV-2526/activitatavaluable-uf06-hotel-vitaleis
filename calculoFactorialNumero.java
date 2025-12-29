import java.util.Scanner;

public class calculoFactorialNumero {

    public static void main(String[]args) throws Exception {

        /*  CREA UN PROGRAMA QUE CALCULE EL FACTORIAL DE UN NÚMERO, UTILIZA LA FÓRMULA DEL FACTORIAL n! = n*(n-1)*(n-2)*...1
        Ejemplo: 5! = 5*4*3*2*1=120 */

        // INICIALIZAR ESTRUCTURA DE ENTRADA
        Scanner reader = new Scanner(System.in);

        // DECLARAR E INICIALIZAR VARIABLES
        int num; // GUARDAMOS EL NÚMERO DEL CUAL QUEREMOS OBTENER EL FACTORIAL
        int factorial = 1; // DONDE ACUMULAMOS EL RESULTADO
        // AQUÍ NO INICIALIZO EL CONTADOR PORQUE ME ASEGURO DE QUE EL BUCLE FUNCIONE CORRECTAMENTE
        
        /* DEFINIR CONDICIÓN
        System.out.print(cont > 1);*/

        // PEDIR NÚMERO AL USUARIO FUERA DEL BUCLE
        System.out.println ("Introduce un número: ");
        num = reader.nextInt();

        int cont = num; // PODER IR AVANZANDO EN EL BUCLE, SI LO INICIALIZO ANTES, CONT SIEMPRE VA A VALER 1

        // CICLO WHILE
        while (cont > 1) {
            factorial *= cont;
            cont--; // DISMINUYE CONTADOR (5-1=4, 4-1=3...), 
        }

        System.out.println("El factorial de " + num + " es " + factorial);

        reader.close();
    }

}
