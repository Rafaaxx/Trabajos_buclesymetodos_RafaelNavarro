import javax.swing.*;

public class Ej1bucles {
    public static void main(String[] args) {
        int resultado, numero,numeroactividad;
        resultado=0;
        numeroactividad=0;
        for (int i = 0; i < 4; i++) {
            numero= Integer.parseInt(JOptionPane.showInputDialog("Diga cuantas horas al dia hace la actividad numero "+(numeroactividad+1)+". Las actividades: 1-estudiar 2-hacer ejercicio 3-leer 4-tiempo libre"));
            resultado=resultado+numero;
            numeroactividad=numeroactividad+1;


        }
        JOptionPane.showMessageDialog(null, "El resultado de las horas totales dedicadas es: "+resultado);
    }
}