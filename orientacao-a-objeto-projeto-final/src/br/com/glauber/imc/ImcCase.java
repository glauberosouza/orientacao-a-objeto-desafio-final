package br.com.glauber.imc;

import java.util.Scanner;

public class ImcCase {

    public void execute() {
        Scanner entrada = new Scanner(System.in);
        Pessoa pessoa;

        do{
            System.out.println();
            System.out.println("QUAL O NOME DA PESSOA: ");
            String nome = entrada.nextLine().trim();

            System.out.println("QUAL O PESO: ");
            double peso = entrada.nextDouble();
            entrada.nextLine();

            System.out.println("QUAL A ALTURA: ");
            double altura = entrada.nextDouble();
            entrada.nextLine();

            pessoa = new Pessoa(nome, peso, altura);
            if(pessoa.atributosNaoEstaoCorretos()){
                System.out.println();
                System.out.println("INFORME DADOS VÁLIDOS");
            }
        }while (pessoa.atributosNaoEstaoCorretos());



        calcularImc(pessoa);
    }

    private void calcularImc(Humanoid humanoid) {
        System.out.printf("O IMC DE %s É: %.2f\n", humanoid.getNome(), humanoid.getImc());
    }
}