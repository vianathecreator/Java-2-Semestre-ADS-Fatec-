import javax.swing.*;
public class EstSeqLT01_22 {
   static int a, b, maior, menor;

   public static void ReceberValores() {
    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
   }

   public static void Verifica() {
        if (a>b) {
            maior = a;
            menor = b;
        } else {
            maior = b;
            menor = a;
        }

    public static void main (String[] args) {
        ReceberValores();
        Verifica();
        JOptionPane.showMessageDialog(null, maior + menor);
    }
   }
} 
