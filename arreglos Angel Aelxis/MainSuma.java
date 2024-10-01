import javax.swing.JOptionPane;

public class MainSuma {
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

        VectorSuma v1 = new VectorSuma(vector1);
        VectorSuma v2 = new VectorSuma(vector2);

        VectorSuma suma = VectorSuma.sumarVectores(v1, v2);
        if (suma != null) {  // Si la suma es válida, mostrar el resultado
            JOptionPane.showMessageDialog(null, "La suma de los vectores es: " + suma.imprimirVector());
        }
    }
}
