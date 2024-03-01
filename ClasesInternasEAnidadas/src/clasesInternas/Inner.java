package clasesInternas;

/*
 * Clase anidada no estática (Inner Class)
 * Una clase anidada no estática es una clase dentro de otra clase. 
 * 
 * Tiene acceso a los miembros de la clase que la contiene (clase externa), incluso a los miembros privados. 
 * Se conoce comúnmente como clase interna.
 *
 * Dado que la clase interna existe dentro de la clase externa, debe instanciar 
 * primero la clase externa para poder instanciar la clase interna.
 */

/*
 * En el programa siguiente, hay dos clases anidadas: Procesador y RAM dentro de la clase externa CPU. 
 * Podemos declarar la clase interna como protegida. Por lo tanto, hemos declarado la clase RAM como protegida.
 *
 * Dentro de la clase Principal (con el nombre de "Inner"),
 *
 * Primero creamos una instancia de la clase externa CPU llamada cpu.
 * Usando la instancia de la clase externa, creamos objetos de las clases internas.
 * 
 * Nota: Utilizamos el operador punto (.) para crear una instancia de la clase interna utilizando la clase externa.
 */
class CPU {
    double precio;

    //clase interna
    class Procesador{
        double cores;
        String fabricante;

        double getCache(){
            return 4.3;
        }
    }

    //clase protegida anidada
    protected class RAM{
        double memoria;
        String fabricante;

        double getVelocidadReloj(){
            return 5.5;
        }
    }
}

public class Inner {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        
        //crear un objeto de la clase interna Procesador utilizando la clase externa
        CPU.Procesador procesador = cpu.new Procesador();

        //crear un objeto de la clase interna RAM usando la clase externa CPU
        CPU.RAM ram = cpu.new RAM();

        System.out.println("Caché del procesador = " + procesador.getCache());
        System.out.println("RAM velocidad de reloj = " + ram.getVelocidadReloj());
    }
}
