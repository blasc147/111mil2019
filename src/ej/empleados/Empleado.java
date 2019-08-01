package ej.empleados;

import java.time.LocalDate;
import java.time.Period;

public class Empleado {
    long IdEmpleado;
    String nombre;
    String apellido;
    String dni;
    LocalDate fechaInicio;
    double sueldoBasico;
    boolean presentismo;
    int nroTel;
    String domicilio;

    static String empresa = "Unitan";
    static long siguienteId = 0;

    public static final String dom_def = "sin domicilio";

    public Empleado(String nombre, String apellido, String dni, LocalDate fechaInicio, double sueldoBasico, boolean presentismo) {
        this(nombre, apellido, dni, fechaInicio, sueldoBasico, presentismo, 0, dom_def);
    }

    public Empleado(String nombre, String apellido, String dni, LocalDate fechaInicio, double sueldoBasico, boolean presentismo, String domicilio) {
        this(nombre, apellido, dni, fechaInicio, sueldoBasico, presentismo, 0, domicilio);
    }

    public Empleado(String nombre, String apellido, String dni, LocalDate fechaInicio, double sueldoBasico, boolean presentismo, int nroTel) {
        this(nombre, apellido, dni, fechaInicio, sueldoBasico, presentismo, nroTel, dom_def);
    }

    public Empleado(String nombre, String apellido, String dni, LocalDate fechaInicio, double sueldoBasico, boolean presentismo, int nroTel, String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaInicio = fechaInicio;
        this.sueldoBasico = sueldoBasico;
        this.presentismo = presentismo;
        this.nroTel = nroTel;
        this.domicilio = domicilio;
        this.IdEmpleado = siguienteId++;
    }

    @Override
    public String toString() {
        return "ej.empleados.Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", sueldoBasico=" + sueldoBasico +
                '}';
    }

    double calcularSueldo(){
        double plus =0;
        if (presentismo){
            plus = sueldoBasico*0.3;
        }
        switch(getCategoria()){
            case 'A': plus+= sueldoBasico*0.2;
                        break;

        }

        return sueldoBasico+plus;
    }

    char getCategoria(){
        Period p = Period.between(fechaInicio, LocalDate.now());
        int years = p.getYears();
        if (years<=10){
            return 'C';
        } else if (years>10 && years<=20){
            return 'B';
        } else {
            return 'A';
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public String getDni() {
        return dni;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
}
