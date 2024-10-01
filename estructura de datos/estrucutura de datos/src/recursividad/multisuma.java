
public class multisuma {

    private int a;
    private int b;
    
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public static int calcularMCD(int a, int b) {
        if (b == 0) {
            return a; // Caso base
        } else {
            //Caso General
            // Imprimir cociente y residuo
            System.out.println("Cociente de " + a + " / " + b + " : " + (a / b));
            System.out.println("Residuo de " + a + " % " + b + " : " + (a % b));
            return calcularMCD(b, a % b);
          // Llamada recursiva
            }
            
}
}
