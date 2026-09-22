import javax.swing.JOptionPane;
public class EstSeqLT01_34 {

    public static void main (String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        String tabuadaresu = Tabuada(numero);
        JOptionPane.showMessageDialog(null, "Aqui sua tabuada:\n" + tabuadaresu);
    }

    static String Tabuada(int numero) {
        String resultado = "";
        int i;
        for (i=1; i<=10; i++) {
            int calculo = numero * i;
            resultado += numero + " x " + i + " = " + calculo + "\n";
        }
        return resultado;
    }
    
}
