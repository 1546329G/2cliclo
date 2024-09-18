/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        operacinoes nuevoObjeto=new operacinoes();
        int resultadoMultiplicacion,n1,n2;
        nuevoObjeto.sumar();
        nuevoObjeto.restar();
        
//ejemplo1:
//        Scanner entrada=new Scanner(System. in);
//        System.out.println("ingrese un numreo: ");
//        n1=entrada.nextInt();
//        
//        System.out.println("ingrese otro numero: ");
//        n2=entrada.nextInt();
 
//ejemplo 2: 

         n1=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero:"));
         n2=Integer.parseInt(JOptionPane.showInputDialog("ingrese oro numero:"));
         
         
        
        resultadoMultiplicacion=nuevoObjeto.multiplicacion( n1, n2);
        System.out.println("la matiplicacion es:"+resultadoMultiplicacion);
        
    
        }
}
