import javax.swing.*;

public class Ej2metodos {
    public static void main(String[] args) {
        String[] productos = {"Televisor", "Celular", "Laptop", "Tablet", "Camara"};
        int[] stock = {3, 10, 2, 6, 4};
        generarReporteBajoStock(productos, stock);
    }
    public static void generarReporteBajoStock(String[] productos, int[] stock){
        System.out.println("Productos con bajo stock: ");
        for (int i = 0; i < productos.length; i++) {
            if (stock[i]<5){
                System.out.println("El producto "+productos[i]+" necesita reposicion");

            }
        }
    }
}
