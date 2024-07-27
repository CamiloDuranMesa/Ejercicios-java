import java.util.Scanner;

public class estructuraControlMultiple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1
        // Se necesita solicitar al usuario su destino de viaje
        System.out.println("Ejercicio 1: Seleccione el tipo de cocina que desea probar:");
        System.out.println("1. Italiana");
        System.out.println("2. Mexicana");
        System.out.println("3. China");
        System.out.println("4. Japonesa");
        System.out.print("Ingrese el número de su elección: ");
        int seleccion = scanner.nextInt();
        // Usamos scanner para solicitar el nuúmero de destino

        switch (seleccion) {
            case 1:
                System.out.println("Disfrute su viaje a Italia");
                break;
            case 2:
                System.out.println("Disfrute su viaje a México");
                break;
            case 3:
                System.out.println("Disfrute su viaje a China");
                break;
            case 4:
                System.out.println("Disfrute su viaje a Japón");
                break;
            default:
                System.out.println("Opción no válida. Por favor, elige un número entre 1 y 4.");
                break;
        }
        System.out.println(); // Espacio para separar los ejercicios

        // Ejercicio 2
        // Se necesita solicitar al cliente que actividad hara este fin de semana que sigue
        System.out.println("Ejercicio 2: Elija una actividad para el fin de semana:");
        System.out.println("1. Ir al cine");
        System.out.println("2. Hacer senderismo");
        System.out.println("3. Leer un libro");
        System.out.println("4. Hacer deporte");
        System.out.print("Ingrese el número de su elección: ");
        int eleccion = scanner.nextInt();
        // Usamos scanner para solicitar el nuúmero de actividad para el fin de semana

        switch (eleccion) {
            case 1:
                System.out.println("Escojiste ir al cine");
                break;
            case 2:
                System.out.println("Escojiste hacer senderismo en las montañas");
                break;
            case 3:
                System.out.println("Escojiste leer un libro este fin de semana");
                break;
            case 4:
                System.out.println("Escojiste hacer deporte este fin de semana");
                break;
            default:
                System.out.println("Opción no válida. Por favor, elige un número entre 1 y 4.");
                break;
        }
        System.out.println(); // Espacio para separar los ejercicios

        // Ejercicio 3
        // Se necesita solicitar al usuario el tipo de musica que le gusta escuchar a diario
        System.out.println("Ejercicio 3: Seleccione su género musical favorito:");
        System.out.println("1. Rock");
        System.out.println("2. Pop");
        System.out.println("3. Jazz");
        System.out.println("4. Clásica");
        System.out.print("Ingrese el número de su elección: ");
        int genero = scanner.nextInt();
        // Usamos scanner para solicitar el número referente al tipo de musica que le gusta

        switch (genero) {
            case 1:
                System.out.println("Te encanta el Rock.");
                break;
            case 2:
                System.out.println("Te encanta el Pop.");
                break;
            case 3:
                System.out.println("Te encanta el Jazz.");
                break;
            case 4:
                System.out.println("Te encanta la música Clásica.");
                break;
            default:
                System.out.println("Opción no válida. Por favor, elige un número entre 1 y 4.");
                break;
        }

        scanner.close();
    }
}
