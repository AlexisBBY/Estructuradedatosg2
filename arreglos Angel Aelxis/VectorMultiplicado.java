public class VectorMultiplicado {
    private int[] vector;

    public VectorMultiplicado(int[] vector) {
        this.vector = vector;
    }

    public int[] getVector() {
        return this.vector;
    }

    public VectorMultiplicado multiplicarPorEscalar(int escalar) {
        int[] multiplicado = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            multiplicado[i] = vector[i] * escalar;
        }
        return new VectorMultiplicado(multiplicado);
    }

    public String imprimirVector() {
        String resultado = "";
        for (int valor : vector) {
            resultado += valor + " ";
        }
        return resultado;
    }
}
