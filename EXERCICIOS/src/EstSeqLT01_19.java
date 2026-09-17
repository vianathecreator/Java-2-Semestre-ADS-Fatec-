import javax.swing.JOptionPane;
public class EstSeqLT01_19 {
    static double a, b, maior, menor;

    public static void ReceberValores() {
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
    }

    public static void DefinirMaior() {
        if (a>b) {
            maior = a;
            menor = b;
        } else {
            maior = b;
            menor = a;
        }
    }

    public static void main (String[] args) {
        ReceberValores();
        DefinirMaior();
        JOptionPane.showMessageDialog(null, "O maior valor é: " + maior);
    }
}
