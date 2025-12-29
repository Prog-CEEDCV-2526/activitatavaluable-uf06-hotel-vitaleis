import java.util.Scanner;

public class Do_While_Ejemplo {
    public static void main(String[] args) throws Exception {
        /* Una pastelería nos ha pedido hacer un programa que haga presupuestos para pasteles. 
        El programa preguntará, en primer lugar, de qué sabor quiere el usuario el pastel. 
        Manzana, fresa, o chocolate. El pastel de manzana vale 18 euros, y el de 
        fresa, 16. En caso de seleccionar el pastel de chocolate, el programa ha de preguntar, 
        además, si el chocolate es negro o blanco. La primera opción vale 14 euros, y la segunda 10. 
        Finalmente, nos pregunta si nos añade la nata y si personaliza con el nombre. La nata suma 2,50 euros, 
        y la escritura del nombre 2,75. */

        // DECLARAR VARIABLES
        String sabor = "";
        String tipoChocolate= "";
        boolean nombre = false;
        boolean nata = false;
        double precio = 0.0;


       // INICIALIZAR ESTRUCTURA DE ENTRADA DE ESTÁNDAR
       Scanner reader = new Scanner (System.in) ;

       // CONTADOR
       // ACUMULADOR
       // INTERRUPTOR - SI (CONDICIÓN TRUE O FALSE)
       boolean saborCorrecto = false;

       do {
       // PEDIR AL USUARIO
       System.out.print ("Introduce el sabor del pastel (manzana, fresa o chocolate): ");
       sabor = reader.nextLine();

       /* El usuario puede escribir en mayúscula, minúscula o con espacios, vamos a adaptarnos para que el
       programa, aún no introduciendo la cadena tal cual queremos, lo entienda, y tenga salida. */
       // "CHOCOLATE"
       // " chocolate" 
       // "chocolate"

       // MÉTODO TRIM ---> sabor.trim() " chocolate " --> "chocolate"
       // MÉTODO TOLOWERCASE ---> sabor.toLowerCase() "CHOCOLATE" --> "chocolate"
       // TOUPERCASE ---> sabor.toUpercase() "chocolate" --> "CHOCOLATE"

       sabor = sabor.trim();
       sabor = sabor.toLowerCase();

            switch (sabor) {
                case "manzana":
                    saborCorrecto = true;
                    precio = 18.0;
                    break;
                case "fresa":
                    saborCorrecto = true;
                    precio = 16.0;
                    break;
                case "chocolate":
                    saborCorrecto = true;
                    break;
                default:
                    saborCorrecto = false;
                    break;
            }

            } while (saborCorrecto == false); 

            if (sabor.equals("chocolate")){
                boolean chocolateCorrecto = false;
                do {
                    // PEDIR AL USUARIO
                    System.out.print ("Elige el tipo de chocolate, negro o blanco: ");
                    tipoChocolate = reader.nextLine();

                    tipoChocolate = tipoChocolate.trim();
                    tipoChocolate = tipoChocolate.toLowerCase();

                    switch (tipoChocolate) {
                        case "negro":
                            chocolateCorrecto = true;
                            precio = 14.0;
                            break;
                        case "blanco":
                            chocolateCorrecto = true;
                            precio = 10.0;
                            break;
                        default:
                            chocolateCorrecto = false;
                            break;
                    }

                } while (chocolateCorrecto == false); 
            }
            /* TENGO UN SABOR DEL PASTEL CORRECTO 
            MANZANA
                NATA? NOMBRE?
            FRESA
                NATA? NOMBRE?
            CHOCOLATE
                NEGRO O BLANCO? */
            
            System.out.print("¿Quieres nata? (si o no): ");
            String quiereNata = reader.nextLine();

            quiereNata = quiereNata.trim();
            quiereNata = quiereNata.toLowerCase();

            if(quiereNata.equals("si")){
                nata = true;
            } else { // SI NO HA DICHO QUE SI ES QUE NO
                nata = false;                
            }
       
            System.out.print("¿Quieres poner el nombre? (si o no): ");
            String quiereNombre = reader.nextLine();

            quiereNombre = quiereNombre.trim();
            quiereNombre = quiereNombre.toLowerCase();

            if(quiereNombre.equals("si")){
                nombre = true;
            } else { // SI NO HA DICHO QUE SI ES QUE NO
                nombre = false;                
            }

            // VAMOS A DECIR LO QUE VALE EL PASTEL SIN LA NATA Y EL NOMBRE
            switch (sabor) {
                case "manzana":
                    System.out.println("Pastel de manzana "+precio);
                    break;
                case "fresa":
                    System.out.println("Pastel de fresa "+precio);
                    break;
                case "chocolate":
                    System.out.println("Pastel de chocolate "+tipoChocolate+": "+precio);
                    break;
            }
            if(nata){
                System.out.println("Con nata: 2.50");
            }
            if(nombre){
                System.out.println("Con nombre: 2.75");
            }

            if (nata){
                precio += 2.50;
            } 

            if (nombre){
                precio += 2.75;
            } 
            System.out.println("Total: "+precio);
    }

}
