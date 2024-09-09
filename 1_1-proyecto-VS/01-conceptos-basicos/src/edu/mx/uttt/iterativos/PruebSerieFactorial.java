package edu.mx.uttt.iterativos;
import javax.swing.JOptionPane;
public class PruebSerieFactorial {
    public static void main(String[] args) {
        SerieFactorial sf1 = new SerieFactorial();
        sf1.setN(3);
        JOptionPane.showMessageDialog(null, sf1.calcular());
    }
}
