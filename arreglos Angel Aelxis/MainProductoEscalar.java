import javax.swing.JOptionPane;

public class MainProductoEscalar {
    public static void main(String[] args) {
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño de los vectores:"));

        int[] vector1 = new int[tamaño];
        int[] vector2 = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            vector1[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el elemento " + (i + 1) + " del primer vector:"));
        }

        for (int i = 0; i < tamaño; i++) {
            vector2[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el elemento " + (i + 1) + " del segundo vector:"));
        }

        VectorProductoEscalar v1 = new VectorProductoEscalar(vector1);
        VectorProductoEscalar v2 = new VectorProductoEscalar(vector2);

        Integer producto = VectorProductoEscalar.productoEscalar(v1, v2);
        if (producto != null) {  // Si el producto es válido, mostrar el resultado
            JOptionPane.showMessageDialog(null, "El producto escalar de los vectores es: " + producto);
        }
    }
}
