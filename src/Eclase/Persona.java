package Eclase;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Persona {
    public String nombre;
    public String apellido;
    public String fNacimiento;
    public int identificacion;

    public Persona(String nombre, String apellido, String fNacimiento, int identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
        this.identificacion = identificacion;
    }

    public void imprimir (){
        System.out.println("Nombre: " + nombre +
                "\nApellido: " + apellido + "\nIdentificacion: " + identificacion+
                "\nFecha de macimiento: " + fNacimiento+
                "\nEdad: " + calcularEdad() + " años\n");


    }

    public int calcularEdad() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); ///
        LocalDate fechaNacimiento = LocalDate.parse(fNacimiento, formatter);
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }
}
/// se convirtio la fecha String en un formato feccha para poder calcular en que año nacio