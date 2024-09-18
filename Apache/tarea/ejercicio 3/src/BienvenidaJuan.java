
        
        import java.util.Scanner;

        public class BienvenidaJuan {

       public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String[] nombres = new String[5];

        // Leer los nombres de las personas
        for (int i = 0; i < 5; i++) {
           System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
           nombres[i] = scanner.nextLine();
       }

        // Verificar si alguno de los nombres es "Juan"
         for (String nombre : nombres) {
           if (nombre.equalsIgnoreCase("Juan")) {
               System.out.println("Bienvenido, Juan!");
               break;
           }
       }
   }
}
        
        
        
        
        
    
    

