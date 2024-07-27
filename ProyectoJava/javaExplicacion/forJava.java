
public class forJava {
	public static void main(String[] args) {
        // Ejercicio 1
        // Hacer un algoritmo en el que se sumen los números del 1 al 10
        int suma = 0;
        for (int num = 1; num <= 10; num++) {
            suma += num;
        }
        System.out.println("La suma de los números desde el 1 al 10 es: " + suma);
        System.out.println();

        // Ejercicio 2
        // Hacer un algoritmo que imprima los números pares del 1 al 20
        for (int numero = 1; numero <= 20; numero++) {
            if (numero % 2 == 0) {
                System.out.println("Número par: " + numero);
            }
        }
        System.out.println();

        // Ejercicio 3
        // Un algoritmo que cuente del 10 al 1
        for (int num1 = 10; num1 > 0; num1--) {
            System.out.println("Número: " + num1);
        }
    }
}
