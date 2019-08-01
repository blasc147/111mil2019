package ej.ventanas;
import javax.swing.*;

public class NombresCurso {

    static String estudiantesCurso[][];

    public static void main(String[] args) {
        int cantEstudiantes;
        //este string es la salida que se muestra en la ventana
        String salida;

        cantEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de Estudiantes:"));

        estudiantesCurso = new String [cantEstudiantes][2];

        for (int m=0; m < estudiantesCurso.length; m++){
            estudiantesCurso[m][0]=JOptionPane.showInputDialog("Codigo del estudiante número" + (m+1) + ":");
            estudiantesCurso[m][1]=JOptionPane.showInputDialog("Nombre del estudiante número" + (m+1) + ":");
        }
        salida = "Estudiantes delCurso:\n\n" +
                "Número\tCódigo\tNombre\n";
        for (int m=0; m < estudiantesCurso.length; m++){
            salida += (m+1) + "\t";
            for (int n=0; n < estudiantesCurso[m].length; n++){
                salida += estudiantesCurso[m][n] + "\t";
            }
            salida += "\n";
        }
    // mostrar los resultados en un Area de Texto
    JTextArea areaSalida = new JTextArea();
    JScrollPane scroll = new JScrollPane(areaSalida);
    areaSalida.setText(salida);
    JOptionPane.showMessageDialog( null, scroll, "Resultados", JOptionPane.INFORMATION_MESSAGE );
}//Fin método main
}//Fin clase
