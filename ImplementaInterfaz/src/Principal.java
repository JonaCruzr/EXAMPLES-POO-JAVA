interface Poligono {
    void getArea(int largo, int ancjo);
}

//Clase que implementa la interfaz "Poligono"
class Rectangulo implements Poligono {
    public void getArea(int largo, int ancho){
        System.err.println("El area del rectangulo es: " + (largo * ancho));
    }
}

public class Principal {
    public static void main(String[] args) throws Exception {
        Rectangulo r1 = new Rectangulo();
        r1.getArea(5, 5);
    }
}
