import javax.swing.JOptionPane;

public class Main2 {
    public static void main(String[] args) {
        // Crear instancia de la clase TablaMultiplicar
        TablaMultiplicar tablaMultiplicar = new TablaMultiplicar();

        // Solicitar al usuario que introduzca el número para la tabla de multiplicar
        String inputNumero = JOptionPane.showInputDialog("Introduce el número para la tabla de multiplicar:");
        int numero = Integer.parseInt(inputNumero);
        tablaMultiplicar.setNumero(numero);  // Establecer el número en la instancia

        // Solicitar al usuario que introduzca hasta dónde desea la tabla
        String inputHasta = JOptionPane.showInputDialog("Introduce hasta dónde deseas la tabla (1-10):");
        int hasta = Integer.parseInt(inputHasta);

        // Validar que el número hasta donde se imprime sea mayor que 0
        if (hasta < 1) {
            hasta = 10; // Valor por defecto si se ingresa un número menor a 1
        }

        // Imprimir la tabla de multiplicar de manera recursiva
        String tablaRecursiva = tablaMultiplicar.imprimirTablaRecursiva(1, hasta);
        JOptionPane.showMessageDialog(null, "Tabla de multiplicar del " + numero + " hasta " + hasta + ":\n" + tablaRecursiva);
    }
}





public class SumaPares {

    private int n;  // El número hasta donde se suman los pares

    // Constructor
    public SumaPares(int n) {
        setN(n); // Establece el valor de n usando el setter
    }

    // Getter para el atributo n
    public int getN() {
        return n;
    }

    // Setter con validación para que n sea mayor que 1
    public void setN(int n) {
        this.n = (n > 1) ? n : 2; // Aseguramos que n sea al menos 2
    }

    // Método recursivo para sumar enteros pares
    public int sumarParesRecursivos(int num) {
        if (num < 2) {
            return 0;  // Caso base: si num es menor que 2, retornamos 0
        }
        // Si num es par, lo sumamos; si es impar, llamamos a la función con el número anterior
        if (num % 2 == 0) {
            return num + sumarParesRecursivos(num - 2); // Sumar el número y llamar recursivamente
        } else {
            return sumarParesRecursivos(num - 1); // Si es impar, solo llamamos al número anterior
        }
    }
}
