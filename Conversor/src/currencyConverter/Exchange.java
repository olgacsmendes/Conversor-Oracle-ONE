package currencyConverter;

import javax.swing.*;

import currencyConverter.ExchangeCurrency;
import currencyConverter.ExchangeCurrencyToReais;

public class Exchange {

    // Criação de duas instâncias das classes ExchangeCurrency e ExchangeCurrencyToReais
    ExchangeCurrency currency = new ExchangeCurrency();
    ExchangeCurrencyToReais reais = new ExchangeCurrencyToReais();

    // Método para converter a moeda com base na entrada do usuário
    public void convertCurrency(double inputValue) {
        // Exibe um diálogo de entrada para que o usuário escolha a opção de conversão
        String option = (JOptionPane.showInputDialog(null,
                "Para qual moeda deseja converter seu dinheiro? ",
                "Moedas",
                JOptionPane.PLAIN_MESSAGE,
                null,
                new Object[]{"De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Pesos Argentinos", "De Reais a Pesos Chilenos", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais", "De Pesos Argentinos a Reais", "De Pesos Chilenos a Reais"},
                "Escolha")).toString();

        // Switch para identificar qual opção de conversão o usuário escolheu e realizar a conversão apropriada
        switch (option) {
            case "De Reais a Dólares":
                currency.convertReaisToDollars(inputValue);
                break;
            case "De Reais a Euros":
                currency.convertReaisToEuros(inputValue);
                break;
            case "De Reais a Libras":
                currency.convertReaisToPounds(inputValue);
                break;
            case "De Reais a Pesos Argentinos":
                currency.convertReaisToArgentinianPesos(inputValue);
                break;
            case "De Reais a Pesos Chilenos":
                currency.convertReaisToChileanPesos(inputValue);
                break;
            case "De Dólares a Reais":
                reais.convertDollarsToReais(inputValue);
                break;
            case "De Euros a Reais":
                reais.convertEurosToReais(inputValue);
                break;
            case "De Libras a Reais":
                reais.convertPoundsToReais(inputValue);
                break;
            case "De Pesos Argentinos a Reais":
                reais.convertArgentinianPesosToReais(inputValue);
                break;
            case "De Pesos Chilenos a Reais":
                reais.convertChileanPesosToReais(inputValue);
                break;
        }
    }
}
