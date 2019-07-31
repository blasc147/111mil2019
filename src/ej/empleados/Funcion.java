package ej.empleados;

import java.util.Scanner;

public class Funcion {

    static public int multiplicar(int num1, int num2){
        return num1*num2;
    }

    static public void inicializarArreglo(int[] arreglo){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<=arreglo.length-1;i++){
            arreglo[i]= sc.nextInt();
        }
    }

    static public void imprimirArreglo(int[] arreglo){

        for(int i=0; i<=arreglo.length-1;i++){
            System.out.print(arreglo[i]+" ,");
        }
    }
}
