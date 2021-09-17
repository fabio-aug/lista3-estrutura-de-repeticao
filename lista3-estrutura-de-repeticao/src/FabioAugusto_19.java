import javax.swing.*;

public class FabioAugusto_19 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        int count = 0;
        double soma = 0;
        while (true) {
            try {
                double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um valor:"));
                if (numero == -1) {
                    break;
                } else {
                    soma += numero;
                    count++;
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Informe um valor numérico");
            }
        }
        if (count == 0) {
            JOptionPane.showMessageDialog(null, "Não é possível dividir por 0");
        } else {
            JOptionPane.showMessageDialog(null, "Média: " + (soma / count));
        }
    }
}
