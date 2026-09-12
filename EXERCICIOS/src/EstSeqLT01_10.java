import javax.swing.JOptionPane;
public class EstSeqLT01_10 {
    public void main (String[] args) {
        double a, b, diff;
        a = Double.parseDouble (JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        b = Double.parseDouble (JOptionPane.showInputDialog(null, "Digite o segundo número: "));
        diff = a - b;
        JOptionPane.showMessageDialog(null,String.format("A diferença entre eles é de: %.0f", diff));
    }
}