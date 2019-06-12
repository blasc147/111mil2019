import java.util.Scanner;

public class Programa {

    public static void main(String[] args){

        //quiero hacer una funcion para multiplicar dos numeros
        int num=10;
        int num2=2;

        int resultado = multiplicar(num, num2);
        System.out.println(multiplicar(num, num2));
        int[] miarreglo = new int[5];

        Funcion.inicializarArreglo(miarreglo);

        Funcion.imprimirArreglo(miarreglo);

    }


    static int multiplicar(int numero1, int numero2){
        return numero1*numero2;
    }



}
