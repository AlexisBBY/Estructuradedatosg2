import javax.swing.JOptionPane;

public class MainInvertido {
    public static void main(String[] args) {
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del vector:"));

        int[] vector = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el elemento " + (i + 1) + " del vector:"));
        }

        VectorInvertido v = new VectorInvertido(vector);
        VectorInvertido invertido = v.invertirVector();

        JOptionPane.showMessageDialog(null, "El vector invertido es: " + invertido.imprimirVector());
    }
}
