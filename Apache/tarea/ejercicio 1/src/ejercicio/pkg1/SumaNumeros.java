package ejercicio.pkg1;

import java.util.Scanner;

public class SumaNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 3 números mayores a 10: ");

       
            System.out.print("Número 1: ");
            float num1 = scanner.nextFloat();

            System.out.print("Número 2: ");
            float num2 = scanner.nextFloat();

            System.out.print("Número 3: ");
            float num3 = scanner.nextFloat();

            if (num1 < 10 || num2 <  10 || num3 < 10) {
                 float suma = num1+num2+num3;
                  System.out.println("La suma de los 3 números es: " + suma);

           
            } else {
                 System.out.println("Error: Alguno de los números ingresados es menor o igual que 10:");
                   }
        
        }
    }  

    