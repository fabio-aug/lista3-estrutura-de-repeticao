import javax.swing.*;

public class FabioAugusto_17 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double dividendo, divisor, resto;
        dividendo = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe dividendo: "));
        divisor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe divisor: "));
        do {
            resto = dividendo % divisor;
            dividendo = divisor;
            divisor = resto;
        } while (resto != 0);
        JOptionPane.showMessageDialog(null, "MDC: " + dividendo);
    }
}
