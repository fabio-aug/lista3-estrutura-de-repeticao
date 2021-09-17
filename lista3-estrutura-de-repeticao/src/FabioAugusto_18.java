import javax.swing.*;

public class FabioAugusto_18 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        while (true) {
            try {
                double options = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "--- FÁBIO CALCULATOR ---" +
                                "\n========================" +
                                "\nOpções:" +
                                "\n1 - Soma" +
                                "\n2 - Subtração" +
                                "\n3 - Multiplicação" +
                                "\n4 - Divisão" +
                                "\n5 - Sair" +
                                "\n========================\n"));
                if (options == 5) {
                    break;
                } else {
                    if (options < 1 || options > 5) {
                        JOptionPane.showMessageDialog(null, "Informe um dos valores das opções!!!!");
                    } else {
                        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o primeiro numero: "));
                        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o segundo numero: "));
                        if (options == 1) {
                            double resultado = numero1 + numero2;
                            JOptionPane.showMessageDialog(null, "" + numero1 + " + " + numero2 + " = " + resultado);
                        } else if (options == 2) {
                            double resultado = numero1 - numero2;
                            JOptionPane.showMessageDialog(null, "" + numero1 + " - " + numero2 + " = " + resultado);
                        } else if (options == 3) {
                            double resultado = numero1 * numero2;
                            JOptionPane.showMessageDialog(null, "" + numero1 + " * " + numero2 + " = " + resultado);
                        } else if (options == 4) {
                            if (numero2 == 0) {
                                JOptionPane.showMessageDialog(null, "Não é possível dividir por 0!!!");
                            } else {
                                double resultado = numero1 / numero2;
                                JOptionPane.showMessageDialog(null, "" + numero1 + " / " + numero2 + " = " + resultado);
                            }
                        }
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Informe valores válidos");
            }
        }
    }
}
