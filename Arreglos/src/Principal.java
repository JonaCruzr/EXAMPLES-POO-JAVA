public class Principal {
    public static void main(String[] args){
        //tipo_dato "nombre"
        int[] arreglo1; //Declaracion de arreglo de enteros
        double[] arreglo2; //Declaracion de arreglo de dobles

        /* Para definir el número de elementos que puede contener un array, 
        tenemos que asignar memoria al array en Java. */

        arreglo1 = new int[1]; //se define un tamaño de 1
        arreglo2 = new double[2]; // se define un tamaño de 2
        
        /* Lo anterior se puede hacer en una linea, ejemplo: */
        int[] array = new int[5];

        /* INICIALIZACION */
        // Puedes de clarar y inicializar el arreglo, ejemplo:
        int[] x = {2, 3, 5};

        // O podemos inicializarlo una vez ya declarado, ejemplo:
        arreglo1[0] = 12;

        arreglo2[0] = 0.2;
        arreglo2[1] = 3.5;

        array[0] = 12;
        array[1] = 22; //etc ...

        System.out.println(x.length); //imprime el tamaño del arrelo
    }
}
