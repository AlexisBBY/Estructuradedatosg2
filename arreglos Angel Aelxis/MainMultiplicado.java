import javax.swing.JOptionPane;

public class MainMultiplicado {
    public static void main(String[] args) {
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del vector:"));

        int[] vector = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el elemento " + (i + 1) + " del vector:"));
        }

        int escalar = Integer.parseInt(JOptionPane.showInputDialog("Introduce el escalar para multiplicar el vector:"));

        VectorMultiplicado v = new VectorMultiplicado(vector);
        VectorMultiplicado multiplicado = v.multiplicarPorEscalar(escalar);

        JOptionPane.showMessageDialog(null, "El vector multiplicado por " + escalar + " es: " + multiplicado.imprimirVector());
    }
}
