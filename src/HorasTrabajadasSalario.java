import java.util.Scanner;

public class HorasTrabajadasSalario {
    public static void main(String[] args) {

        Scanner consola1 = new Scanner (System.in);
        System.out.print("Introducir horas trabajadas: ");
        Double horasTrabajadas = consola1.nextDouble();

        Scanner consola2 = new Scanner (System.in);
        System.out.print("Introducir tarifa: ");
        Double tarifa = consola2.nextDouble();

        Double sueldo;
        if ( horasTrabajadas > 40 ) {
            Double tarifaExtra = tarifa * 1.5;
            Double horasExtras = horasTrabajadas - 40;
            sueldo = (tarifa*40) + (tarifaExtra*horasExtras);
        } else {
            sueldo = tarifa*horasTrabajadas;
        }

        System.out.println("El sueldo del trabajador es de: "+ sueldo);


    }
}
