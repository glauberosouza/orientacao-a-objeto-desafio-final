package br.com.glauber.ordernar_lista;

import java.text.Collator;
import java.util.Arrays;
import java.util.Scanner;

public class OrdernarListaCase {
    public void execute() {
        Scanner entrada = new Scanner(System.in);
        String listaOrdenadaStrings = " ";

        do{
            System.out.println();
            System.out.println("INFORMA A LISTA DE STRINGS SEPARANDO CADA STRING POR ';'");
            listaOrdenadaStrings = entrada.nextLine().trim();

            if(listavazia(listaOrdenadaStrings)){
                System.out.println();
                System.out.println("A LISTA DEVE CONTER VALORES");
                continue;
            }

            mostrarListaOrdenada(listaOrdenadaStrings);
        }while (listavazia(listaOrdenadaStrings));
    }

    private void mostrarListaOrdenada(String lista) {
        String[] conteudoDaLista = lista.split(";");
        Arrays.sort(conteudoDaLista, Collator.getInstance());

        System.out.println();
        System.out.println("SEGUE A LISTA ORDENADA:");
        System.out.println(Arrays.toString(conteudoDaLista));
    }

    private boolean listavazia(String lista) {
        return lista == null || lista.trim().isEmpty() || lista.startsWith(";");
    }
}