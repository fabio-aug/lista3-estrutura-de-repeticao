import javax.swing.*;

public class FabioAugusto_16 {

    /* Fábio Augusto Araújo Santos */

    static class Dados {
        String binario;
        String octal;
        int decimal;
        String hexadecimal;
        boolean error = false;
    }

    public static String converterHexa(int numero) {
        String valoresHexa = "0123456789ABCDEF";
        String hexadecimal = "";
        while (numero > 0) {
            int resto = numero % 16;
            hexadecimal = String.format("%s%s", valoresHexa.charAt(resto), hexadecimal);
            numero = numero / 16;
        }
        return hexadecimal;
    }

    public static String converterOctal(int numero) {
        String valoresOctal = "01234567";
        String octal = "";
        while (numero > 0) {
            int resto = numero % 8;
            octal = String.format("%s%s", valoresOctal.charAt(resto), octal);
            numero = numero / 8;
        }
        return octal;
    }

    public static void main(String[] args) {
        Dados d1 = new Dados();
        d1.binario = JOptionPane.showInputDialog(null, "Informe um número binário: ");
        String[] listaNumero = d1.binario.split("");
        int potencia = 0;
        for (int i = (listaNumero.length - 1); i >= 0; i--) {
            if (!listaNumero[i].equals("0") && !listaNumero[i].equals("1")) {
                d1.error = true;
                break;
            } else {
                d1.decimal += Integer.parseInt(listaNumero[i]) * Math.pow(2, potencia);
                potencia++;
            }
        }
        if (d1.error) {
            JOptionPane.showMessageDialog(null, "Informe um numero binário!!!");
        } else {
            d1.hexadecimal = converterHexa(d1.decimal);
            d1.octal = converterOctal(d1.decimal);

            JOptionPane.showMessageDialog(null,
                    "Binário: " + d1.binario
                            + "\nOctal: " + d1.octal
                            + "\nDecimal: " + d1.decimal
                            + "\nHexadecimal: " + d1.hexadecimal);
        }
    }
}
