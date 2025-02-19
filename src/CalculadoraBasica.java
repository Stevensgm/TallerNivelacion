import java.util.Scanner;   ///// utilice Scanner por que es solo para leer datos y no para hacer cosas graficas
public class CalculadoraBasica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/// se coloca lo que quiero que se vea
        /// mi menu de opciones
        System.out.println("mi calculadora basica");
        System.out.println("Selecciona la operación que deseas realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = scanner.nextInt();

        System.out.print("Digite el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                if (num2 > 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Malo: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("**** error error error ****.");
                break;
        }
        /// carlos steven giraldo medina
        scanner.close();
    }
}