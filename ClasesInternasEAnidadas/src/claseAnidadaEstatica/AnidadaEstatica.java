package claseAnidadaEstatica;

/*
 * Podemos definir una clase estática dentro de otra clase. Esta clase se conoce como clase estática anidada. 
 * 
 * A diferencia de las clases internas, una clase estática anidada no puede acceder a los miembros NO estaticos de la clase externa.
 * 
 * Esto se debe a que la clase estática anidada no requiere crear una instancia de la clase externa.
 */

/*
 * En el programa siguiente, hemos creado una clase estática llamada USB dentro de la clase TarjetaMadre. 
 * estamos creando un objeto USB usando el nombre de la clase externa. (Esto dentro del main)
 */
class TarjetaMadre{

    static class USB{
        int usb2 = 2;
        int usb3 = 3;

        int getTotalPuertos(){
            return usb2 + usb3;
        }
    }
}
public class AnidadaEstatica {
    public static void main(String[] args) {
        //crear un objeto de la clase estática anidada utilizando el nombre de la clase externa
        TarjetaMadre.USB usb = new TarjetaMadre.USB();
        System.out.println("Total d epuertos = " + usb.getTotalPuertos());
    }
}
