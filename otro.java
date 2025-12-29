import java.util.Scanner;

public class otro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int comptador = 0;
        int positius = 0;
        int suma = 0;

        System.out.println("Introdueix números (0 per a acabar):");

        do {
            numero = scanner.nextInt();
            if (numero != 0) {
                comptador++;
                suma += numero;
                if (numero > 0) {
                    positius++;
                }
            }
        } while (numero != 0);

        System.out.println("Total de números llegits: " + comptador);
        System.out.println("Números positius: " + positius);

        if (comptador > 0) {
            double mitjana = (double) suma / comptador;
            System.out.println("Mitjana dels números llegits: " + mitjana);
        } else {
            System.out.println("No s'han llegit números per calcular la mitjana.");
        }

        scanner.close();
    }
}