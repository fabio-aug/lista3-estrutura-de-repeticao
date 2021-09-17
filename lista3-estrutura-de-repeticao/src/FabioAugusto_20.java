import javax.swing.*;

public class FabioAugusto_20 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        int countImpar = 0;
        double somaImpar = 0;
        double menorImpar = 0;
        int countPar = 0;
        double somaPar = 0;
        double maiorPar = 0;
        while (true) {
            try {
                double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um valor:"));
                if (numero < 0) {
                    break;
                } else {
                    if (numero % 2 == 0) {
                        somaPar += numero;
                        if (countPar == 0) {
                            countPar++;
                            maiorPar = numero;
                        } else {
                            countPar++;
                            if (numero > maiorPar) {
                                maiorPar = numero;
                            }
                        }
                    } else {
                        somaImpar += numero;
                        if (countImpar == 0) {
                            countImpar++;
                            menorImpar = numero;
                        } else {
                            countImpar++;
                            if (numero < menorImpar) {
                                menorImpar = numero;
                            }
                        }
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Informe um valor numérico");
            }
        }
        if (countImpar == 0 || countPar == 0) {
            JOptionPane.showMessageDialog(null, "Não é possível calcular a média por 0");
        } else {
            JOptionPane.showMessageDialog(null, "Média Par: " + (somaPar/countPar) +
                    "\nMaior Par: " + maiorPar +
                    "\nMédia Impar: " + (somaImpar/countImpar) +
                    "\nMenor Impar: " + menorImpar);
        }
    }
}
