public class sumaArraysJava {
    public static void main(String[] args) {
        int[] arreglo1 = {1, 2, 3, 4};
        int[] arreglo2 = {5, 6, 7, 8};

        // Ejercicio 1
        // Sumar y mostrar los elementos de ambos arrays
        int[] sumaArray = new int[arreglo1.length];
        
        for (int i = 0; i < arreglo1.length; i++) {
            sumaArray[i] = arreglo1[i] + arreglo2[i];
        }

        System.out.println("Suma de elementos de ambos arrays:");
        for (int i = 0; i < sumaArray.length; i++) {
            System.out.println(sumaArray[i]);
        }
        
        System.out.println();
        
        // Ejercicio 2
        // Sumar todos los elementos del array resultado de la suma anterior y mostrar el resultado
        int sumaTotal = 0;
        for (int i = 0; i < sumaArray.length; i++) {
            sumaTotal += sumaArray[i];
        }
        System.out.println("La suma total de todos los elementos es: " + sumaTotal);
        
        System.out.println();
        
        // Ejercicio 3
        // Buscar si la suma de los elementos en la misma posición de ambos arrays da un valor específico
        int valorBuscado = 10;
        boolean encontrado = false;

        for (int i = 0; i < sumaArray.length; i++) {
            if (sumaArray[i] == valorBuscado) {
                System.out.println("La suma de los elementos en la posición " + i + " da el valor " + valorBuscado + ".");
                encontrado = true;
                break; 
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ninguna suma de elementos que dé el valor " + valorBuscado + ".");
        }
    }
}
