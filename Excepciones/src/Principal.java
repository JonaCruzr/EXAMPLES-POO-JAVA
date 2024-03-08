import java.io.IOException;

import keyword_throws.Throws;
import try_catch_finally.Try_catch_finally;

public class Principal {
    public static void main(String[] args){
        //EJEMPLO TRY...CATCH..FINALLY
        //Try_catch_finally prueba = new Try_catch_finally();
        //prueba.writeList();

        //EJEMPLO KEYWORD THROWS
        Throws prueba2 = new Throws();
        try{
            prueba2.findFile();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
