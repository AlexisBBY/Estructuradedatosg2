
import javax.swing.JOptionPane;

public class testRecursividad {
    public static void main(String[] args) {
        ejecutar();
    }

    public static String menu() {
        String menu = "menu principal:\n" +
                "1)METODO ITERATIVO\n" +
                "2)METODO RECURSIVO\n" +
                "3)Factorial iterativo\n" +
                "4)Factorial Recursivo\n" +
                "5)SALIR\n" +
                "ELIGE LA OPCION";
        return JOptionPane.showInputDialog(menu);
    }

    public static void ejecutar() {
        boolean sentinel = true;
        String opcion = "";
        Factorial f = null;
        operaciones op = new operaciones();
        int n = 0;
        long r = 0;
        do {
            opcion = menu();
            switch (opcion) {
                case "1":
                    n = Integer.parseInt(JOptionPane.showInputDialog("introduce el numero de veces a imprimir"));
                    op.setN(n);
                    op.imprimir();
                    break;
                case "2":
                    n = Integer.parseInt(JOptionPane.showInputDialog("introduce el numero de veces a imprimir"));
                    op.setN(n);
                    op.imprimir(op.getN());
                    break;
                case "3":
                    // factorial
                    // Factorial

                    opcion = JOptionPane.showInputDialog(menus.menuFactorial());
                    f = new Factorial();
                    n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del factorial a calcular"));
                    f.setN(n);
                    r = f.factorialI(opcion);
                    JOptionPane.showMessageDialog(null, "f( " + f.getN() + ") =" + r);
                    break;
                case "4":
                    f = new Factorial();
                    n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del factorial a calcular"));
                    r = f.factorialI(opcion);
                    JOptionPane.showMessageDialog(null, "f( " + f.getN() + ") =" + r);
                    f.setN(n);
                    r = f.factR(f.getN());
                    JOptionPane.showMessageDialog(null, "f( " + f.getN() + ") =" + r);
                    break;
                case "5":// salir pa
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "valor no valido");
            }
        } while (sentinel);
    }
}
