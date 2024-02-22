/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz;
import javax.swing.JOptionPane;

/**
 *
 * @author JORGE SEGURA
 */
public class Quiz {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cantidadCursosStr = JOptionPane.showInputDialog(null, "Ingrese la cantidad de cursos:");
        int cantidadCursos = Integer.parseInt(cantidadCursosStr);

        double totalMontoCursos = 0;

        String[] nombresCursos = new String[cantidadCursos];
        double[] montosCursos = new double[cantidadCursos];

        for (int i = 0; i < cantidadCursos; i++) {
            nombresCursos[i] = JOptionPane.showInputDialog(null, "Ingrese el nombre del curso " + (i + 1) + ":");
            String montoCursoStr = JOptionPane.showInputDialog(null, "Ingrese el monto del curso " + (i + 1) + ":");
            montosCursos[i] = Double.parseDouble(montoCursoStr);

            double pagoHacienda = montosCursos[i] * 0.02;

            JOptionPane.showMessageDialog(null, "Nombre del Curso: " + nombresCursos[i]
                    + "\nMonto del curso: " + montosCursos[i]
                    + "\nPago hacienda 2%: " + pagoHacienda);

            totalMontoCursos += montosCursos[i] + pagoHacienda;
        }

        JOptionPane.showMessageDialog(null, "Total a pagar a hacienda: " + totalMontoCursos);
    }   
}
     
  
