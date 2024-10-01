
import javax.swing.JOptionPane;

public class Factorial {
    private int n;

    public Factorial() {
        this.n = 1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n > 0) ? n : 1;
    }

    // calcukar factorial iterativo
    public long factorialI(String opcion) {
        long r = 0;
        switch (opcion) {
            case "1":
                r =factorialFor();
                break;
            case "2":
                r=factorialWhile();
                break;
            case "3":
                r=factorialDoWhile();
                break;
            default:
                JOptionPane.showMessageDialog(null, "valor no valido");
                break;
        }
        return r;
    }

    public long factR(int r){
        if (n==1){
            return 1;
        }else{
            return factR(n-1)*n;
        }
    }

    private long factorialFor() {
        long fact = 1;
        for (int i = 1; i <= this.n; i++) {
            fact *= 1;
        }
        return fact;

    }

    private long factorialWhile() {
        int i = 1;
        long fact = 1;
        while (i <= this.n) {
            fact *= i;
            i++;
        }
        return fact;

    }

    private long factorialDoWhile() {
        int i = 1;
        long fact = 1;
        do {
            fact *= i;
            i++;
        } while (i <= this.n);
        return fact;
    }
}
