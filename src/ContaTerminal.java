import java.io.IOException;
import java.util.Scanner;
import java.io.PrintStream;

import static java.lang.System.*;

public class ContaTerminal {

    public static void main (String[] args) throws IOException {

        System.out.println("Digite 6 digitos para o  Usuario ENTER para o proximo campo.");{
            // As vezes precisa digita mais de uma vez para ir para proxima etapa.
        }

        Scanner sc = new Scanner(in);
        String Usuario = sc.nextLine();
        String agencia = sc.nextLine();
        int numero = sc.nextInt();
        String NomeCliente = sc.nextLine();
        double saldo = sc.nextInt();

              Usuario = sc.nextLine();
            sc.nextLine(); // esvazia o buffer do teclado
        System.out.printf("Por favo, digite o número da Agência!");

                 agencia = sc.nextLine();
            sc.nextLine(); // esvazia o buffer do teclado
        System.out.printf("Informe o número");
                 numero = sc.nextInt();
            sc.nextLine(); // esvazia o buffer do teclado
        System.out.printf("Informe o nome e aperte ENTER para mais resultados.");
                 NomeCliente = sc.nextLine();


        try (PrintStream myPrintStream = new PrintStream(out)) {
            try {

            } finally {
                System.out.printf((String.format("Olá %s Obrigado por criar uma conta em nosso banco, sua agência é %s,conta %d e seu saldo %s já esta disponivel para saque.", NomeCliente, agencia, numero, saldo))).close();
            }







    }}}