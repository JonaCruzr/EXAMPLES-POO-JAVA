import java.lang.Math;

interface Poligono {
    void getArea();

    // Calcula el perímetro de un polígono
    // Los 3 puntos en el paso de parámetros indican que el método acepta un número variable de argumentos de tipo entero.
    default void getPerimetro(int... lados) {
        int perimetro = 0;
        // Itera sobre el arreglo de enteros
        for (int lado : lados) {
            perimetro += lado;
        }
        System.out.println("Perímetro: " + perimetro);
    }
}

class Triangulo implements Poligono {
    private int a, b, c;
    private double s, area;

    // Constructor, inicializa lados de un triángulo
    Triangulo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        s = 0;
    }

    public void getArea() {
        s = (double) (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Área: " + area);
    }
}

public class EjemploPractico {
    public static void main(String[] args) throws Exception {
        Triangulo t1 = new Triangulo(2, 3, 4);
        t1.getArea();
        t1.getPerimetro(2, 3, 4);
    }
}
