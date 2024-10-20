import javax.swing.*;

public class Ej9metodos {
    public static void main(String[] args) {
        int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Diga cuantos productos tiene"));
        double[] preciosoriginales=new double[cantidad];
        for (int i = 0; i < cantidad; i++) {
            preciosoriginales[i]=Double.parseDouble(JOptionPane.showInputDialog("Diga el precio original del producto "+(i+1)));
            calcularpreciofinal(preciosoriginales[i]);
        }
    }
    public static void calcularpreciofinal(double precio){
        precio=precio-precio*0.10;
        JOptionPane.showMessageDialog(null,"El precio modificado con un descuento del 10% es de "+precio);

    }
}
