import javax.swing.*;

public class Ej5metodos {
    public static void main(String[] args) {
        int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Diga la cantidad de clientes "));
        int[] satisfacciones= new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            while (satisfacciones[i]<1 || satisfacciones[i]>5){
                satisfacciones[i]=Integer.parseInt(JOptionPane.showInputDialog("Cliente numero "+(i+1)+" diga su nivel de satisfacción del 1 al 5"));
            }
        }
        calcularpromediosatisfaccion(satisfacciones);
    }
    public static void calcularpromediosatisfaccion(int [] tablasatisfacciones){
        double resultado=0;
        for (int i = 0; i < tablasatisfacciones.length; i++) {
            resultado=resultado+tablasatisfacciones[i];

        }
        resultado=resultado/tablasatisfacciones.length;
        JOptionPane.showMessageDialog(null,"El resultado es "+resultado);
    }
}
