public class FlujosControl {
    //Constructor de la clase
    public FlujosControl(){

    }

    void ejemplo_switch(int x){
        switch (x) {
            case 1:
                System.out.println("Caso 1");
                break;
            case 5:
                System.out.println("Caso 2");
                break;
            case 7:
                System.out.println("Caso 3");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }

    /* SINTAXIS:
         * for (valor_inicial, condicion_de_paro, incremento){
         * 
         * }
         * - La valor_inicial solo se ejecuta una vez
         * - Si la condicion_de_paro es verdadera, se ejecuta el cuerpo del bulce
         * - incremento actualiza el valor de la valor_inicial
         * 
         * Esto se repite hasta que la condicion de paro sea false
         */
    void ejemplo_for(){
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
    }

    /* SINTAXIS:
     * for(tipo_dato variable: array){
     * 
     * }
     * - tipo_dato: el tipo de datos de la matriz/colección
     * - variable: cada elemento de la matriz/colección se asigna a esta variable
     */
    void ejemplo_for_each(){
        int[] numeros = {3, 9, 5, -5, 1};
        int suma = 0;
        //bucle for each
        for(int num: numeros){
            suma += num;
        }
        System.out.println("Suma del arreglo: " + suma);
    }
}
