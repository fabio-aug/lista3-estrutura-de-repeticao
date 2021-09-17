import javax.swing.*;

public class FabioAugusto_26 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor de X: "));
        int dividendo = 3;
        int fatorial;
        double senX = 0;
        int count = 0;
        while (count <= 15) {
            fatorial = dividendo;
            for (int i = dividendo; i > 1; i--) {
                System.out.println(i-1);
                fatorial *=  i-1;
            }
            if (count == 0) {
                senX = x - (Math.pow(x, dividendo) / fatorial);
            } else if (count % 2 == 0) {
                senX = senX - (Math.pow(x, dividendo) / fatorial);
            } else {
                senX = senX + (Math.pow(x, dividendo) / fatorial);
            }
            dividendo++;
            count++;
        }
        JOptionPane.showMessageDialog(null, "SenX: " + senX);
    }
}
