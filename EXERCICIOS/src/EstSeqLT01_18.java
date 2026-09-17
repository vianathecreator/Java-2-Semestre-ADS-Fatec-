import javax.swing.JOptionPane;
public class EstSeqLT01_18 {
    static int a, b, maior, menor,  diferenca;

    public static void ReceberValores() {
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
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
        diferenca = maior - menor;
        JOptionPane.showMessageDialog(null, "A diferença do maior pro menor é de: " + diferenca);
    }
}
