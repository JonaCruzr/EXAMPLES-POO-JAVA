class Perro extends Animal{
    /*
     * La variable "nombre" no fue declara aquí pero como hereda de la clase Animal
     * Hereda sus propiedades y metodos
     */
    public void muestra(){
        System.out.println("Mi nombre es: " + nombre);
    }

    /*
     * Se esta sobre escribiendo el método comer() de la clase padre
     * Para que en esta clase tenga un comportamiento distinto
     */
    @Override
    public void comer(){
        System.out.println("Comer desde la clase perro");
    }
}
