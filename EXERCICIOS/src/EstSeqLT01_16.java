import javax.swing.JOptionPane;
public class EstSeqLT01_16 {
    static double horas_trabalhadas, valor_hora, per_desconto, num_dep, salarioliq, salariobrt, add_depend;

    public static void receberValores() {
        horas_trabalhadas = Double.parseDouble (JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
        valor_hora = Double.parseDouble (JOptionPane.showInputDialog("Digite o valor do salário por hora: "));
        per_desconto = Double.parseDouble (JOptionPane.showInputDialog("Digite o percentual de desconto: "));
        num_dep = Double.parseDouble (JOptionPane.showInputDialog("Digite o numero de dependentes: "));
    }

    public static void calculoDeSalario() {
        salariobrt = horas_trabalhadas * valor_hora;
        add_depend = (num_dep * 100);
    }
    
    public static void main(String[] args) {
        receberValores();
        calculoDeSalario();
        salarioliq = (salariobrt - ( 1 * (per_desconto / 100))) + add_depend;
        JOptionPane.showMessageDialog(null, "Esse é o salário a receber: " + salarioliq);
    }
}
