import javax.swing.JOptionPane;
public class EstSeqLT01_03 {
    public static void main(String argumentos[]) {
        double b, h, a;
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da base: " ));
        h = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da altura: " ));
        a = (b*h)/2;
        JOptionPane.showMessageDialog(null, "Esse é o valor da área: " + a);
    }
}

