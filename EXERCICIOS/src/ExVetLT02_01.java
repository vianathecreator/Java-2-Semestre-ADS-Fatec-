import javax.swing.JOptionPane;
public class ExVetLT02_01 {
    public static void main(String[] args) {
        int valores [] = new int [5];
        int i;
            for (i=0; i<5; i++) {
                valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor " + i));
            }  
            
            for (i=0; i<5; i++) {
                JOptionPane.showMessageDialog(null, "Casa: " + (i+1) + "\nValor: " + valores[i]);
            }

            double resu_media = calcularMedia(valores);
                JOptionPane.showMessageDialog(null, "A média dos valores entre 10 e 200 é: " + resu_media );
    }

    static double calcularMedia(int valores[]) {
        double media = 0;
        int i;
        double contador = 0;
        double resultado = 0;
        for (i=0; i<5; i++) {
            if (valores[i] >= 10 && valores[i]<=200) {
                media += valores[i];
                contador++;
            }
    }
    resultado = media/contador;
    return resultado;


}        
}
