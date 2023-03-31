package br.com.glauber.imc;

public class Pessoa implements Humanoid {
    private String nome;
    private double peso;
    private double altura;

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public boolean atributosNaoEstaoCorretos() {
        if(nome == null || nome.matches(".*\\d.*") || peso <= 0 || altura <= 0){
            return true;
        }
       return false;
    }

    @Override
    public double getImc() {
        return peso / (altura * altura);
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}