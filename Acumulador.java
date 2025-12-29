public class Acumulador {
    //SUMA LOS NÚMERO PARES ENTRE 100 Y 200
    //SUMA LOS NÚMERO IMPARES ENTRE 101 Y 199
    public static void main (String[] args) {
        // CONTADOR - SI
        // ACUMULADOR - SI
        // INTERRUPTOR - NO

        int cont = 100; //COMIENZA POR 100
        int sumaParells = 0; //ACUMULADOR
        int sumaImpares = 0; //ACUMULADOR IMPAR

        while (cont <= 200) {
            // MIRAR SI ES PAR
            if (cont % 2 == 0) { // COMPRUEBA SI cont ES UN número PAR
                // SUMARLO/ACUMULARLO SI ES PAR
                sumaParells += cont;                
            } 
            if (cont % 2 == 1) { // COMPRUEBA SI cont ES UN número IMPAR
                // SUMAR/ACUMULAR SI ES IMPAR
                sumaImpares += cont;
            } 
            // INCREMENTAR EL CONTADOR
            cont++;
        }
        System.out.println ("La suma de los pares es "+sumaParells);
        System.out.print("La suma de los impares es "+sumaImpares);

    }

}
