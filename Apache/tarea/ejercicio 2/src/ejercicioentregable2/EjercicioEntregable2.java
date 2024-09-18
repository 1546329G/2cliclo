/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioentregable2;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class EjercicioEntregable2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nombre=new Scanner(System.in);
        Scanner edad=new Scanner(System.in);
        
        int edad1,edad2,edad3;
        String nombre1,nombre2,nombre3;
        
        System.out.println("Ingresa un nombre");
        nombre1=nombre.nextLine();
        System.out.println("Ingresa la edad");
        edad1=edad.nextInt();
        
        System.out.println("Ingresa un nombre");
        nombre2=nombre.nextLine();
        System.out.println("Ingresa la edad");
        edad2=edad.nextInt();
        
        System.out.println("Ingresa un nombre");
        nombre3=nombre.nextLine();
        System.out.println("Ingresa la edad");
        edad3=edad.nextInt();
        
        if (edad1>18)
        {
            System.out.println(nombre1+" es mayor de edad");
        }
        if (edad2>18)
        {
            System.out.println(nombre2+" es mayor de edad");
        }
        if (edad3>18)
        {
            System.out.println(nombre3+" es mayor de edad");
        }
    }
    
}
