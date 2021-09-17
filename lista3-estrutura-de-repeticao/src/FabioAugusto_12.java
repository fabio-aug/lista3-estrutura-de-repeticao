import javax.swing.*;

public class FabioAugusto_12 {

    /* Fábio Augusto Araújo Santos */

    static class Dados {
        double somaVeiculo = 0, somaAcidente = 0;
        String menorCidade, maiorCidade;
        double menorIndide = 0, maiorIndice = 0;
        double cidadesMenor200 = 0, acidentesMenor200 = 1;
    }

    public static void main(String[] args) {
        int count = 0;
        Dados d1 = new Dados();
        while (count < 5) {
            String nome = JOptionPane.showInputDialog(null, "Informe o nome da cidade " + (count + 1) + ":");
            int numeroVeiculos = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de veículos da cidade " + (count + 1) + ":"));
            int numeroAcidentes = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de acidentes da cidade " + (count + 1) + ":"));
            d1.somaAcidente += numeroVeiculos;
            d1.somaVeiculo += numeroAcidentes;
            if (count == 0) {
                d1.maiorCidade = nome;
                d1.maiorIndice = numeroAcidentes;
                d1.menorCidade = nome;
                d1.menorIndide = numeroAcidentes;
            } else {
                if (numeroAcidentes > d1.maiorIndice) {
                    d1.maiorIndice = numeroAcidentes;
                    d1.maiorCidade = nome;
                } else if (numeroAcidentes < d1.menorIndide) {
                    d1.menorIndide = numeroAcidentes;
                    d1.menorCidade = nome;
                }
            }

            if (numeroAcidentes < 200) {
                d1.acidentesMenor200 += numeroAcidentes;
                d1.cidadesMenor200 += 1;
            }
            count++;
        }

        JOptionPane.showMessageDialog(null,
                "Cidade com maior índice de acidentes é: " + d1.maiorCidade + " - Quantidade: " + ((int)d1.maiorIndice)
                + "\nCidade com menor índice de acidentes é: " + d1.menorCidade + " - Quantidade: " + ((int)d1.menorIndide)
                + "\nMédia de veículos: " + (d1.somaVeiculo / 5)
                + "\nA média de acidentes de trânsito: " + (d1.acidentesMenor200 / d1.cidadesMenor200)
        );
    }
}
