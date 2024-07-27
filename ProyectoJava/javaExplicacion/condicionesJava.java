
public class condicionesJava {
	
	public static void main(String[] args) {
		//Ejercicio 1
		//En base a la edad se dira si es mayor o menor de edad
		
		int edad= 19;
		
		if(edad>18) {
			System.out.println("Usted es mayor de edad");
			System.out.println();
		}else {
			System.out.println("Usted es menor de edad");
			System.out.println();
		}
		
		//Ejercicio 2
		//En base al promedio de notas se dira si paso o no la materia
		
		double nota1 = 3.0;
		double nota2 = 4.5;
		double nota3 = 2.0;
		
		double promedio = (nota1 + nota2 + nota3) / 3; // Corregir el operador de división
        
        if (promedio > 3.4) {
            System.out.println("Usted ha aprobado la materia.");
            System.out.println();
        } else {
            System.out.println("Usted no ha aprobado la materia.");
            System.out.println();
        }
        
        //Ejercicio 3
        //Para subir a una atracción se tiene que medir mas de 1.80
        
        
        double altura = 1.70;
        
        if(altura>1.80) {
        	System.out.println("Puede subirse a la atracción");
        	System.out.println();
        }else {
        	System.out.println("Debido a su estatura no se puede subir a la atracción");
        	System.out.println();
        }
		
	}
}
