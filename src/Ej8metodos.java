import javax.swing.*;

public class Ej8metodos {
    public static void main(String[] args) {
        int cantidad= Integer.parseInt(JOptionPane.showInputDialog("Diga la cantidad de empleados "));
        String[] empleados= new String[cantidad];
        int[] horastrabajadas =new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            empleados[i]=JOptionPane.showInputDialog("nombre del empleado "+(i+1));
            horastrabajadas[i]=Integer.parseInt(JOptionPane.showInputDialog("Diga la cantidad de horas trabajadas por el empleado "+empleados[i]));
        }
        calcularpagosemanal(empleados,horastrabajadas);
    }
    public static void calcularpagosemanal(String[] tablaempleados, int[] horasdetrabajo){
        int resultado;
        for (int i = 0; i < tablaempleados.length; i++) {
            resultado=horasdetrabajo[i]*15;
            JOptionPane.showMessageDialog(null,"El pago total para el empleado numero "+tablaempleados[i]+" es de "+resultado);
        }
    }
}
