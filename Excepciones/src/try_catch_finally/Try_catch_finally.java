package try_catch_finally;

import java.io.*;

public class Try_catch_finally {

    private int[] list = {5, 6, 8, 9, 2};
    
    public void writeList() {
        PrintWriter out = null; //variable de tipo PrintWriter es parte de paquete java.io

        try{
            System.out.println("Entrando al bloque try");
            
            //crear un nuevo archivo OutputFile.txt
            out = new PrintWriter(new FileWriter("OutputFile.txt"));

            //Escribir losd valores de la lista en el archi OutputFile.txt
            for(int i = 0; i < 10; i++){
                out.println("Valor: " + i + " = " + list[i]);
            }
        }catch(Exception e){
            System.out.println("Exception => " + e.getMessage());
        }finally{
            //comprobar si PrintWriter se ha abierto
            if (out != null) {
                System.out.println("Cerrando PrintWriter");
                out.close();
            }else{
                System.out.println("PrintWriter no abierto");
            }
        }
    }
}
