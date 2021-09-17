import javax.swing.*;

public class FabioAugusto_23 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String args[]) {
        int distanciaA = 0, distanciaB = 0, segundos = 1;
        while (true) {
            distanciaA = (segundos * 30) / 1000;
            distanciaB = (segundos * 40) / 1000;
            if (distanciaA + distanciaB >= 400) {
                segundos /= 60;
                break;
            } else {
                segundos++;
            }
        }
        JOptionPane.showMessageDialog(null, "Se encontrarão depois de " + segundos + " minutos" +
                "\nLocomotiva A deve percorrer " + distanciaA + " KM até o encontro" +
                "\nLocomotiva B deve percorrer " + distanciaB + " KM até o encontro");
    }
}
