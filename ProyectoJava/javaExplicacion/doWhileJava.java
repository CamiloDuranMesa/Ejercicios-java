
public class doWhileJava {
    public static void main(String[] args) {
    	// Ejercicios usandos en while aplicandoles el do while
        
        // Ejercicio 1
        // Hacer un algoritmo en el que se sumen los números del 1 al 10
        int suma = 0;
        int num = 1;

        do {
            suma += num;
            num++;
        } while (num <= 10);

        System.out.println("La suma de los números desde el 1 al 10 es: " + suma);
        System.out.println();

        // Ejercicio 2
        // Hacer un algoritmo que imprima los números pares del 1 al 20
        int numero = 1;

        do {
            if (numero % 2 == 0) {
                System.out.println("Número par: " + numero);
            }
            numero++;
        } while (numero <= 20);
        System.out.println();

        // Ejercicio 3
        // Un algoritmo que cuente del 10 al 1
        int num1 = 10;

        do {
            System.out.println("Número: " + num1);
            num1--;
        } while (num1 > 0);
    }
}
