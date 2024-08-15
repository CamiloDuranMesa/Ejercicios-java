import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;


public class hashMap {
	public static void main(String[] args) {

        HashMap<Integer, String> mapaCosas = new HashMap<>();
        mapaCosas.put(1, "Hola");
        mapaCosas.put(2, "Adios");
        mapaCosas.put(5, "Que hora es?");
        mapaCosas.put(8, null);
        
        // Ejercicio 1 
        //Imprimir todos los pares clave-valor del HashMap
        System.out.println("Ejercicio 1: Imprimir todos los pares clave-valor del HashMap");
        
        for (Map.Entry<Integer, String> entry : mapaCosas.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
        
        System.out.println();
        
        // Ejercicio 2 
        //Imprimir todos los valores del HashMap y contar cuántos hay
        System.out.println("Ejercicio 2: Imprimir todos los valores del HashMap y contar cuántos hay");
        
        int contador = 0;
        
        for (String valor : mapaCosas.values()) {
            System.out.println("Valor: " + valor);
            contador++;
        }
        
        System.out.println("Número total de valores: " + contador);
        System.out.println();
        

        // Ejercicio 3 
        //Ordenar los valores del HashMap en orden alfabético

        ArrayList<String> listaValores = new ArrayList<>(mapaCosas.values());
        
        listaValores.removeIf(valor -> valor == null);
        
        Collections.sort(listaValores);
        
        System.out.println(listaValores);
    }
}
