import javax.swing.*;
import java.text.MessageFormat;

public class FabioAugusto_32 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        int count = 0, numeroConta = 2, somaDivisao = 0;
        String numerosPerfeitos = "";
        while (count < 4) {
            for (int i = 1; i <= (numeroConta / 2); i++) {
                if (numeroConta % i == 0) {
                    somaDivisao += i;
                }
            }
            if (numeroConta == somaDivisao) {
                numerosPerfeitos = MessageFormat.format("{0}{1}; ", numerosPerfeitos, numeroConta);
                count++;
            }
            somaDivisao = 0;
            numeroConta++;
        }
        JOptionPane.showMessageDialog(null, "Os números perfeitos são: " + numerosPerfeitos);
    }
}
