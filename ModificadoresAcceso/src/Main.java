class Data {
    /*
     * Podemos acceder a las variables de tipo 'private'
     * desde otra clase a traves de métodos get y set
     */
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}

public class Main {
    public static void main(String[] main){
        Data d = new Data();

        // access the private variable using the getter and setter
        d.setName("Programiz");
        System.out.println("El nombre es " + d.getName());
    }
}