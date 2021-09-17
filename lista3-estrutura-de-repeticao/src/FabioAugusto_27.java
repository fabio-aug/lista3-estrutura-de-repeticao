import javax.swing.*;

public class FabioAugusto_27 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
        String piramide = "#";
        for (int i = 0; i < numero; i++) {
            System.out.println(piramide);
            piramide += "#";
        }

    }
}
