package Model;

import Interfaces.IModel;

public class Endereco implements IModel<Integer> {
    private Integer id;
    private String estado;
    private String cidade;
    private String bairro;
    private String logradouro;
    private int numero;
    private String complemento;
    
    public Endereco(Integer id, String estado, String cidade, String bairro, String logradouro, int numero,
            String complemento) {
        this.id = id;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco [id="+ getId() +", estado=" + estado + ", cidade=" + cidade + ", bairro=" + bairro + ", logradouro=" + logradouro
                + ", numero=" + numero + ", complemento=" + complemento + "]";
    }
    
    
}
