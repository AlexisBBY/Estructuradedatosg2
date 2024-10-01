import javax.swing.JOptionPane;

public class VectorSuma {
    private int[] vector;

    public VectorSuma(int[] vector) {
        this.vector = vector;
    }

    public int[] getVector() {
        return this.vector;
    }

    public static VectorSuma sumarVectores(VectorSuma v1, VectorSuma v2) {
        if (v1.vector.length != v2.vector.length) {
            JOptionPane.showMessageDialog(null, "Error: Los vectores deben tener el mismo tamaño.");
            return null; // Regresa null en caso de error
        }

        int[] suma = new int[v1.vector.length];
        for (int i = 0; i < v1.vector.length; i++) {
            suma[i] = v1.vector[i] + v2.vector[i];
        }
        return new VectorSuma(suma);
    }

    public String imprimirVector() {
        String resultado = "";
        for (int valor : vector) {
            resultado += valor + " ";
        }
        return resultado;
    }
}
