import javax.swing.*;

public class FabioAugusto_14 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));
            int fatorial = 1;
            for (int i = numero; i >= 1 ; i--) {
                fatorial *= i;
            }
            JOptionPane.showMessageDialog(null, numero + "! é " + fatorial);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe um número inteiro positivo");
        }
    }
}
