public class Ejercicio {

    public static void main(String[] args) {

        int[] Arrnmb = new int[5];
        Arrnmb[0] = 102 ;
        Arrnmb[1] = 2;
        Arrnmb[2] = 34;
        Arrnmb[3] = 21;
        Arrnmb[4] = 12;
        int Resultado = 0;
        for (int i = 0; i < Arrnmb.length; i++) {

            Resultado = Arrnmb[i] + Resultado;
            System.out.println("Suma de numeros es: "+ Resultado);
        }

    }

}