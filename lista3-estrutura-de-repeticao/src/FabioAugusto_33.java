import javax.swing.*;

public class FabioAugusto_33 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        String CPF = JOptionPane.showInputDialog("Digite o CPF: ");
        String[] cpfDados = CPF.split("");
        int[] valores = new int[cpfDados.length];
        for (int i = 0; i < 11; i++) {
            valores[i] = Integer.parseInt(cpfDados[i]);
        }
        if (valores.length != 11) {
            JOptionPane.showMessageDialog(null, "CPF inválido");
        } else {
            int n = 10;
            int somatorio = 0;
            for (int i = 0; i < 9; i++) {
                somatorio = somatorio + valores[i] * n;
                n = n - 1;
            }
            somatorio = somatorio % 11;
            if (11 - somatorio < 2 && valores[9] != 0) {
                JOptionPane.showMessageDialog(null, "CPF inválido");
            } else {
                n = 11;
                somatorio = 0;
                for (int i = 0; i < 10; i++) {
                    somatorio = somatorio + valores[i] * n;
                    n = n - 1;
                }
                somatorio = somatorio % 11;
                if (11 - somatorio < 2 && valores[10] != 0) {
                    JOptionPane.showMessageDialog(null, "CPF inválido");
                } else {
                    JOptionPane.showMessageDialog(null, "CPF válido");
                }
            }
        }
    }
}
