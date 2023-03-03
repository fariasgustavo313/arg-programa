package clase01;

public class Clase01 {

    public static void main(String[] args) {
        
        // Ejercicio 2 punto D
        double ingresos = 520000;
        int cantAutos = 3;
        int cantAnios = 3;
        int cantInmuebles = 3;
        boolean poseeActivos = true;
        
        if (ingresos >= 489083 || (cantAutos >= 3 && cantAnios < 5) || cantInmuebles >= 3 || poseeActivos == true) {
            System.out.println("Pertenece al segmento de ingresos altos");
        } else {
            System.out.println("NO pertenece al segmento de ingresos altos");
        }
    }
    
}
