import javax.swing.*;

public class Ej7metodos {
    public static void main(String[] args) {
        int cantidad= Integer.parseInt(JOptionPane.showInputDialog("cantidad de clientes"));
        double[] compras= new double[cantidad];
        for (int i = 0; i < cantidad; i++) {
            compras[i]=Double.parseDouble(JOptionPane.showInputDialog("Diga el monto de la compra del cliente numero "+(i+1)));
        }
        aplicardescuento(compras);

    }
    public static void aplicardescuento(double[] compras){
        for (int i = 0; i < compras.length; i++) {
            if (compras[i]>500){
                JOptionPane.showMessageDialog(null,"El cliente numero "+(i+1)+" supero el monto de 500");
                compras[i]=compras[i]- compras[i]*0.15;
                JOptionPane.showMessageDialog(null,"El monto con descuento es de "+compras[i]);
            }
        }
    }
}
