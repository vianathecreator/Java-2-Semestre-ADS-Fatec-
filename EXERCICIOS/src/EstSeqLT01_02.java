import javax.swing.JOptionPane;
public class EstSeqLT01_02 {
    public static void main(String argumentos[]) {
        double salario, novosalario;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario"));
        novosalario = salario * 1.15;
        JOptionPane.showMessageDialog(null, "O seu novo salário é de: " + novosalario);

    }
}