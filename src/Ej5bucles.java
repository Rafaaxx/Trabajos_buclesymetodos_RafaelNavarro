import javax.swing.*;

public class Ej5bucles {
    public static void main(String[] args) {
        int empleados,i,horas,horasextras;
        i=0;
        empleados= Integer.parseInt(JOptionPane.showInputDialog("Diga la cantidad de empleados"));
        for (int j = 0; j < empleados; j++) {
            horas=Integer.parseInt(JOptionPane.showInputDialog("Diga cuantas horas trabajo en la semana el empleado numero "+(i+1)));
            if (horas>40){
                horasextras=horas-40;
                JOptionPane.showMessageDialog(null,"El empleado ha trabajado "+horasextras+" horas extras");
            }
        }
    }
}
