import javax.swing.*;

public class Ej3bucles {
    public static void main(String[] args) {
        int productos,cantidadproductos,i;
        productos=Integer.parseInt(JOptionPane.showInputDialog("Diga el numero de productos existentes"));
        i=0;
        while (i<productos){
            cantidadproductos=Integer.parseInt(JOptionPane.showInputDialog("Diga la cantidad de unidades del producto numero "+(i+1)));
            if (cantidadproductos<5){
                JOptionPane.showMessageDialog(null,"Debe realizar un pedido, quedan menos de 5 unidades.");
            }
            i+=1;
        }
    }
}
