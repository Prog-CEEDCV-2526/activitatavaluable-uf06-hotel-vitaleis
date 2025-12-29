import java.util.Scanner;

public class promediarEnterosPositivos {

    public static void main(String[]args)throws Exception {

        // programa que permita promediar números enteros positivos, finaliza al ingresa 0

        //INICIALIZAR ESTRUCTURA DE ENTRADA ESTÁNDAR
        Scanner reader = new Scanner (System.in);

        // DECLARAR E INICIALIZAR VARIABLES

        double promedio = 0.0;
        int num = 1;
        int cont = 0;
        int suma = 0;

        /* DEFINIR CONDICIÓN
        System.out.print(num != 0);*/

        // CICLO WHILE
        while (num != 0) { // NO ES IGUAL

            System.out.print("Ingresa un número positivo (0 para finalizar): ");
            num = reader.nextInt();

                // VALIDACIÓN
                if (num > 0) {
                    
                    suma += num;
                    System.out.println("Suma actual: " + suma);

                    cont++;
                    System.out.println("La cantidad de números introducidos es: " + cont);

                    promedio = suma / cont;
                    System.out.println("El promedio es: " + promedio);

                }

                else if (num == 0) {
                    System.err.println("Error, el programa finaliza al ingresar 0.");                   
                }

                else {
                    System.out.println("Error, sólo se permiten números positivos o 0 para finalizar.");
                }
  
            }
            // CIEERE SCANNER
            reader.close();
    }

}
