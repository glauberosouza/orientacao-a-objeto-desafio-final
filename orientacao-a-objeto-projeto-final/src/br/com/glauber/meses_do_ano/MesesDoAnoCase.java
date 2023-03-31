package br.com.glauber.meses_do_ano;

import java.util.Scanner;

public class MesesDoAnoCase {

    public void execute() {
        Scanner entrada = new Scanner(System.in);
        String idioma = " ";
        do {
            System.out.println();
            System.out.println("EM PORTUGUÊS(ptBr) OU INGLÊS(en)?");
            idioma = entrada.nextLine().trim();
            if(idioma.isBlank()){
                System.out.println();
                System.out.println("INFORME UMA LINGUA VÁLIDA!");
            }
        } while (idioma.isBlank());

        mostrarMesesDoAno(idioma);

    }

    private void mostrarMesesDoAno(String idioma) {
        System.out.println();
        System.out.println("OS MESES DO ANO EM "+ idioma.toUpperCase()+ " SÃO: ");
        for (MesesDoAno mes: MesesDoAno.values())
        {
         String nome = "ptBr".equalsIgnoreCase(idioma) ? mes.getPtBr() : mes.getEn();
            System.out.println("=> " + nome);
        }
    }
}