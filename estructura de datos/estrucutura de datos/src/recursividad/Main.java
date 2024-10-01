import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de la clase Operaciones
        Operaciones2 operacion = new Operaciones2();

        // Solicitar al usuario que introduzca el valor de 'n' y validarlo
        String inputN = JOptionPane.showInputDialog("Introduce el valor de 'n' (número de veces que se sumará):");
        int n = Integer.parseInt(inputN);
        operacion.setN(n);  // Establecemos el valor de 'n' con el setter que incluye validación

        // Solicitar al usuario que introduzca el valor de 'a' para multiplicar
        String inputA = JOptionPane.showInputDialog("Introduce el valor de 'a' (número que se multiplicará):");
        int a = Integer.parseInt(inputA);

        // Multiplicación iterativa
        int resultadoIterativo = operacion.multiplicarIterativo(a);
        JOptionPane.showMessageDialog(null, "Multiplicación iterativa: " + a + " * " + operacion.getN() + " = " + resultadoIterativo);

        // Multiplicación recursiva
        int resultadoRecursivo = operacion.multiplicarRecursivo(a, operacion.getN());
        JOptionPane.showMessageDialog(null, "Multiplicación recursiva: " + a + " * " + operacion.getN() + " = " + resultadoRecursivo);
    }
}
