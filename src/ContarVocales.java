import java.util.Scanner;
public class ContarVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // pedir que pida la palabra
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine().toLowerCase();



        // Contar vocales y consonantes
        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            // Verificar si la letra es una vocal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            }
            // Si no es una vocal y es una letra, contar como consonante
            else if (Character.isLetter(letra)) {
                consonantes++;
            }
        }

        // Mostrar los resultados
        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);

        // Cerrar el scanner
        /// carlos steven giraldo medina
        scanner.close();
    }
}

