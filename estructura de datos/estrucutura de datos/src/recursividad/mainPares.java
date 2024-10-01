import javax.swing.JOptionPane;

public class mainPares {
public static void main(String[] args) {
    ejercicio1 sumar = new ejercicio1();
    String inputN = JOptionPane.showInputDialog("Introduce el valor de 'n'");
        int nv = Integer.parseInt(inputN);
        sumar.setN(nv);
        
        JOptionPane.showMessageDialog(null, "suma " + sumar.sumar(nv));
    }
}

