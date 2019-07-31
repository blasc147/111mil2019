package ej.empleados;

public class Persona {

    String nombre; //obligatorio
    String dni;   //obligatorio
    int edad;     //opcional

    public Persona(String unNombre, String undni){

        nombre = unNombre;
        dni= undni;
        edad = 18;

    }

    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String comer(){

        return nombre+" esta comiendo" ;
    }

    public int getEdad() {
        return edad;
    }
}
