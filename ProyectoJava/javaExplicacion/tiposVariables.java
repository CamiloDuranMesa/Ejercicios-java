
public class tiposVariables {
	public static void main(String[] args) {
		//Ejercicio 1
		short num1 = 100;
		int num2 = 2000;
		
		//Se suman estas 2 varibables
		
		int suma = num1 + num2;
		
		// Se muestran los resultados de la suma de las 2 varibales
		
		System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
		System.out.println();
		
		//Ejercicio 2 
		char letra1 = 'H';
        char letra2 = 111;
        char letra3 = 'l';
        char letra4 = 97;

        // Concatenar los caracteres, usamos string aqui para unir las letras
        String palabra = "" + letra1 + letra2 + letra3 + letra4;

        // Mostrar el resultado
        
        System.out.println("La palabra formada es: " + palabra);
        System.out.println();
        
        //Ejercicio 3
        float radio = 5.5f; 
        double lado = 4.0; 

        // Calcular el área del círculo, usamos math.pi para obtener el valor pi
        double areaCirculo = Math.PI * radio * radio;

        // Calcular el área del cuadrado
        double areaCuadrado = lado * lado;

        // Comparar las áreas
        boolean esCirculoMayor = areaCirculo > areaCuadrado;

        // Mostrar los resultados
        System.out.println("El área del círculo con radio " + radio + " es: " + areaCirculo);
        System.out.println("El área del cuadrado con lado " + lado + " es: " + areaCuadrado);
        System.out.println("¿Es el área del círculo mayor que el área del cuadrado? " + esCirculoMayor);

	}
}
