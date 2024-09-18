/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e2;

import java.util.Scanner;

/**
 *
 * @author ALUMNO
 */
public class E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      //1:
    
//         
//       String  A = "gandy";
//       System.out.println(A);
//       char letra;
//       int numeroLetras;
//       String subTexto;
//       letra = A.charAt(0);
//       numeroLetras = A.length();
//       subTexto = A.substring(1,5);
//       
//       System.out.println (A);
//       System.out.println("el caracter extraido es: "+letra);
//       System.out.println("el texto tiene:"+numeroLetras+"caracteres");
//       System.out.println("el nuevo sub texto es: "+subTexto);
//       
//        


        //2:
        
        Scanner ingresaTexto=new Scanner(System.in);
        String nombre;
        System.out.println("ingrese tu nombre: ");
        nombre=ingresaTexto.nextLine();
        
        char letra;
        int longitud;
        String nuevoTexto;
        
        letra=nombre.charAt(2);
        longitud = nombre.length();
        nuevoTexto=nombre.substring(1,4);
        
        System.out.println("mi nombre es : "+longitud);
        System.out.println("la primera letra del nombre es: "+letra );
        System.out.println("Mi nombre tiene "+longitud+"caracteres");
        System.out.println("el nuevo texto es: "+nuevoTexto);
       
//        
                


         //3 
//        
//        int y,z;
//        
//        y=10;
//        z=20;
//        
//        //forma 1
//        // z=y+z;
//        //forma 2 
//        // z+=y;
//        
//       // z=z+1;
//        //z+=1;
//        z++;
//        
//        
//        
//        System.out.println("la suma es: "+z);
//        
//        

    }
    
}
