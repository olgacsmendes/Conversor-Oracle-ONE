package currencyConverter;

import javax.swing.*;

public class ExchangeCurrencyToReais {

    // Método para converter dólares para reais
    public void convertDollarsToReais(double inputValue) {
        double inDollars = inputValue * 5.13;
        // Arredonda o resultado para duas casas decimais
        inDollars = (double) Math.round(inDollars * 100d) / 100;
        // Exibe uma mensagem de diálogo mostrando o valor em reais convertido
        JOptionPane.showMessageDialog(null, "São R$ " + inDollars + " Reais");
    }

    // Método para converter euros para reais
    public void convertEurosToReais(double inputValue) {
        double inEuros = inputValue * 10.85;
        // Arredonda o resultado para duas casas decimais
        inEuros = (double) Math.round(inEuros * 100d) / 100;
        // Exibe uma mensagem de diálogo mostrando o valor em reais convertido
        JOptionPane.showMessageDialog(null, "São R$ " + inEuros + " Reais");
    }

    // Método para converter libras esterlinas para reais
    public void convertPoundsToReais(double inputValue) {
        double inPounds = inputValue * 6.33;
        // Arredonda o resultado para duas casas decimais
        inPounds = (double) Math.round(inPounds * 100d) / 100;
        // Exibe uma mensagem de diálogo mostrando o valor em reais convertido
        JOptionPane.showMessageDialog(null, "São R$ " + inPounds + " Reais");
    }

    // Método para converter pesos argentinos para reais
    public void convertArgentinianPesosToReais(double inputValue) {
        double inArgentinianPesos = inputValue * 0.039;
        // Arredonda o resultado para duas casas decimais
        inArgentinianPesos = (double) Math.round(inArgentinianPesos * 100d) / 100;
        // Exibe uma mensagem de diálogo mostrando o valor em reais convertido
        JOptionPane.showMessageDialog(null, "São R$" + inArgentinianPesos + " Reais");
    }

    // Método para converter pesos chilenos para reais
    public void convertChileanPesosToReais(double inputValue) {
        double inChileanPesos = inputValue * 0.0040;
        // Arredonda o resultado para duas casas decimais
        inChileanPesos = (double) Math.round(inChileanPesos * 100d) / 100;
        // Exibe uma mensagem de diálogo mostrando o valor em reais convertido
        JOptionPane.showMessageDialog(null, "São R$" + inChileanPesos + " Reais");
    }
}
