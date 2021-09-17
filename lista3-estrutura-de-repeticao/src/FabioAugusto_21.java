import javax.swing.*;

public class FabioAugusto_21 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog(null, "Informe um número: ");
        boolean error = false;
        String[] caracteres = numero.split("");
        String[] caractetesContrarios = new String[caracteres.length];
        for (int i = caracteres.length, j = 0; i > 0; i--, j++) {
            caractetesContrarios[j] = caracteres[i-1];
        }
        for (int i = 0; i < caractetesContrarios.length; i++) {
            if (!caracteres[i].equals(caractetesContrarios[i])) {
                error = true;
                break;
            }
        }
        if (error) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " não é palíndromo!!!");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é palíndromo!!!");
        }
    }
}
