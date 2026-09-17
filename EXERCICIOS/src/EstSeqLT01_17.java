import javax.swing.JOptionPane;
public class EstSeqLT01_17 {
    static double tempo, vmedia, litros, kmpercorridos;

    public static void  ReceberValores() {
        tempo = Double.parseDouble (JOptionPane.showInputDialog("Digite o tempo em horas do percurso: "));
        vmedia = Double.parseDouble (JOptionPane.showInputDialog("Digite a velocidade média de km/h: "));
    }

    public static void CalculoKM() {
        kmpercorridos = tempo * vmedia;
    }

    public static void main (String[] args) {
        ReceberValores();
        CalculoKM();
        litros = kmpercorridos/12;
        JOptionPane.showMessageDialog(null, String.format("Esse foi o tanto de litros gastos: %.2f",  litros));
    }
}