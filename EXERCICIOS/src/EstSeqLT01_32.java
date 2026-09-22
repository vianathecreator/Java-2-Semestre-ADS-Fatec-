import javax.swing.JOptionPane;
public class EstSeqLT01_32 {
    
    public static void main (String[] args) {
        int numero = Integer.parseInt (JOptionPane.showInputDialog("Digite o numero: "));
        int resultado = fatorial(numero);
        JOptionPane.showMessageDialog(null, "Esse é o resultado do fatorial: " + resultado);
    }

    static int fatorial (int numero) {
        if (numero == 1) {
            return 1;
        }
        return numero * fatorial(numero - 1);
    }
}
