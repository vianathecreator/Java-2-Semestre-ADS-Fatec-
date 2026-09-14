import javax.swing.JOptionPane;
public class EstSeqLT01_14 {
    public static void main (String[] args) {
        double a,b,c;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro angulo: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo angulo: "));
        c = 180 - (a + b);
        JOptionPane.showMessageDialog (null,"O valor do terceiro angulo é: " + c);    
    }
}