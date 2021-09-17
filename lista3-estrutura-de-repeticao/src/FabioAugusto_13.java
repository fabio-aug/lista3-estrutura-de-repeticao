import javax.swing.*;

public class FabioAugusto_13 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número: "));
            boolean primo = true;
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0 && i != 1) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                JOptionPane.showMessageDialog(null, "O número " + numero + " é primo!!!");
            } else {
                JOptionPane.showMessageDialog(null, "O número " + numero + " não é primo!!!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe um valor válido");
        }
    }
}
