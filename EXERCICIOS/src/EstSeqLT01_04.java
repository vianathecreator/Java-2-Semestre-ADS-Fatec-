import javax.swing.JOptionPane;
public class EstSeqLT01_04 {
    public static void main (String argumentos[]) {
        double F, C;
        C = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a temperatura em graus Celsius: "));
        F = (9*C+160)/5;
        JOptionPane.showMessageDialog(null, "Essa é a temperatura em fahrenheit: " + F);
    }
}