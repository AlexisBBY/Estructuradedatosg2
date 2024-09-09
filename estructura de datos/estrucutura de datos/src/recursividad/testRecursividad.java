package recursividad;

import javax.swing.JOptionPane;

public class testRecursividad {
public static void main(String[] args) {
    ejecutar();
}
public static String menu(){
    String menu ="menu principal:\n"+
            "1)METODO ITERATIVO\n"+
            "2)METODO RECURSIVO\n"+
            "3)SALIR\n"+
            "ELIGE LA OPCION";
            return JOptionPane.showInputDialog( menu);
}
public static void ejecutar (){
    boolean sentinel = true;
    String opcion ="";
    operaciones op = new operaciones();
    int n = 0;
    do {
    opcion =menu();
    switch (opcion) {
        case "1":
        n = JOptionPane.showInputDialog("introduce el numero de veces a imprimir");
        op.setN(n);
        op.imprimir();
        break;
        case "2":
        n = JOptionPane.showInputDialog("introduce el numero de veces a imprimir");
        op.setN(n);
        op.imprimir(op.getN());
        break;
        case "3"://salir pa
        sentinel = false;
        break;
        default:
        JOptionPane.showMessageDialog(null, "valor no valido");
    }
}while (sentinel);
}
}
