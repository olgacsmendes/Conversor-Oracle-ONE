package menu;

import javax.swing.*;

import currencyConverter.Exchange;

public class MenuPrincipal {
 public static void main(String[] args) {
     // Cria uma instância da classe Exchange para realizar as conversões de moedas
     Exchange currency = new Exchange();

     // Loop infinito para exibir o menu principal repetidamente
     while (true) {
         // Opções do menu principal
         String[] options = {"Conversor de Moedas", "Sair"};

         // Exibe uma caixa de diálogo de opções (JOptionPane) com as opções do menu principal
         int choice = JOptionPane.showOptionDialog(
                 null,
                 "O que deseja fazer?", // Pergunta exibida ao usuário
                 "Conversor de Moedas", // Título da janela
                 JOptionPane.DEFAULT_OPTION,
                 JOptionPane.PLAIN_MESSAGE,
                 null,
                 options,
                 options[0]
         );

         // Switch para lidar com a escolha do usuário no menu principal
         switch (choice) {
             case 0: // Se a escolha for "Conversor de Moedas"
                 // Exibe uma caixa de diálogo de entrada (JOptionPane) para receber o valor a ser convertido
                 String input = JOptionPane.showInputDialog("Quanto deseja converter? ");
                 // Verifica se o valor digitado pelo usuário é um número válido usando o método check()
                 if (check(input)) {
                     // Se for válido, converte o valor para double e chama o método convertCurrency() da classe Exchange
                     double inputValue = Double.parseDouble(input);
                     currency.convertCurrency(inputValue);

                     // Exibe uma caixa de diálogo de confirmação para perguntar se o usuário deseja continuar usando o conversor
                     int result = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Escolha", JOptionPane.YES_NO_OPTION);
                     // Se o usuário escolher "Não", exibe uma mensagem de despedida e sai do programa usando System.exit(0)
                     if (result == JOptionPane.NO_OPTION) {
                         JOptionPane.showMessageDialog(null, "Tchau! Obrigada por utilizar nosso conversor.");
                         System.exit(0);
                     }
                 } else {
                     // Se o valor digitado não for válido, exibe uma mensagem de erro
                     JOptionPane.showMessageDialog(null, "Valor inválido! Por favor, verifique o valor digitado.");
                 }
                 break;

             case 1: // Se a escolha for "Sair"
                 // Exibe uma mensagem de despedida e sai do programa usando System.exit(0)
                 JOptionPane.showMessageDialog(null, "Tchau! Obrigada por utilizar nosso conversor.");
                 System.exit(0);
         }
     }
 }

 // Método para verificar se a entrada é um número válido
 public static boolean check(String input) {
     try {
         double x = Double.parseDouble(input);
         return true; // Retorna true se o valor puder ser convertido para double
     } catch (NumberFormatException e) {
         return false; // Retorna false se ocorrer uma exceção (ou seja, o valor não é um número válido)
     }
 }
}
