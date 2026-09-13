import javax.swing.JOptionPane;
public class EstSeqLT01_11 {
    public static void main(String[] args) {
        double com, raio;
        raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do raio: "));
        com = 2 * 3.14 * raio;
        JOptionPane.showMessageDialog(null, "Esse é o comprimento da circunferência: " + com);
    }
}
