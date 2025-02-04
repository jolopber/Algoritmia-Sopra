import java.util.Scanner;

public class DescendenteParImpar {
    public static void main(String[] args) {

        Scanner consola = new Scanner (System.in);
        System.out.print("Introduzca un número: ");
        Integer numero = consola.nextInt();

        if ( numero%2==0 ) {
            for( int i = numero; i >=0 ; i = i -2 ) {
                System.out.println(i);
            }

        } else {
            for( int i = numero; i >=1 ; i = i -2 ) {
                System.out.println(i);
            }

        }

    }

}
