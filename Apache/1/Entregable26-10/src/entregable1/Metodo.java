/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entregable1;

/**
 *
 * @author Dante
 */
public class Metodo {
    String nombre;
    String cedula;
    int edad;
    boolean casado;
    double salario;

    public Metodo(String nombre, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }
    
    public void rango()
    {
        if (edad<=21)
        {
            System.out.println("Su rango es: Principiante");
        }
        else if (edad>=22 && edad<=35) 
        {
            System.out.println("Su rango es: Intermedio");
        }
        else if (edad>35)
        {
            System.out.println("Su rango es: Senior");
        }
    }
    
    public void datosmostrados()
    {
        System.out.println("Nombre y Apellido: "+nombre);
        System.out.println("Cedula: "+cedula);
        System.out.println("Edad: "+edad);
        System.out.println("Casado: "+casado);
        System.out.println("Salario: "+salario);
    }
    
    public void aumentosalario(double aumento)
    {
        double nuevosalario=salario+(salario*aumento);
        System.out.println("El nuevo salario es: "+nuevosalario);
    }
    
}
