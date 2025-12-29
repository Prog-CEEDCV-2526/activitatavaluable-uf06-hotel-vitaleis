import java.util.Scanner;

public class ConjeturadeCollatz {

    public static void main (String [] args) throws Exception {

        /* COMIENZA CON CUALQUIER NÚMERO POSITIVO. SI ES PAR, DIVIDE ENTRE 2; SI ES IMPAR, MULTIPLICA POR 3 Y SUMA 1.
        REPITE HASTA LLEGAR A 1.*/

        // IICIALIZAR ESTRUCTURA DE ENTRADA ESTÁNDAR
        Scanner reader = new Scanner(System.in);

        // DECLARAR VARIABLES
        int num;
        int contPasos = 0;

        /*  PEDIMOS NÚMERO POR TECLADO, cada iteración pide un número, lo que rompe la secuencia de Collatz
        PEDIRLO ANTES DEL BUCLE */
        System.out.print ("Introduce un número positivo: ");
        num = reader.nextInt();

        // SECUENCIA DE NÚMERO EN UNA SOLA LÍNEA
        System.out.print("Secuencia de Collatz para el número "+ num + ":" + System.lineSeparator()+ num);

        /*  DEFINIMOS CONDICIÓN
        System.out.print (cont > 1) // ejem. 6/2=3*3+1=10/2=5*3+1=16/2=8/2=4/2=2/2=1(fin)*/

        int cont = num;

        // CICLO WHILE
        while (cont > 1) {
            
            // SI ES PAR
            if (cont % 2 == 0) {
                contPasos++;
                cont /= 2 ;
                System.out.print(" --> " + cont);
            }

            // SI ES IMPAR (*3+1)
            else if (cont % 2 == 1) {
                contPasos++;
                cont = cont * 3 + 1;
                System.out.print(" --> " + cont); 
            }
                
            // VALIDACIÓN
            else {
                contPasos++;
                System.out.print(" --> " + cont);
            }
               
        }
        reader.close();
        
        // SALTA MENSAJE DE ERROR SI EL NÚMERO INTRODUCIDO ES <=0
        if (num <= 0) {
            System.err.println("Error, el número introducido es erróneo.");
            return;
        }

        // CONTADOR DE PASOS
        System.out.println(System.lineSeparator() + "Número total de pasos: " + contPasos);
        
    }

}
