public class TablaMultiplicar {

    private int numero;  // El número para generar la tabla de multiplicar

    // Constructor predeterminado
    public TablaMultiplicar() {
        this.numero = 1; // Valor por defecto
    }

    // Getter para el atributo numero
    public int getNumero() {
        return numero;
    }

    // Setter con validación para que el número sea mayor que 0
    public void setNumero(int numero) {
        this.numero = (numero > 0) ? numero : 1;
    }

    // Método recursivo para imprimir la tabla de multiplicar
    public String imprimirTablaRecursiva(int multiplicador, int hasta) {
        if (multiplicador > hasta) {
            return "";  // Caso base: si el multiplicador es mayor al límite, terminamos
        }
        // Concatenamos el resultado actual y llamamos recursivamente
        return numero + " * " + multiplicador + " = " + (numero * multiplicador) + "\n" +
        imprimirTablaRecursiva(multiplicador + 1, hasta);
    }
}
