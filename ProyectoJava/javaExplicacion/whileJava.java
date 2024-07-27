
public class whileJava {
	public static void main(String[] args) {
		//Ejercicio1
		//Hacer un algoritmo en el que se sumen los números edl 1 al 10
        int suma = 0;
        int num = 1;

        while (num <= 10) {
            suma += num;
            num++;
        }

        System.out.println("La suma de los números de los numeros desde el 1 al 10 es: " + suma);
        System.out.println();
    
	
	
		//Ejercicio2
        //Hacer un algoritmo que imprima los numeros pares del 1 al 20
		int numero = 1;

		while (numero <= 20) {
        if (numero % 2 == 0) {
        	System.out.println("Numeros par:");
            System.out.println(numero);
        }
        numero++;
        
		}
		
		//Ejercicio 3
		// Un algoritmo que cuente del 10 al 1
		int num1 = 10;
		
        while (num1 > 0) {
        	System.out.println("Numeros del 10 al 1:");
            System.out.println(num1);
            num1--;
        }
        
	}
}
