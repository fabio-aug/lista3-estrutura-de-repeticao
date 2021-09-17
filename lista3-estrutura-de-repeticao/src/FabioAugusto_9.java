import javax.swing.*;

public class FabioAugusto_9 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        int option;
        double numero = 0;
        int media = 0;
        boolean statusError = false;
        do {
            try {
                numero += Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número: "));
                media++;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Informe um valor válido");
                statusError = true;
                break;
            }
            option = JOptionPane.showConfirmDialog(null, "Deseja informar mais um número? ", null, JOptionPane.YES_NO_OPTION);
        } while (option == JOptionPane.YES_OPTION);

        if (!statusError) {
            JOptionPane.showMessageDialog(null, "Somatório: " + numero + "\nMedia: " + (numero / media));
        }
    }
}
