import javax.swing.JOptionPane;
public class EstSeqLT01_15 {
    public static void main(String[] args) {
        double cateto1, cateto2, hipotenusa;
        cateto1 = Double.parseDouble (JOptionPane.showInputDialog("Digite o valor do primeiro cateto: "));
        cateto2 = Double.parseDouble (JOptionPane.showInputDialog("Digite o valor do segundo cateto: "));
        hipotenusa = Math.hypot(cateto1, cateto2);
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é de: " + hipotenusa);
    }
    
}
