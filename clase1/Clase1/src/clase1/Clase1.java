package clase1;

public class Clase1 {

    public static void main(String[] args) {
        
        // Ejercicio 1
        System.out.println("Sentencia While\n");
        int inicio = 3;
        int fin = 15;
        String opcion = "impar";
        
        while (inicio <= fin) {
            // impresion de numeros pares
            if (opcion == "par" && inicio % 2 == 0) {
                System.out.println("Pares: " + inicio);
            } else if (opcion == "impar" && inicio % 2 != 0) {
                System.out.println("Impares: " + inicio);
            }
            inicio++;
        }
        
        System.out.println("\nSentencia For\n");
        int variable1 = 2;
        int variable2 = 13;
        
        for (int i = variable2; i >= variable1; i--) {
            System.out.println(i);
        }
        
    }
    
}
