package br.com.glauber.piada;

import java.util.ArrayList;
import java.util.Collections;

public class PiadaCase {
    public void execute() {
        contarUmaPiada();
    }

    private void contarUmaPiada() {
        ArrayList<String> piadas = new ArrayList<>();
        piadas.add("Por que enviar SPAM é algo justificável?\n" +
                "Porque os fins justificam os emails");
        piadas.add("Qual doença se pode pegar ao usar notebook?\n" +
                "A LAPTOPspirose");
        piadas.add("O que o Schwarzenegger disse quando instalaram o Windows XP pra ele?\n" +
                "Instala o Vista, baby");
        piadas.add("Qual a diferença entre Hardware e Software?\n" +
                "O Hardware você chuta, o Software você xinga");
        piadas.add("Quantos programadores são necessários para trocar uma lâmpada?\n" +
                "Nenhum, isso é problema de Hardware");
        piadas.add("Qual linguagem de programação o Han Solo detesta?\n" +
                "JabbaScript");
        piadas.add("Qual a música preferida do Sérgio Reis?\n" +
                "Toda vez que eu via Java pela estrada de Ouro Fino");

        //Classe Collections para usar o métoddo shuffle para embaralhar as minhas piadas
        Collections.shuffle(piadas);
        System.out.println(piadas.stream().findFirst().get());
    }
}