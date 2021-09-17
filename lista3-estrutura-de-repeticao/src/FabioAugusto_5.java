import javax.swing.*;

public class FabioAugusto_5 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double soma = 0;
        for (int i = 0; i <= 10; i++) {
            soma += i;
        }
        JOptionPane.showMessageDialog(null, "Soma: " + ((int)soma) + "\nMedia: " + (soma/10));
    }
}
