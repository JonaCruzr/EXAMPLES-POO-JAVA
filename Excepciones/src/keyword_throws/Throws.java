package keyword_throws;

import java.io.*;

/*
 * Si el archivo test.txt no existe, FileInputStream lanza una FileNotFoundException que extiende la clase IOException.
 * 
 * Este método findFile() declara que puede lanzar una excepción del tipo IOException usando la palabra clave throws. 
 * Esto significa que si se produce una excepción de tipo IOException dentro del método, no se manejará dentro del mismo; en cambio, 
 * se indicará que la excepción puede propagarse al código que llama a este método.
 */
public class Throws {
    public void findFile() throws IOException {
        //código que puede producir IOException
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }
}
