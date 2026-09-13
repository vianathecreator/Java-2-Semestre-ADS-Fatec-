import javax.swing.JOptionPane;
public class EstSeqLT01_13 {
    public static void main(String[] args) {
        double qtde;
        double dias = 0;
        qtde = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimento em kg: "));
        do { 
            qtde = qtde - 0.05;
            dias++;
        } while (qtde > 0);
                JOptionPane.showMessageDialog(null, "O alimento durará essa quantidade de dias: " + dias);
    }
}
