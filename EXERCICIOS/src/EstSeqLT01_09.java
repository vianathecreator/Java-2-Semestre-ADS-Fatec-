import javax.swing.JOptionPane;
public class EstSeqLT01_09 {
public static void main (String[] args) {
    int a, b, q1, q2;
    a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do primeiro numero: "));
    b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do segundo numero: "));
    q1 = a*a;
    q2 = b*b;
    JOptionPane.showMessageDialog(null, "Esse é o primeiro quadrado: " + q1);
    JOptionPane.showMessageDialog(null, "Esse é o segundo quadrado: " + q2);
    }   
}
