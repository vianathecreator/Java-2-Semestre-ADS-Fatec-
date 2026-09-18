import javax.swing.*;
    public class EstSeqLT01_22 {
        static int a,b;

        public static void ReceberValores() {
            a = Integer.parseInt (JOptionPane.showInputDialog("Digite o primeiro valor: "));
            b = Integer.parseInt (JOptionPane.showInputDialog("Digite o segundo valor: "));
        }
        public static void main (String[] args) {
            ReceberValores();
            if (a > b) {
                JOptionPane.showMessageDialog(null, "Esse é o maior valor: " + a);
            } else {
                JOptionPane.showMessageDialog(null, "Esse é o maior valor: " + b);
            }
        }
    }