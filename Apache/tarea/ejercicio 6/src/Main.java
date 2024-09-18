import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int cantidad;
        double precio = 0;
        double total = 0;

        System.out.println("Elija la opción deseada: ");
        System.out.println("(1) Helado");
        System.out.println("(2) Torta");
        System.out.println("(3) Gelatina");
        System.out.println("(4) Galleta");
        System.out.println("(5) Alfajor");
        System.out.println("(6) Turrón");

        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                precio = 2.5;
                break;
            case 2:
                precio = 4;
                break;
            case 3:
                precio = 1.2;
                break;
            case 4:
                precio = 1.5;
                break;
            case 5:
                precio = 2.3;
                break;
            case 6:
                precio = 3.5;
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }

        System.out.print("Ingrese la cantidad de unidades: ");
        cantidad = scanner.nextInt();

        total = precio * cantidad;

        System.out.println("El monto a pagar es: S/ " + total);
    }
}