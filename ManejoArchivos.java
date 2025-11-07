import java.io.FileWriter;
import java.io.IOException; //
Necesario para manejar errores de entrada/salida
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
       //---- Termina el codigo nuevo ----
    }
}