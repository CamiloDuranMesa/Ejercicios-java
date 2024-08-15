
public class arraysJava {
	public static void main(String[] args) {

		String arregloCosas[];
		arregloCosas = new String[4];
		
		arregloCosas[0] = "Hola";
		arregloCosas[1] = "Adios";
		arregloCosas[2] = "Que hora es?";
		arregloCosas[3] = "Como estas?";
		
		// Ejercicio1
		//Escribir un programa que imprima todos los elementos del array arregloCosas en la consola.		
        for (int i = 0; i < arregloCosas.length; i++) {
            System.out.println(arregloCosas[i]);
        }
        
        System.out.println();
        // Ejercicio 2
        //Escribir un programa que cuente y muestre la cantidad de caracteres en cada cadena del array arregloCosas.
        for (int i = 0; i < arregloCosas.length; i++) {
            System.out.println("El elemento \"" + arregloCosas[i] + "\" tiene " + arregloCosas[i].length() + " caracteres.");
        }
        
        //Ejercicios 3
        //Escribe un programa que busque una palabra específica en el array arregloCosas y muestre un mensaje indicando si la palabra fue encontrada o no.
        System.out.println();
        String palabraBuscada = "Adios";
        boolean encontrado = false;

        for (int i = 0; i < arregloCosas.length; i++) {
            if (arregloCosas[i].equals(palabraBuscada)) {
                System.out.println("La palabra \"" + palabraBuscada + "\" fue encontrada en la posición " + i + ".");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("La palabra \"" + palabraBuscada + "\" no se encontró en el array.");
        }
	}
}
