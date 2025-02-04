import java.util.Objects;
import java.util.Scanner;

public class ClasificacionPersonas {

    static class Persona {
        String sexo;
        Integer edad;

        public Persona(String sexo, Integer edad) {
            this.sexo = sexo;
            this.edad = edad;
        }
    }

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        Persona[] personas = new Persona [3];
        for ( int i = 0; i<3; i++ ) {
            System.out.print("Introducir sexo (hombre/mujer): ");
            String sexo = consola.next();
            System.out.print("Introducir edad: ");
            Integer edad = consola.nextInt();
            personas[i] = new Persona(sexo,edad);
        }

        Integer personasMayoresEdad = 0;
        Integer personasMenoresEdad = 0;
        Integer personasMascMay = 0;
        Integer personasFemMay = 0;
        Integer personasFemMen = 0;
        Double porcentajeMayores = 0.0;
        Double porcentajeMujeres = 0.0;

        for ( Persona pers:personas ) {
            if ( pers.edad >= 18 ) {
                personasMayoresEdad += 1;
                if (Objects.equals(pers.sexo, "hombre")) {
                    personasMascMay += 1;
                } else {
                    personasFemMay += 1;
                }
            } else {
                personasMenoresEdad += 1;
                if (Objects.equals(pers.sexo, "mujer")) {
                    personasFemMen += 1;
                }
            }
        }

        porcentajeMayores = ((personasMascMay.doubleValue() + personasFemMay.doubleValue())*100)/50;
        porcentajeMujeres = ((personasFemMen.doubleValue() + personasFemMay.doubleValue())*100)/50;

        System.out.println("Cantidad de personas mayores de edad(18 años o más): " + personasMayoresEdad);
        System.out.println("Cantidad de personas menores de edad: " + personasMenoresEdad);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + personasMascMay);
        System.out.println("Cantidad de personas femeninas menores de edad: " + personasFemMen);
        System.out.println("Porcentaje que representan las personas mayores de edad respecto al total de personas: " + porcentajeMayores);
        System.out.println("Porcentaje que representan las mujeres respecto al total de personas: " + porcentajeMujeres);

    }
}
