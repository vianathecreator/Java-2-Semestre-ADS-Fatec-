import javax.swing.JOptionPane;
public class EstSeqLT01_21 {
    static double nota1, nota2, nota3, nota4, media;

    public static void ReceberNotas() {
        nota1 = Double.parseDouble (JOptionPane.showInputDialog("Digite a nota do primeiro bimestre: "));
        nota2 = Double.parseDouble (JOptionPane.showInputDialog("Digite a nota do segundo bimestre: "));
        nota3 = Double.parseDouble (JOptionPane.showInputDialog("Digite a nota do terceiro bimestre: "));
        nota4 = Double.parseDouble (JOptionPane.showInputDialog("Digite a nota do quarto bimestre: "));
    }
    
    public static void CalculoMedia() {
        media = (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public static void main (String[] args) {
        ReceberNotas();
        CalculoMedia();
        if (media >= 6.0) {
            JOptionPane.showMessageDialog(null, "APROVADO!");
        } else if (media >= 3.0 || media < 6.0) {
            JOptionPane.showMessageDialog(null, "EXAME!");
        } else if (media < 3.0) {
            JOptionPane.showMessageDialog(null, "RETIDO!");
        }
    }
}
