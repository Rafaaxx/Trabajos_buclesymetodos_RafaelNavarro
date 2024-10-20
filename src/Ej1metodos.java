import javax.swing.*;

public class Ej1metodos {
    public static void main(String[] args) {
        int[] arreglo = new int[30];
        JOptionPane.showMessageDialog(null, "El resultado de la suma de todos los dias es de " + introduccirvalores(arreglo));
    }

    public static int introduccirvalores(int[] arregloo) {

        int resultado = 0;
        for (int i = 0; i < 30; i++) {
            arregloo[i] = Integer.parseInt(JOptionPane.showInputDialog("Diga las ventas del día numero " + (i + 1)));
            resultado = resultado + arregloo[i];
        }
        return resultado;
    }
}