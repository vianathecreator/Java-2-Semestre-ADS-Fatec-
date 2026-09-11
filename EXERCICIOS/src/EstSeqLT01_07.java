import javax.swing.JOptionPane;
public class EstSeqLT01_07 {
    public static void main(String[] args) {
        double vol, com, lar, alt;
        com = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o comprimento: "));
        lar = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a largura: "));
        alt = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura: "));
        vol = com * lar * alt;
        JOptionPane.showMessageDialog(null, "Esse é o volume: " + vol);
    }
}
