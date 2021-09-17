import javax.swing.*;

public class FabioAugusto_10 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        int option;
        boolean statusError = false;
        int contador = 0;
        double maior = 0;
        double menor = 0;
        do {
            try {
                double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número: "));
                if (contador == 0) {
                    maior = numero;
                    menor = numero;
                } else {
                    if (numero > maior) {
                        maior = numero;
                    } else if (numero < menor) {
                        menor = numero;
                    }
                }
                contador++;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Informe um valor válido");
                statusError = true;
                break;
            }
            option = JOptionPane.showConfirmDialog(null, "Deseja informar mais um número? ", null, JOptionPane.YES_NO_OPTION);
        } while (option == JOptionPane.YES_OPTION);

        if (!statusError) {
            JOptionPane.showMessageDialog(null, "Maior número: " + maior + "\nMenor número: " + menor);
        }
    }
}
