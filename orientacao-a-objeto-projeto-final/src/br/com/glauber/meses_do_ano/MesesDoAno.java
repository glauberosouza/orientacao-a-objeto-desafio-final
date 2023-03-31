package br.com.glauber.meses_do_ano;

public enum MesesDoAno {
    JANEIRO("Janeiro", "January"),
    FEVEREIRO("Fevereiro", "February"),
    MARCO("Março", "March"),
    ABRIL("Abril", "April"),
    MAIO("Maio", "May"),
    JUNHO("Junho", "June"),
    JULHO("Julho", "July"),
    AGOSTO("Agosto", "August"),
    SETEMBRO("Setembro", "September"),
    OUTUBRO("Outubro", "October"),
    NOVEMBRO("Novembro", "November"),
    DEZEMBRO("Dezembro", "December");

    private final String ptBr;
    private final String en;

    MesesDoAno(String ptBr, String en) {
        this.ptBr = ptBr;
        this.en = en;
    }
    public String getPtBr(){
        return ptBr;
    }
    public String getEn(){
        return en;
    }
}