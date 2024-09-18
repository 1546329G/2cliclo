import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        if (edad >= 0 && edad <= 5) {
            System.out.println("Esta en la Primera Infancia");
        } else if (edad >= 6 && edad <= 11) {
            System.out.println("Esta en la Infancia");
        } else if (edad >= 12 && edad <= 18) {
            System.out.println("Esta en la Adolescencia");
        } else {
            System.out.println("Edad no válida. La edad debe ser entre 0 y 18 años.");
        }
    }
}
