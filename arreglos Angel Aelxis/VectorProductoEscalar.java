import javax.swing.JOptionPane;

public class VectorProductoEscalar {
    private int[] vector;

    public VectorProductoEscalar(int[] vector) {
        this.vector = vector;
    }

    public int[] getVector() {
        return this.vector;
    }

    public static Integer productoEscalar(VectorProductoEscalar v1, VectorProductoEscalar v2) {
        if (v1.vector.length != v2.vector.length) {
            JOptionPane.showMessageDialog(null, "Error: Los vectores deben tener el mismo tamaño.");
            return null; // Regresa null en caso de error
        }

        int producto = 0;
        for (int i = 0; i < v1.vector.length; i++) {
            producto += v1.vector[i] * v2.vector[i];
        }
        return producto;
    }
}
