package edu.mx.uttt.iterativos;

import javax.swing.JOptionPane;

public class PruebaSerie {
    public static void main(String[] args) {
        //creacion del primer objeto
        Serie factorial = new Factorial();
        factorial.setN(5);      
        JOptionPane.showMessageDialog(null, factorial.calcularSerie());
        
    }
}
