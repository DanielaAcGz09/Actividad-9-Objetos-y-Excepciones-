import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Captura de datos del usuario
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Peso en kg: ");
            double peso = scanner.nextDouble();

            System.out.print("Altura en metros: ");
            double altura = scanner.nextDouble();

            // Creación de un objeto de la clase Persona
            Persona persona = new Persona(nombre, peso, altura);

            // Calculo del IMC e impresión del diagnóstico
            System.out.println("Diagnóstico de " + persona.getNombre() + ": " + persona.calculaIMC());

        } catch (Exception e) {
            System.out.println("Error: Entrada inválida. Asegúrese de ingresar los datos correctamente.");
        }
    }
}
