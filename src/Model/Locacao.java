package Model;

import java.time.LocalDateTime;

import Interfaces.IModel;

public class Locacao implements IModel<Integer> {
    static int idEstático = 0;
    
    private Integer id;
    private Cliente cliente;
    private Funcionario funcionario;
    private Veiculo veiculo;
    private LocalDateTime dataLocacao;
    private LocalDateTime dataEntrega;
    private double valorTotal;
    
    
    public Locacao(Integer id, Cliente cliente, Funcionario funcionario,
    Veiculo veiculo) {
        this.id = id;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.veiculo = veiculo;
        this.dataLocacao = LocalDateTime.now();
    }
    public Locacao(Cliente cliente, Funcionario funcionario,
    Veiculo veiculo) {
        this.id = idEstático++;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.veiculo = veiculo;
        this.dataLocacao = LocalDateTime.now();
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDateTime getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDateTime dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDateTime getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDateTime dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Locacao [\nid="+ getId() +", \ncliente=" + cliente + ", \nfuncionario=" + funcionario + ", \nveiculo=" + veiculo + ", \ndataLocacao="
                + dataLocacao + ", \ndataEntrega=" + dataEntrega + ", \nvalorTotal=" + valorTotal + "\n]";
    }
    
    
}
