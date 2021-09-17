import javax.swing.*;

public class FabioAugusto_4 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        while (true) {
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Informe um número: "));
            if (numero == -999) {
                break;
            }
            JOptionPane.showMessageDialog(null, "Resultado: " + (numero * 3));
        }
    }
}
