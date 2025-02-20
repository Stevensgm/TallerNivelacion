import java.util.Scanner;
public class Inverti {
          public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             System.out.print("Ingresa una cadena de texto: ");
             String texto = scanner.nextLine();


             String invertido = "";

             for (int i = texto.length() - 1; i >= 0; i--) {/// -1 para comenzar de ultimo, de atra hacia adelante

                 invertido += texto.charAt(i);
        }

        System.out.println("Texto invertido: " + invertido);

        scanner.close();
    }
}


