import javax.swing.*;

public class Ej4metodos {
    public static void main(String[] args) {
        int cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Diga cuantos clientes son "));
        int [] clientes=new int[cantidad];
        int[] compras = new int[cantidad];
        for (int i = 0; i <cantidad; i++) {
            compras[i]=Integer.parseInt(JOptionPane.showInputDialog("Diga cuantas compras ha hecho el cliente numero "+(i+1)));
        }
        calculardescuento(clientes,compras);
    }
    public static void calculardescuento(int[]clientes,int[]compras){
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i]>10){
                JOptionPane.showMessageDialog(null,"El cliente numero "+(i+1)+" tiene descuento.");
            }

        }

    }
}

