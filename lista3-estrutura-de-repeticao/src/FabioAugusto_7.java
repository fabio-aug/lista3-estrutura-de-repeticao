import javax.swing.*;

public class FabioAugusto_7 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            double n = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor para N: "));
            if (n > 0) {
                double soma = 0;
                for (double i = 1; i <= n; i++) {
                    soma += 1 / i;
                }
                JOptionPane.showMessageDialog(null, "Soma: " + soma);
            } else {
                JOptionPane.showMessageDialog(null, "Informe um valor numérico maior que 0!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe um valor numérico válido!");
        }
    }
}
