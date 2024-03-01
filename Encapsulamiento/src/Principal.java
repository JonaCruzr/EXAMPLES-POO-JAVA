/*
 * El Encapsulamiento nos ayuda a mantener juntos los atributos y métodos relacionados, 
 * lo que hace que nuestro código sea más limpio y fácil de leer.
 * 
 * Tambien podemos lograr ocultar atributos y/o métodos para que solo
 * puedan ser accedidos desde la misma clase. Evita que las clases externas accedan
 * a los campos y metodos de una clase y los modifiquen
 */

/*
 * En el ejemplo siguiente, tenemos un atributo privado "edad".
 * Como es privado, no se puede acceder a él desde fuera de la clase.
 * 
 * Para acceder a la edad, hemos utilizado métodos público getEdad() y setEdad()
 * 
 * Hacer la edad privada nos permite restringir el acceso no autorizado desde fuera de la clase.
 * 
 * Si intentamos acceder al campo edad desde la clase Principal, obtendremos un error.
 */

 class Persona{
    private int edad;

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
 }

public class Principal {
    public static void main(String[] args){
        Persona persona_1 = new Persona();
        persona_1.setEdad(25);
        System.out.println("Mi edad es: " + persona_1.getEdad());
    }
}
