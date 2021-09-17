import javax.swing.*;

public class FabioAugusto_24 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        StringBuilder print = new StringBuilder();
        double totalTipo1 = 0, totalTipo2 = 0, totalTipo3 = 0;
        int countTipo1 = 0, countTipo2 = 0;
        while (true) {
            try {
                int numeroConsumidor = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do consumidor"));
                if (numeroConsumidor == 0) break;
                double quantidadekWh = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de kWh consumidos: "));
                int tipoConsumidor = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de consumidor válido: \n1 – Residencial\n2 – Comercial\n3 – Industrial"));
                double totalPagar = 0;
                if (tipoConsumidor == 1) {
                    totalPagar = quantidadekWh * 0.3;
                    totalTipo1 += quantidadekWh;
                    countTipo1++;
                } else if (tipoConsumidor == 2) {
                    totalPagar = quantidadekWh * 0.5;
                    totalTipo2 += quantidadekWh;
                    countTipo2++;
                } else if (tipoConsumidor == 3) {
                    totalPagar = quantidadekWh * 0.7;
                    totalTipo3 += quantidadekWh;
                } else {
                    JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas!!!!");
                }
                print.append("Consumidor: ").append(numeroConsumidor).append(" - Total a pagar: ").append(totalPagar).append("\n");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Informe valores válidos!!!!");
            }
        }
        if (countTipo1 == 0) {
            countTipo1 = 1;
        }
        if (countTipo2 == 0) {
            countTipo2 = 1;
        }
        JOptionPane.showMessageDialog(null, print +
                "\nTotal de consumo Residencial: " + totalTipo1 +
                "\nTotal de consumo Comercial: " + totalTipo2 +
                "\nTotal de consumo Industrial: " + totalTipo3 +
                "\nMédia de consumo Residencial: " + (totalTipo1 / countTipo1) +
                "\nMédia de consumo Comercial: " + (totalTipo2 / countTipo2));
    }
}
