import javax.swing.*;

public class Ej2bucles {
    public static void main(String[] args) {
        int resultado, cantidadempleados, horastrabajadas,i=0;
        cantidadempleados=Integer.parseInt(JOptionPane.showInputDialog("Diga cuantos empleados hay en total"));
        do {
            horastrabajadas=Integer.parseInt(JOptionPane.showInputDialog("Diga cuantas horas trabaja el empleado numero "+(i+1)));
            resultado=horastrabajadas*15;
            JOptionPane.showMessageDialog(null,"El salario del empleado numero "+(i+1)+" es de $"+resultado);
            i+=1;
        } while (i<cantidadempleados);
    }
}
