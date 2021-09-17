import javax.swing.*;

public class FabioAugusto_31 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        int votos1 = 0, votos2 = 0, votos3 = 0, votos4 = 0, votosBranco = 0, votosNulo = 0;
        while (true) {
            try {
                int voto = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe seu voto:" +
                        "\n1 - Candidato W" +
                        "\n2 - Candidato X" +
                        "\n3 - Candidato Y" +
                        "\n4 - Candidato Z" +
                        "\n5 - Branco" +
                        "\n? -  Nulo" +
                        "\n0 - Sair"));
                if (voto == 1) {
                    votos1++;
                } else if (voto == 2) {
                    votos2++;
                } else if (voto == 3) {
                    votos3++;
                } else if (voto == 4) {
                    votos4++;
                } else if (voto == 5) {
                    votosBranco++;
                } else if (voto == 0) {
                    break;
                } else {
                    votosNulo++;
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Informe valores válidos!!!");
            }
        }
        JOptionPane.showMessageDialog(null, "\nVotos candidato W (1): " + votos1 +
                "\nVotos candidato X (2): " + votos2 +
                "\nVotos candidato Y (3): " + votos3 +
                "\nVotos candidato Z (4): " + votos4 +
                "\nVotos em Branco (5): " + votosBranco +
                "\nVotos nulo: " + votosNulo);
    }
}
