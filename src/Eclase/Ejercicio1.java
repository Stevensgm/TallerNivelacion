package Eclase;

public class Ejercicio1 {

public static void main (String[] args) {
    Persona persona1 = new Persona("Carlos", "Giraldo", "02/04/2020", 1212121);

    Persona persona2 = new Persona("Elisa", "Medina", "02/04/2021", 111111);

    System.out.println("Informacion de la persona 1: ");
    persona1.imprimir();

    System.out.println("Informacion de la persona 2: ");
    persona2.imprimir();
}

}
