import traductor.Traductor;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cadena que deseas traducir.");

        String cadena=scanner.nextLine();
        Traductor traductor = new Traductor();
        String traducir = traductor.Traductor(cadena);
        System.out.println(traducir);
    }
}
