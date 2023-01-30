package Model;

import java.time.LocalDate;

import Interfaces.IModel;

public class Cliente implements IModel<String> {
    private String cpf;
    private String nome;
    private String cnh;
    private String telefone;
    private LocalDate dataNascimento;
    private Endereco endereco;

    public Cliente(String cpf, String nome, String cnh, String telefone, LocalDate dataNascimento, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.cnh = cnh;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getId() {
        return cpf;
    }
    
    public void setId(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente [\ncpf=" + cpf + ", \nnome=" + nome + ", \ncnh=" + cnh + ", \ntelefone=" + telefone
                + ", \ndataNascimento=" + dataNascimento + ", \nendereco=" + endereco + "\n]";
    }

    
}
