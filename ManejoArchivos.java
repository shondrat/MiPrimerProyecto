import java.io.File: //lectura
import java.io.FileWriter;
import java.io.IOException; //Necesario para manejar errores de entrada/salida
import java.uti.Scanner; //leer archivo

public class ManejoArchivos {
    public static void
    main(String[] args) {
       
       // ---Comienza el nuevo codigo (funcionalidad de escritura) ---
       try (FileWriter fileWriter = new FileWriter("datos.txt")) {
        //el try-with-resources asegura que el archivo se cierre automaticamente

        //escribe lineas en el archivos
        fileWriter.write("Linea para el ejercicio.\n");
        fileWriter.write("El ejercicio de escritura funciona");
        
        system.out.println("Los datos se han escrito en el archivo´datos.txt´.");

       } catch (IOException e) {
        //Manejo de errores si hay problemas

        system.out.println("Ocurrio un error al escribir el archivo.");
        e.printStackTrace();
       }
      
      //bloque 2
      system.out.println("\n---Leyendo el contendo del archivo ---"):
      try {
        file archivo = new file("datos.txt");
        Scanner scanner = new Scanner(archivo);

        //leer archivo linea por linea
        while
        (scanner.hasNextLine()) {
            String linea = 
            scanner.nextLine();

            system.out.println(linea);
        }

        scanner.close(); //siempre cierra el scanner

      } catch (IOException e) {
        system.out.println("ocurrio un error al leer el archivo.");
        e.printStackTrace();
      }
    }
}