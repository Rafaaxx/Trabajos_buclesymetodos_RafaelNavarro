import javax.swing.*;

public class Ej6metodos {
    public static void main(String[] args) {
        int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Diga la cantidad de clientes y sus facturas"));
        double [] facturas= new double[cantidad];
        for (int i = 0; i < cantidad; i++) {
            facturas[i]=Integer.parseInt(JOptionPane.showInputDialog("Diga el monto de la factura numero "+(i+1)));
        }
        calcularimpuesto(facturas);

    }
    public static void calcularimpuesto(double[] tabla){
        for (int i = 0; i < tabla.length; i++) {
            tabla[i]=tabla[i]*1.21;
            JOptionPane.showMessageDialog(null, "El monto de la factura numero "+(i+1)+" es de "+tabla[i]);

        }
    }
}
