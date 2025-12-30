import java.util.Scanner;

public class App {

    public static void main (String [] args) throws Exception {

        /* 1.1 Crear un sistema informatizado de gestión de reservas que simplifique y automatice el proceso.
        - Permitir gestionar habitaciones disponibles.
        - hacer reservar con servicios adicionales.
        - Calcular el coste total con IVA y consultar la información necesaria de manera rápida y precisa.
        
        
        1.2 El hotel dispone de 3 tipos de habitaciones: Estándar, suite y Deluxe, con una disponibilidad inicial de 
        30, 20 y 10 habitaciones respectivamente.
        Precios por noche:
        - Estándar: 50€
        - Suite: 100€
        - Deluxe: 150€
        Servicios adicionales:
        - Almorzar: 10€
        - Gimnasio: 15€
        - Spa: 20€
        - Piscina: 25€
        Se aplica un IVA del 21% al coste total.
        */

        // DECLARAR VARIABLES
        String habitacion = "";
        double precio = 0.0;
        boolean almuerzo = false;
        boolean gimnasio = false;
        boolean spa = false;
        boolean piscina = false;
        // cantidad disponible según el tipo de habitación
        int disponibleEstandar = 30;
        int disponibleSuite = 20;
        int disponibleDeluxe = 10;
        // CÓDIGO RESERVA
        int codigoReserva = 0;


        // INICIALIZAR ESTRUCTURA DE ENTRADA ESTÁNDAR
        Scanner reader = new Scanner (System.in);

        boolean habitacionCorrecta = false;

        do {
        // PEDIR AL USUARIO
        System.out.print ("Introduce el tipo de habitación (estandar, suite o deluxe): ");
        habitacion = reader.nextLine();

        habitacion = habitacion.trim();
        habitacion = habitacion.toLowerCase();
        
            switch (habitacion) {
                case "estandar":
                    if  (disponibleEstandar > 0) { // cuando sea mayor de 0 da correcto
                        habitacionCorrecta = true;
                        precio = 50.0;
                        break;
                    } else {
                        System.out.println("Lo sentimos, no quedan habitaciones Estandar disponibles.");
                        habitacionCorrecta = false;
                    }
                case "suite":
                    if (disponibleSuite > 0) {
                    habitacionCorrecta = true;
                    precio = 100.0;
                    break;
                    } else {
                        System.out.println("Lo sentimos, no quedan habitaciones Suite disponibles.");
                        habitacionCorrecta = false;
                    }
                case "deluxe":
                    if (disponibleDeluxe > 0) {
                    habitacionCorrecta = true;
                    precio = 150;
                    break;
                    } else {
                        System.out.println("Lo sentimos, no quedan habitaciones Deluxe disponibles.");
                        habitacionCorrecta = false;
                    }
                default:
                    habitacionCorrecta = false;
                    break;
            }
        } while (habitacionCorrecta == false);

        // ACTUALIZAR NÚMERO DE HABITACIONES
        switch (habitacion) {
            case "estandar":
                disponibleEstandar--;
                break;
            case "suite":
                disponibleSuite--;
                break;
            case "deluxe":
                disponibleDeluxe--;
                break;
        }

        /* TENGO UN TIPO DE HABITACIÓN ELEGIDA
        ESTÁNDAR
            ALMUERZO? GIMNASIO? SPA? PISCINA?
        SUITE
            ALMUERZO? GIMNASIO? SPA? PISCINA?
        DELUXE
            ALMUERZO? GIMNASIO? SPA? PISCINA? */


        // ALMUERZO
        System.out.print("¿Quieres almuerzo? (si o no): ");
        String quiereAlmuerzo = reader.nextLine();

        quiereAlmuerzo = quiereAlmuerzo.trim();
        quiereAlmuerzo = quiereAlmuerzo.toLowerCase();

        if (quiereAlmuerzo.equals("si")) {
            almuerzo = true;
        } else { // SI NO HA DICHO QUE SI, ENTONCES ES QUE NO
            almuerzo = false;
        }

        // GIMNASIO
        System.out.print("¿Quieres gimnasio? (si o no): ");
        String quiereGimnasio = reader.nextLine();

        quiereGimnasio = quiereGimnasio.trim();
        quiereGimnasio = quiereGimnasio.toLowerCase();

        if (quiereGimnasio.equals("si")) {
            gimnasio = true;
        } else { // SI NO HA DICHO QUE SI, ENTONCES ES QUE NO
            gimnasio = false;
        }

        // SPA
        System.out.print("¿Quieres spa? (si o no): ");
        String quiereSpa = reader.nextLine();

        quiereSpa = quiereSpa.trim();
        quiereSpa = quiereSpa.toLowerCase();

        if (quiereSpa.equals("si")) {
            spa = true;
        } else { // SI NO HA DICHO QUE SI, ENTONCES ES QUE NO
            spa = false;
        }

        // PISCINA
        System.out.print("¿Quieres piscina? (si o no): ");
        String quierePiscina = reader.nextLine();

        quierePiscina = quierePiscina.trim();
        quierePiscina = quierePiscina.toLowerCase();

        if (quierePiscina.equals("si")) {
            piscina = true;
        } else { // SI NO HA DICHO QUE SI, ENTONCES ES QUE NO
            piscina = false;
        }

        // VAMOS A DECIR LO QUE VALE LA HABITACIÓN SIN LOS EXTRAS
        switch (habitacion) {
            case "estandar":
                System.out.println("Habitaación estándar "+ precio);
                break;
            case "suite":
                System.out.println("Habitación suite " + precio);
                break;
            case "deluxe":
                System.out.println("Habitación deluxe " + precio);
            default:
                break;
        }

        if (almuerzo) {
            System.out.println("Con almuerzo: 10.0");
        }
        if (gimnasio) {
            System.out.println("Con gimnasio: 15.0");
        }
        if (spa) {
            System.out.println("Con spa: 20.0");
        }
        if (piscina) {
            System.out.println("Con piscina: 25.0");
        }

        if (almuerzo) {
            precio += 10.0;
        }
        if (gimnasio) {
            precio += 15.0;
        }
        if (spa) {
            precio += 20.0;
        }
        if (piscina) {
            precio += 25.0;
        }

        // CÁLCULO DEL 21% IVA AL COSTE TOTAL
        double iva = precio * 0.21;
        double totalIva = precio + iva;

        System.out.println("");
        System.out.println("Subtotal: " + precio + " euros");
        System.out.println("IVA (21%): " + iva + " euros");
        System.out.println("Total a pagar: " + totalIva + " euros");

        //  MOSTRAR DISPONIBILIDAD Y PRECIOS
        System.out.println("Disponibildad de habitaciones:");
        System.out.println("Estandar: " + disponibleEstandar + " habitaciones - 50 euros/noche");
        System.out.println("Deluxe: " + disponibleSuite + " habitaciones - 100 euros/noche");
        System.out.println("Suite: " + disponibleDeluxe + " habitaciones - 150 euros/noche");
        System.out.println("");

        // GENERAR CÓDIGO DE 3 DÍGITOS

        switch (habitacion) {
            case "estandar":
                codigoReserva = 300 + disponibleEstandar; // 300 + (30-1) = 329
                break;
            case "suite":
                codigoReserva = 200 + disponibleSuite; // 200 + (20-1) = 219
                break;
            case "deluxe":
                codigoReserva = 100 + disponibleDeluxe; // 100 + (10-1) = 109
                break;
            default:
                break;
        }
        System.out.println("Código de reserva: " + codigoReserva);

    // prueba
        
    }

}
