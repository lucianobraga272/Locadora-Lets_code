package Model;

import Enums.FormaPagamento;
import Interfaces.IModel;

public class Pagamento implements IModel<Integer> {
    
    private int idEstatico=0;
    
    private int id;
    private Locacao locacao;
    private FormaPagamento formaPagamento;
    private double valor;

    public Pagamento(){

    }

    public Pagamento(Locacao locacao, FormaPagamento formaPagamento) {
        this.id = idEstatico++;
        this.locacao = locacao;
        this.formaPagamento = formaPagamento;
        this.valor = locacao.getValorTotal();
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Locacao getLocacao() {
        return locacao;
    }
    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }
    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pagamento [id=" + id + ", locacao=" + locacao + ", formaPagamento="
                + formaPagamento + ", valor=" + valor + "]";
    }

    
}
