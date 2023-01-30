package Model;

import Interfaces.IModel;

public class Funcionario implements IModel<Integer> {
    private Integer matricula;
    private String nome;

    public Funcionario(Integer matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Integer getId() {
        return matricula;
    }

    public void setId(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario [\nmatricula="+ getId() +", \nnome=" + nome + "\n]";
    }

    
}
