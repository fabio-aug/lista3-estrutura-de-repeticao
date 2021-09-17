import javax.swing.*;

public class FabioAugusto_29 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        int numberA = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        int numberB = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
        int somaAux = 0, quociente = 0, resto;
        do {
            somaAux += numberB;
            quociente++;
            resto = numberA - somaAux;
        } while (resto >= numberB);
        JOptionPane.showMessageDialog(null, "Quociente: " + quociente + "\nResto: " + resto);
    }
}
