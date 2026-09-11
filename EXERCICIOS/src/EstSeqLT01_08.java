import javax.swing.JOptionPane;
public class EstSeqLT01_08 {
public static void main(String[] args) {
    double dep, novo;
    dep = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu depósito: "));
    novo = dep * 1.13;
    JOptionPane.showMessageDialog(null, "Após um mês de aplicação, seu valor é de: " + novo);
    }
}
