package appcadenas;
import java.util.Scanner;

public class AppCadenas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        Contador c = new Contador();
        System.out.println("Ingresa una frase:");
        s = scan.nextLine();
        System.out.println("\n"+s);
        System.out.println("Hay "+c.contPal(s) +" palabras en la cadena "+s);
    }
}
