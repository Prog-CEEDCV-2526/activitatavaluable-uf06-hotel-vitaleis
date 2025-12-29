import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) throws Exception {
        // A) ESCRIBE UN PROGRAMA QUE, DADO UN NÚMERO N INTRODUCIDO POR TECLADO, MUESTRE POR PANTALLA TODOS LOS NÚMEROS DEL 1 HASTA N

        // DECLARAR VARIABLES
        int n = 1;
        int cont = 1;

        // INICIALIZAR ESTRUCTURA DE ENTRADA ESTÁNDAR
        Scanner reader = new Scanner(System.in);

        // PEDIMOS N
        System.out.println("Introduce un número:");
        n = reader.nextInt();

        while (cont != n) {
            System.out.println(cont+ " ");
            cont++;
        }
        System.out.print(""+n);

    }

}
