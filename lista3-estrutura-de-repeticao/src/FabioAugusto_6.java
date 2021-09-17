import javax.swing.*;

public class FabioAugusto_6 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double n = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor para N: "));
        double soma = 0;
        for (int i = 0; i <= n; i++) {
            soma += i;
        }
        JOptionPane.showMessageDialog(null, "Soma: " + ((int)soma) + "\nMedia: " + (soma/n));
    }
}
