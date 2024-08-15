import java.util.ArrayList;
import java.util.Collections;


public class arrayList {
	public static void main(String[] args) {
	
        ArrayList<String> listaCosas = new ArrayList<>();

        listaCosas.add("Hola");
        listaCosas.add("Adios");
        listaCosas.add("Que hora es?");
        listaCosas.add("Como estas?");
        
     // Ejercicio 1
     // Ordenar los elementos en orden alfabético y luego imprimirlos
        //
        Collections.sort(listaCosas);
        System.out.println(listaCosas);
        System.out.println();
        
     // Ejercicio 2
     //Ahora hay que contar y mostrar la cantidad de caracteres en cada cadena del ArrayList
        for (String item : listaCosas) {
            System.out.println("El elemento \"" + item + "\" tiene " + item.length() + " caracteres.");
        }
        
        System.out.println();
     // Ejercicio 3
     // Buscar una palabra específica en el ArrayList
        String palabraBuscada = "Adios";
        boolean encontrado = false;

        for (int i = 0; i < listaCosas.size(); i++) {
            if (listaCosas.get(i).equals(palabraBuscada)) {
                System.out.println("La palabra \"" + palabraBuscada + "\" fue encontrada en la posición " + i + ".");
                encontrado = true;
                break; 
            }
        }

        // Mensaje después del bucle
        if (!encontrado) {
            System.out.println("La palabra \"" + palabraBuscada + "\" no se encontró en el ArrayList.");
        }
	}
}
