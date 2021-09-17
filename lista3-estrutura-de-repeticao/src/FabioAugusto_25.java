import javax.swing.*;

public class FabioAugusto_25 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double somatorio = 1;
        int dividendo = 3;
        int count = 0;
        while (count <= 51) {
            if (count == 0) {
                somatorio = somatorio - (1 / Math.pow(dividendo, 3));
            } else if (count % 2 == 0) {
                somatorio = somatorio - (1 / Math.pow(dividendo, 3));
            } else {
                somatorio = somatorio + (1 / Math.pow(dividendo, 3));
            }
            dividendo++;
            count++;
        }
        JOptionPane.showMessageDialog(null, "Valor de PI: " + (Math.cbrt((somatorio * 32))));
    }
}
