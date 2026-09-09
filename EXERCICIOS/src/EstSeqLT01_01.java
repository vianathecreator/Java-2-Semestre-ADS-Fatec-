import javax.swing.JOptionPane;
public class EstSeqLT01_01 {
    public static void main(String argumentos []) {
        int lado1, lado2, area;
        lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro lado: "));
        lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo lado: "));
        area = lado1 * lado2;
        JOptionPane.showMessageDialog(null,"O valor da área é: " + area);
    }
}
