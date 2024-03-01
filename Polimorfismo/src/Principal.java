/*
 * Para que exista Polimorfismo tiene que haber herencia.
 * El Polimorfismo es la habilidad de poseer varias formas. Es decir,
 * la misma entidad (método u operador o clase) puede realizar diferentes
 * operaciones en diferentes escenarios
 */

/*
 * En el Ejemplo siguiente hemos creado una superclase "Animal" y dos subclases ("Gato" y "Perro")
 * Observe el uso delmétodo sonido(). El proposito del metodo sonido() es emitir un sonido. Pero,
 * el sonido que emite un Gato es diferente al sonido que emite un Perro.
 * 
 * Por lo tanto, el metodo sonido() se comporta diferente en diferentes clases.
 * 
 * Podemos decir que el método sonido() es POLIMORFICO
 */

class Animal{
    public void sonido(){
        System.out.println("Grrrr...");
    }
}

class Gato extends Animal{
    @Override
    public void sonido(){
        System.out.println("Miau...");
    }
}

class Perro extends Animal{
    @Override
    public void sonido(){
        System.out.println("Woof...");
    }
}

public class Principal {
    public static void main(String[] args){
        Gato gato_1 = new Gato();
        gato_1.sonido();
        
        Perro perro_1 = new Perro();
        perro_1.sonido();
    }
}
