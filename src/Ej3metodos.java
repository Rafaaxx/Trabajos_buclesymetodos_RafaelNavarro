import javax.swing.*;

public class Ej3metodos {
    public static void main(String[] args) {
        int cllientes=Integer.parseInt(JOptionPane.showInputDialog("Diga cuantos clientes son "));
        String[] clientes= new String[cllientes];
        int[] facturaspendientes=new int[cllientes];
        for (int i = 0; i < facturaspendientes.length; i++) {
            clientes[i]=JOptionPane.showInputDialog("nombre del cliente "+(i+1));
            facturaspendientes[i]= Integer.parseInt(JOptionPane.showInputDialog("Diga el monto de la factura del cliente numero "+(i+1)));
        }
        enviarfacturas(clientes,facturaspendientes);
    }
    public static void enviarfacturas(String[] clientes, int[] facturaspendientes){
        for (int i = 0; i < clientes.length; i++) {
            if (facturaspendientes[i]>500){
                JOptionPane.showMessageDialog(null, "La factura del cliente " +clientes[i]+" es mayor a 500.");
            }

        }
    }
}
