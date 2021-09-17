import javax.swing.*;

public class FabioAugusto_28 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(JOptionPane.showInputDialog("Informe um número positivo: "));
            String tabuada;
            for (int i = 1; i <= x; i++) {
                tabuada = "";
                for (int j = 1; j <= 10; j++) {
                    tabuada = String.format("%s\n%d * %d = %d", tabuada, i, j, i * j);
                }
                JOptionPane.showMessageDialog(null, tabuada);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe um valor válido");
        }
    }
}
