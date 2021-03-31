package Squadra;

import java.time.LocalDate;

public class Ingrediente {
    private String nome;
    private LocalDate dataValidade;

    public Ingrediente(String nome, LocalDate dataValidade) {
        this.nome = nome;
        this.dataValidade = dataValidade;
    }

    public String toString() {
        int diaMes = dataValidade.getDayOfMonth();
        int mes = dataValidade.getMonthValue();
        int ano = dataValidade.getYear();
        return "Ingrediente: " + nome + " válido até " + diaMes + "/" + mes + "/" + ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
}