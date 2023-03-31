package br.com.glauber.menu_principal;

import br.com.glauber.imc.ImcCase;
import br.com.glauber.meses_do_ano.MesesDoAnoCase;
import br.com.glauber.ordernar_lista.OrdernarListaCase;
import br.com.glauber.piada.PiadaCase;

import java.util.Locale;
import java.util.Scanner;

public class MenuPrincipal {
    private MesesDoAnoCase mesesDoAnoCase = new MesesDoAnoCase();
    private ImcCase imc = new ImcCase();
    private OrdernarListaCase ordernarListaCase = new OrdernarListaCase();
    private PiadaCase piadaCase = new PiadaCase();

    Scanner entrada = new Scanner(System.in);

    public void menuPrincipal() {
        String opcao = " ";
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println(">> OLÁ! MEU NOME É 'SLAVE ROBOTO' SOU UMA IA EM CRESCIMENTO");
        System.out.println(">> JÁ POSSO FAZER ALGUMAS COISAS, VÊ SE SÃO ÚTEIS PARA VOCÊ");

        do {
            System.out.println();
            System.out.println("\nESCOLHA UMA DAS OPÇÕES ABAIXO:");
            System.out.println("0 ==> PARA FINALIZAR");
            System.out.println("1 ==> IMPRIMIR O NOME DOS MESES DO ANO");
            System.out.println("2 ==> PARA CALCULAR O ÍNDICE DE MASSA CORPORAL");
            System.out.println("3 ==> PARA ORDENAR UMA LISTA DE STRINGS");
            System.out.println("4 ==> ME CONTE UMA PIADA :)");

            opcao = entrada.nextLine();

            if (opcao.isBlank() && opcao.isEmpty()) {
                System.out.println("A ENTRADA NÃO PODE SER EM BRANCO!");
                return;
            }
            switch (opcao) {
                case "1":
                    mesesDoAnoCase.execute();
                    break;
                case "2":
                    imc.execute();
                    break;
                case "3":
                    ordernarListaCase.execute();
                    break;
                case "4":
                    piadaCase.execute();
                    break;
                default:
                    System.out.println("SLAVE ROBOTO DIZ: ATÉ LOGO :)");
            }
        } while (!opcao.equals("0"));
        entrada.close();
    }
}