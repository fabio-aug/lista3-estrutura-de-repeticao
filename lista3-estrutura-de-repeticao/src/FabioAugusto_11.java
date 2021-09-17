import javax.swing.*;

public class FabioAugusto_11 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        String menorNome = "", maiorNome = "";
        double maior = 0, menor = 0, soma = 0;
        int option, contador = 0;
        boolean statusError = false;
        do {
            try {
                String nome = JOptionPane.showInputDialog(null, "Informe o nome do aluno: ");
                double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota: "));
                soma += numero;
                if (contador == 0) {
                    menorNome = nome;
                    maiorNome = nome;
                    maior = numero;
                    menor = numero;
                } else {
                    if (numero > maior) {
                        maiorNome = nome;
                        maior = numero;
                    } else if (numero < menor) {
                        menorNome = nome;
                        menor = numero;
                    }
                }
                contador++;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Informe valores válidos!");
                statusError = true;
                break;
            }
            option = JOptionPane.showConfirmDialog(null, "Deseja informar os dados de outro aluno? ", null, JOptionPane.YES_NO_OPTION);
        } while (option == JOptionPane.YES_OPTION);

        if (!statusError) {
            JOptionPane.showMessageDialog(null,
                    "--- Aluno com a maior nota --- \nNome: " + maiorNome + "\nNota: " + maior);
            JOptionPane.showMessageDialog(null,
                    "--- Aluno com a menor nota --- \nNome: " + menorNome + "\nNota: " + menor);
            JOptionPane.showMessageDialog(null,
                    "--- Dados da turma --- \nSoma: " + soma + "\nMédia: " + (soma / contador));
        }
    }
}
