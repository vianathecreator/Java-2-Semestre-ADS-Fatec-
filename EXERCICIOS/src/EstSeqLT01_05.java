import javax.swing.JOptionPane;
public class EstSeqLT01_05 {
    public static void main (String argumentos[]){
        int A, B, C, delta;
        double x1, x2;
        A = Integer.parseInt (JOptionPane.showInputDialog(null, "Digite o coeficiente A: "));  
        B = Integer.parseInt (JOptionPane.showInputDialog(null, "Digite o coeficiente B: ")); 
        C = Integer.parseInt (JOptionPane.showInputDialog(null, "Digite o coeficiente C: ")); 
        delta = (B*B) - (4*A*C);
        x1 = (-B + Math.sqrt(delta)) / (2*A);
        x2 = (-B - Math.sqrt(delta)) / (2*A);
        JOptionPane.showMessageDialog(null, "Essa é a primeira raiz: " + x1);
        JOptionPane.showMessageDialog(null, "Essa é a segunda raiz: " + x2);
    }
}
