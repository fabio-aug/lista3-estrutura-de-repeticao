import javax.swing.*;

public class FabioAugusto_15 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));
            int posicao = 1, posicaoAnterior = 0, escopo;
            StringBuilder sequencia = new StringBuilder();
            while (posicao < numero) {
                escopo = posicao;
                posicao = posicao + posicaoAnterior;
                posicaoAnterior = escopo;
                if (posicao > numero) {
                    break;
                }
                sequencia.append(" ").append(posicao);
            }
            JOptionPane.showMessageDialog(null, sequencia.toString());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe um número inteiro positivo");
        }
    }
}
