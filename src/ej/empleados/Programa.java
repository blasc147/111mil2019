package ej.empleados;
import javax.swing.*;

import java.awt.*;
import java.time.LocalDate;

public class Programa {

    static Empleado empleados[] = new Empleado[4];

    public static void main(String[] args){

        String salida;

        LocalDate localDate = LocalDate.of(1999, 02, 20);

        String clienteBuscado = JOptionPane.showInputDialog("ingresar DNI del titular:");

        empleados[0] = new Empleado("juan", "perez", "3216549", localDate, 10000, true);
        empleados[1] = new Empleado("pedro", "martin", "3216589", localDate, 10000, true);
        empleados[2] = new Empleado("florencia", "garcia", "3216579", localDate, 10000, true);
        empleados[3] = new Empleado("maria", "gonzalez", "3276549", localDate, 10000, true);
        boolean encontrado = false;
        for (int m=0; m < empleados.length; m++){
            if(clienteBuscado.equals(empleados[m].getDni())){
                encontrado= true;
                Empleado buscado= empleados[m];
                //int listo = m;
                break;
            }

        }

        if(encontrado){
            JOptionPane.showMessageDialog(new JFrame(), "El cliente fue encontrado");
        }else{
            JOptionPane.showMessageDialog(new JFrame(),
                    "El cliente no fue encontrado",
                    "Inane error",
                    JOptionPane.ERROR_MESSAGE);
        }

        System.exit(0);







    }



}
