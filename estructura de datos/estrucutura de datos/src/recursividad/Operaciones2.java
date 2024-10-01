public class Operaciones2 {

    private int n;

    // Constructor predeterminado
    public Operaciones2() {
        this.n = 1; // Valor por defecto
    }

    // Getter para el atributo n
    public int getN() {
        return n;
    }

    // Setter para el atributo n con validación
    public void setN(int n) {
        this.n = (n > 0) ? n : 1; // Si n es mayor que 0, lo asigna, de lo contrario lo deja en 1
    }

    // Método iterativo para multiplicar mediante sumas
    public int multiplicarIterativo(int a) {
        int resultado = 0;
        for (int i = 0; i < n; i++) { // Usa el valor de 'n' para la multiplicación
            resultado += a;
        }
        return resultado;
    }

    // Método recursivo para multiplicar mediante sumas
    public int multiplicarRecursivo(int a, int b) {
        if (b == 1) {
            return a;  // Caso base: si b es 1, devolvemos 'a'
        } else if (b == 0) {
            return 0;  // Caso base: si b es 0, el resultado es 0
        } else {
            return a + multiplicarRecursivo(a, b - 1);  // Suma 'a' y llamada recursiva
        }
    }
}
