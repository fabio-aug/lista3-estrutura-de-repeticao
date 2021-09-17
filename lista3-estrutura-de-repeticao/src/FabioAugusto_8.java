import javax.swing.*;

public class FabioAugusto_8 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            double n = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor para N: "));
            if (n > 0) {
                double soma = 0;
                for (double i = 1; i <= n; i++) {
                    double escopo = 1 / i;
                    if (i % 2 == 0) {
                        soma -= escopo;
                    } else {
                        soma += escopo;
                    }
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