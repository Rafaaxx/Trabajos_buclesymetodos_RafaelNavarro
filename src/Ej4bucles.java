import javax.swing.*;

public class Ej4bucles {
    public static void main(String[] args) {
        int cantidaddias=7,i=0,resultado,resultadodia;
        resultado=0;
        while (i<cantidaddias){
            resultadodia=Integer.parseInt(JOptionPane.showInputDialog("Diga el total del valor de las ventas del dia numero "+(i+1)));
            resultado=resultado+resultadodia;
            i+=1;
        }
        JOptionPane.showMessageDialog(null,"El total de las ventas realizadas entre los 7 dias de la semana es: $"+resultado);
    }
}
