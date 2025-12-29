import java.util.Scanner;

public class NumReves {
    public static void main(String[] args) throws Exception {
        // CREA UN PROGRAMA QUE PIDA UN NÚMERO POR TECLADO Y DESPUÉS NOS MUESTRE EL NÚMERO AL REVÉS

        // ACUMULADOR - NO en nuestro caso
        // CONTADOR - SI el propio num es el acumulador
        // INTERRUPTOR - NO

        /* DECLARAR VARIABLES */
        int num = 0;
        int residuo = 0;
        int cociente = 0;

        // INICIALIZAR ESTRUCTURA DE ENTRADA DE ESTÁNDAR
        Scanner reader = new Scanner(System.in);

        // PEDIMOS EL NÚMERO
        System.out.println("Introduce un número: ");
        num = reader.nextInt();

        /* LA FORMA DE EXTRAER EL RESIDUO, ES DIVIDIR /10 
        123456/10=12345'6(el 6 sería el residuo y el cociente lo que va antes de la coma), Y ASÍ SUCESÍVAMENTE */
        while (num > 0) {
            // QUE IMPRIME
            residuo = num % 10;
            System.out.print(residuo);
            // QUE LO GUARDE PARA EL SIGUIENTE
            cociente = num / 10;
            num = cociente;           
        }
        
    }

}
