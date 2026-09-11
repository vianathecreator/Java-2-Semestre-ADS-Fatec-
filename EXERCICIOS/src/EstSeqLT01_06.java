import javax.swing.JOptionPane;
public class EstSeqLT01_06 {
    public static void main(String argumentos[]){
        int x, y;
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de X: "));
        y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de Y: "));
        JOptionPane.showMessageDialog(null, "Valores Invertidos! O valor de X é: " + y);
        JOptionPane.showMessageDialog(null, "Valores Invertidos! O valor de Y é: " + x);
    }
}
