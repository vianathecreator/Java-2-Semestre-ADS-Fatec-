import javax.swing.JOptionPane;
public class EstSeqLT01_12 {
    public static void main(String[] args) {
       int ano_nasc, ano_atual, daq17, idade;
       ano_nasc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o seu ano de nascimento: ")); 
       ano_atual = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano atual: "));
        idade = ano_atual - ano_nasc;
        daq17 = idade + 17;
        JOptionPane.showMessageDialog(null, "Essa é a sua idade: " + idade);
        JOptionPane.showMessageDialog(null, "Essa é a sua idade daqui 17 anos: " + daq17);
    }
}
