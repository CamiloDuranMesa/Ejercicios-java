
public class constantesJava {
	public static void main(String[] args) {
		//Ejercicio 1
		
		// Definir la constante para PI
        final double PI = 3.141592653589793;

        // Definir la variable para el radio
        double radio = 7.5;

        // Calcular el área del círculo
        double area = PI * radio * radio;

        // Mostrar el resultado
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
        System.out.println();
        
        //Ejercicio 2
        
        // Sacar un descuento del 10% a un producto
        final double DESCUENTO_PORCENTAJE = 10.0; // Descuento del 10%

        // Precio original del producto
        double precioOriginal = 150.0; 

        // Calcular el monto del descuento
        double montoDescuento = (precioOriginal * DESCUENTO_PORCENTAJE) / 100;

        // Calcular el precio final después del descuento
        double precioFinal = precioOriginal - montoDescuento;

        // Mostrar los resultados
        System.out.println("Precio original del producto: $" + precioOriginal);
        System.out.println("Monto del descuento: $" + montoDescuento);
        System.out.println("Precio final después del descuento: $" + precioFinal);
        System.out.println();
        
        //Ejercicio3
        
        //Calcular el impuesto sobre un recibo del agua
        
     // Definir constantes
        final double TASA_IMPUESTO = 0.10; // Tasa de impuesto del 15%

        // Definir el precio del recibo a pagar
        double precioRecibo= 200.0; 

        // Calcular el monto del impuesto
        double montoImpuesto = precioRecibo * TASA_IMPUESTO;

        // Calcular el pago final después de aplicar el impuesto
        double pagoFinal = precioRecibo + montoImpuesto;

        // Mostrar los resultados
        System.out.println("Precio original del recibo: $" + precioRecibo);
        System.out.println("Monto del impuesto: $" + montoImpuesto);
        System.out.println("Pago final después del impuesto: $" + pagoFinal);
        


 
	}
}
