import java.util.Scanner;

public class numeroPositivo {
    public static void main(String[]args)throws Exception{

        // PROGRAMA QUE SOLICITE NÚMEROS ENTEROS POSITIVOS Y MUESTRE LA SUMA DE LOS NÚMERO INGRESADOS. FINALIZA AL INGRESAR UN NÚMERO NEGATIVO

        /* DECLARAR VARIABLES */
        String msj = "";
        int suma = 0;
        int num;

        // INICIALIZAR ESTRUCTURA DE ENTRADA DE ESTÁNDAR
        Scanner reader = new Scanner(System.in);

        // DEFINIR CONDICIÓN System.out.println(num > 0);

        System.out.println("Ingresa un número: ");
        num = reader.nextInt();

        while (num > 0) {
            suma += num;
            System.out.println("La suma es: " + suma);

            System.out.println("Ingresa otro número: ");
            num = reader.nextInt(); // ACTUALIZAR EL VALOR
        }

        if (num < 0) {
            System.out.println("Error, ingresaste un número negativo. Fin del programa");
        }

        reader.close();
    }

}
