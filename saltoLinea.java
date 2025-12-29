public class saltoLinea {

// Ejemplo con \n
String mensaje = "Hola,\n¡Bienvenido!";
System.out.println(mensaje);

// Ejemplo con System.lineSeparator()
String mensajeSeparador = "Primera línea" + System.lineSeparator() + "Segunda línea";
System.out.println(mensajeSeparador);

// Ejemplo con printf y %n
System.out.printf("Línea 1%nLínea 2%n");

}
