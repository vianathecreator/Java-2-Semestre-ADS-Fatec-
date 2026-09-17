import javax.swing.JOptionPane;
public class EstSeqLT01_20 {
    static int A, B, C, delta;
    static double x1, x2;

    public static void ReceberValores() {
        A = Integer.parseInt (JOptionPane.showInputDialog(null, "Digite o coeficiente A: "));  
        B = Integer.parseInt (JOptionPane.showInputDialog(null, "Digite o coeficiente B: ")); 
        C = Integer.parseInt (JOptionPane.showInputDialog(null, "Digite o coeficiente C: ")); 
    }
 
    public static void Calculo() {
        delta = (B*B) - (4*A*C);
        if (delta>=0) {
        x1 = (-B + Math.sqrt(delta)) / (2*A);
        x2 = (-B - Math.sqrt(delta)) / (2*A);
        }
    }
    
    public static void main (String[] args) {
        ReceberValores();
        Calculo();
        if (delta<0) {
            JOptionPane.showMessageDialog(null, "Não existem raizes reais, delta negativo. Delta:  " + delta);
        }
        
        if (x1 <=0 && x2 <= 0) {
            JOptionPane.showMessageDialog(null, "Não existem raizes reais");
        } else if (x1 > 0 && x2 > 0) {
            JOptionPane.showMessageDialog(null, "Essa é a primeira raiz: " + x1);
            JOptionPane.showMessageDialog(null, "Essa é a segunda raiz: " + x2);
        } else if (x1 > 0) {
            JOptionPane.showMessageDialog(null, "Existe uma raíz real: " + x1);
        } else if (x2 > 0) {
            JOptionPane.showMessageDialog(null, "Existe uma raíz real: " + x2);
        }
    }
}