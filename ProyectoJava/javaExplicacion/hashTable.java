import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Collections;
import java.util.ArrayList;

public class hashTable {
    public static void main(String[] args) {

        Hashtable<Integer, String> tablaCosas = new Hashtable<>();
        tablaCosas.put(1, "Hola");
        tablaCosas.put(2, "Adios");
        tablaCosas.put(5, "Que hora es?");
        tablaCosas.put(8, "Como estas?");
        
        // Ejercicio 1
        //Imprimir todos los pares clave-valor del Hashtable
        
        Enumeration<Integer> claves = tablaCosas.keys();
        
        while (claves.hasMoreElements()) {
            Integer clave = claves.nextElement();
            String valor = tablaCosas.get(clave);
            System.out.println("Clave: " + clave + ", Valor: " + valor);
        }
        
        System.out.println();
        
     // Ejercicio 2 
     // Imprimir todos los valores del Hashtable y contar cuántos hay
        
        Enumeration<String> valores = tablaCosas.elements();
        

        int contador = 0;
        

        while (valores.hasMoreElements()) {
            String valor = valores.nextElement();
            System.out.println("Valor: " + valor);
            contador++;
        }
        

        System.out.println("Número total de valores: " + contador);
        System.out.println();
        
        // Ejericio 3
        //Suma dos valores del array
        
        ArrayList<String> listaValores = new ArrayList<>(tablaCosas.values());
        Collections.sort(listaValores);
        
        System.out.println(listaValores);
        
    }
}
