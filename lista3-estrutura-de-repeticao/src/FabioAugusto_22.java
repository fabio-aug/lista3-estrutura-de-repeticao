import javax.swing.*;

public class FabioAugusto_22 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double cidadeA = 500000;
        double cidadeB = 700000;
        int count = 0;
        while (cidadeA < cidadeB) {
            cidadeA = cidadeA + (cidadeA * 0.03);
            cidadeB = cidadeB + (cidadeB * 0.02);
            count++;
        }
        JOptionPane.showMessageDialog(null, "A cidadeA passará a cidadeB no ano de " + (2015 + count));
    }
}
