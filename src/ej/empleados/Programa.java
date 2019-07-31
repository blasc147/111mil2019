package ej.empleados;

import java.time.LocalDate;

public class Programa {

    public static void main(String[] args){

        String nombre = "juan";

        LocalDate localDate = LocalDate.of(1999, 02, 20);



        Empleado empleado1 = new Empleado(nombre, "perez", "3216549", localDate, 10000, true);

        System.out.println(empleado1);
        double sueldo = empleado1.calcularSueldo();
        empleado1.setNombre("pedro");
        System.out.println(empleado1.getNombre());





    }



}
