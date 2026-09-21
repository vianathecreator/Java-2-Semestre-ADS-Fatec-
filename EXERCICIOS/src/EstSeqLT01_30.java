import javax.swing.*;
public class EstSeqLT01_30 {

    static int dia_atual, mes_atual, ano_atual;
    static int dia_nasc, mes_nasc, ano_nasc;
    static int idade_dia, idade_mes, idade_ano;

    public static void Receber() {
        dia_nasc = Integer.parseInt (JOptionPane.showInputDialog("Digite o dia que você nasceu: "));
        mes_nasc = Integer.parseInt (JOptionPane.showInputDialog("Digite o mes que você nasceu: "));
        ano_nasc = Integer.parseInt (JOptionPane.showInputDialog("Digite o ano que você nasceu: "));
        dia_atual = Integer.parseInt (JOptionPane.showInputDialog("Digite o dia atual: "));
        mes_atual = Integer.parseInt (JOptionPane.showInputDialog("Digite o mes atual: "));
        ano_atual = Integer.parseInt (JOptionPane.showInputDialog("Digite o ano atual: "));
    }
    
    public static void VerificarBissexto() {
         if (dia_atual < dia_nasc) {
            int mesAnterior = mes_atual - 1;
            int ano = ano_atual;
            if (mesAnterior == 0) {
                mesAnterior = 12; 
                ano--;
            }

        int diasMes;
        switch (mesAnterior) {
            case 4: case 6: case 9: case 11:
                diasMes = 30;
            break; 


            case 2: 
            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                diasMes = 29;
            } else {
                diasMes = 28; 
            }
            break;

            default:
                diasMes = 31;
        }

        dia_atual += diasMes;
        mes_atual--;
        }

        idade_dia = dia_atual - dia_nasc;    
    }

    public static void CalculoMes () {
        if (mes_atual < mes_nasc) {
            mes_atual += 12;
            ano_atual--;
          
        } 
            idade_mes = mes_atual - mes_nasc;  
    }
    
    public static void CalculoAno() {
        idade_ano = ano_atual - ano_nasc;        
    }

    public static void main(String[] args) {
    Receber();
    VerificarBissexto();
    CalculoMes();
    CalculoAno();
        JOptionPane.showMessageDialog(null, "Essa é sua idade atual:  " + idade_ano + " anos," + idade_mes + " meses," + idade_dia + " dias,");
    }
}