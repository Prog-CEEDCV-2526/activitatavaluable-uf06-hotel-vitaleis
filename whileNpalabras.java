import java.util.Scanner;

public class whileNpalabras {
    public static void main (String[] args) throws Exception{

        String palabra = "";
        String respuesta = "S";
        int cont = 0;

        Scanner reader = new Scanner(System.in);

        /*  System.out.println(respuesta.equalsIgnoreCase("s")); --> IgnoreCase para que acepte tanto "s" como "S"
        VALIDACIÓN --> si la respuesta es S, se sigue ejecutando el ciclo, si pone n o a, el ciclo finaliza*/

        // CICLO WHILE
        while (respuesta.equalsIgnoreCase("S")) {
            System.out.println("Ingresa una palabra");
            palabra = reader.next();
            cont++;

            System.out.println("Desea ingresa otra palabra (s(si) o n(no))");
            respuesta = reader.next();
        }
        System.out.println("Total palabras: "+ cont);
    }

}
