package Controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import Enums.FormaPagamento;
import Interfaces.IFinalizarLocacao;
import Interfaces.IIniciarLocacao;
import Model.Cliente;
import Model.Funcionario;
import Model.Locacao;
import Model.Pagamento;
import Model.Veiculo;

public class LocacaoController extends GenericoController<Integer,Locacao> implements IIniciarLocacao, IFinalizarLocacao {
    VeiculoController veiculoController = new VeiculoController();

    
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    public LocacaoController(){

    }
    public LocacaoController(VeiculoController veiculoController){
        this.veiculoController = veiculoController;
    }

    public void iniciar(Cliente cliente, Funcionario funcionario, Veiculo veiculo){
        Locacao locacao = new Locacao(cliente, funcionario, veiculo);
        dao.salvar(locacao);
        veiculoController.alugarVeiculo(locacao.getVeiculo().getId());

        
        System.out.println("\nVeiculo alugado!"+
        "\nCliente: "+locacao.getCliente().getNome() +
        "\nValor da locação por dia: R$ " + String.format("%.2f", locacao.getVeiculo().getValorDiaria()) +
        "\nData e hora: " + locacao.getDataLocacao().format(formato));
    }

    public Pagamento finalizar(Locacao locacao, FormaPagamento formaPagamento){
        locacao.setDataEntrega(LocalDateTime.now());
        calcularValorTotal(locacao);
        locacao.setValorTotal(calcularValorTotal(locacao));
        dao.editar(locacao);
        
        veiculoController.devolverVeiculo(locacao.getVeiculo().getId(), locacao.getVeiculo().getKm());

        System.out.println("\nVeiculo devolvido!"+
                            "\nCliente: "+locacao.getCliente().getNome() +
                            "\nValor da locação: R$ " + String.format("%.2f", locacao.getValorTotal()) +
                            "\nDuração: " + ChronoUnit.DAYS.between(locacao.getDataLocacao(),locacao.getDataEntrega()) + " dias" +
                            "\nData e hora: " + locacao.getDataEntrega().format(formato)+
                            "\nEfetue o pagamento!");
        return new Pagamento(locacao, formaPagamento);
    }

    public double calcularValorTotal(Locacao locacao){
        int dias;
        long horas = (ChronoUnit.HOURS.between(locacao.getDataLocacao(),locacao.getDataEntrega()));

        if((ChronoUnit.HOURS.between(locacao.getDataLocacao(),locacao.getDataEntrega()))%24>0){
            dias = ((int) horas/24)+1;
        }else{
            dias = (int)horas/24;
        }

        double valorTotal = dias*locacao.getVeiculo().getValorDiaria();
        

        return (valorTotal);

    }

}
