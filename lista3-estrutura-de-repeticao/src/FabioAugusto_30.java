import javax.swing.*;

public class FabioAugusto_30 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        StringBuilder print = new StringBuilder();
        int totalVendas = 0, vendas = 0;
        double valorMaximo = 0, precoLucro = 0, preco = 5, lucroEstimado;
        while (preco >= 1.0) {
            totalVendas = 120 + (vendas * 26);
            lucroEstimado = totalVendas * preco;
            print.append("\nPreço do ingresso: ").append(preco).append(" R$ - Lucro estimado: ").append((int) lucroEstimado).append(" R$");
            if (valorMaximo < lucroEstimado) {
                valorMaximo = lucroEstimado;
                precoLucro = preco;
            }
            preco = preco - 0.5;
            vendas++;
        }
        JOptionPane.showMessageDialog(null, "\n\nO maior lucro: " + valorMaximo + " - Preço do ingresso: " + precoLucro + " - Total de vendas: " + totalVendas + "\n" + print);
    }
}
