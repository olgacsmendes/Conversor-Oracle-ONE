package currencyConverter;

import javax.swing.*;

public class ExchangeCurrency {

    // Método para converter reais para dólares
    public void convertReaisToDollars(double inputValue) {
        double inDollars = inputValue / 4.72;
        // Arredonda o resultado para duas casas decimais
        inDollars = (double) Math.round(inDollars * 100d) / 100;
        // Exibe uma mensagem de diálogo mostrando o valor em dólares convertido
        JOptionPane.showMessageDialog(null, "São $ " + inDollars + " Dólares");
    }

    // Método para converter reais para euros
    public void convertReaisToEuros(double inputValue) {
        double inEuros = inputValue / 5.20;
        // Arredonda o resultado para duas casas decimais
        inEuros = (double) Math.round(inEuros * 100d) / 100;
        // Exibe uma mensagem de diálogo mostrando o valor em euros convertido
        JOptionPane.showMessageDialog(null, "São $ " + inEuros + " Euros");
    }

    // Método para converter reais para libras esterlinas
    public void convertReaisToPounds(double inputValue) {
        double inPounds = inputValue / 6.07;
        // Arredonda o resultado para duas casas decimais
        inPounds = (double) Math.round(inPounds * 100d) / 100;
        // Exibe uma mensagem de diálogo mostrando o valor em libras esterlinas convertido
        JOptionPane.showMessageDialog(null, "São $ " + inPounds + " Libras Esterlinas");
    }

    // Método para converter reais para pesos argentinos
    public void convertReaisToArgentinianPesos(double inputValue) {
        double inArgentinianPesos = inputValue / 0.017;
        // Arredonda o resultado para duas casas decimais
        inArgentinianPesos = (double) Math.round(inArgentinianPesos * 100d) / 100;
        // Exibe uma mensagem de diálogo mostrando o valor em pesos argentinos convertido
        JOptionPane.showMessageDialog(null, "São $ " + inArgentinianPesos + " Pesos Argentinos");
    }

    // Método para converter reais para pesos chilenos
    public void convertReaisToChileanPesos(double inputValue) {
        double inChileanPesos = inputValue / 0.0057;
        // Arredonda o resultado para duas casas decimais
        inChileanPesos = (double) Math.round(inChileanPesos * 100d) / 100;
        // Exibe uma mensagem de diálogo mostrando o valor em pesos chilenos convertido
        JOptionPane.showMessageDialog(null, "São $ " + inChileanPesos + " Pesos Chilenos");
    }
}
