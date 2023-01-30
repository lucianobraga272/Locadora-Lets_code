package Demo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import Controller.ClienteController;
import Controller.FuncionarioController;
import Controller.LocacaoController;
import Controller.PagamentoController;
import Controller.VeiculoController;
import Enums.Acessorio;
import Enums.Cambio;
import Enums.Categoria;
import Enums.FormaPagamento;
import Enums.Marca;
import Enums.Motor;
import Interfaces.IPagamentoStrategy;
import Model.Cliente;
import Model.Endereco;
import Model.Funcionario;
import Model.Locacao;
import Model.Pagamento;
import Model.Veiculo;
import Services.*;

public class LocacaoControllerDemo {
    
    public static void main(String[] args){
        //Criar cliente
        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente("12345678909", "Luciano Braga", "06921520875", "11972046258", LocalDate.of(1999, 12, 31),new Endereco(1, "DF", "Brasilia", "Asa Norte", "STN", 0, "Ap214"));
        clienteController.salvar(cliente);
       
        //Criar funcionario
        FuncionarioController funcionarioController = new FuncionarioController();
        Funcionario funcionario = new Funcionario(1235, "Vendedor Bom");
        funcionarioController.salvar(funcionario);

        //Criar veiculos
        VeiculoController veiculoController = new VeiculoController();
        Acessorio[] acessorios =new Acessorio[]{Acessorio.AIRBAG,Acessorio.ALARME, Acessorio.AR_CONDICIONADO, Acessorio.COMPUTADOR_DE_BORDO, Acessorio.MULTIMIDIA, Acessorio.SENSOR_DE_ESTACIONAMENTO, Acessorio.VIDROS_ELETRICOS};
        veiculoController.salvar(
            new Veiculo("ABC1234",2022,350.00,
            true, Marca.HYUNDAI, "HB20X", Categoria.HATCH,
            Cambio.AUTOMÁTICO,15000,Motor.COMBUSTAO, 
            acessorios));
        veiculoController.salvar(
            new Veiculo("DEF5678",2020,300.00,
            true,Marca.HONDA, "CIVIC",Categoria.SEDAN,
            Cambio.AUTOMÁTICO,25000,Motor.COMBUSTAO, 
            acessorios));

        //Criar Locação 
        LocacaoController locacaoController = new LocacaoController(veiculoController);
        
        Veiculo veiculo = veiculoController.buscarPorId("ABC1234").get();
        

       

        locacaoController.salvar(new Locacao(cliente, funcionario, veiculo));
       
        //Buscar todas as locações
        locacaoController.buscarTodos();
        
        //Buscar por id
        Locacao locacao = locacaoController.buscarPorId(0).get();
        
        //Alterar locação
        locacao.setVeiculo(new Veiculo("DEF5678",2020,300.00, true,Marca.HONDA, "CIVIC",Categoria.SEDAN, Cambio.AUTOMÁTICO,25000,Motor.COMBUSTAO, acessorios));
        locacaoController.alterar(locacao);
        System.out.println("\nLocacao após alteração:");
        System.out.println(locacaoController.buscarPorId(locacao.getId()).get());

        //Excluir locação
        locacaoController.excluir(45);
        System.out.println("\nApós exclusao:");
        System.out.println(locacaoController.buscarPorId(0));

        //Iniciar uma locacao
        locacaoController.iniciar(cliente, funcionario, veiculo);

        
        locacao = new Locacao(cliente, funcionario, veiculo);
            //Alterar a data de locação para 3 dias antes para não devolver o carro no mesmo dia
        locacao.setDataLocacao(LocalDateTime.of(2023, locacao.getDataLocacao().getMonth(), 
        locacao.getDataLocacao().getDayOfMonth()-3, 0, 0));
        locacaoController.salvar(locacao);

        //Finalizar uma locacao
        System.out.println(locacao.getVeiculo().getValorDiaria());
        Pagamento pagamento = locacaoController.finalizar(locacao, FormaPagamento.CARTAO);
        
        //Efetuar pagamento
        PagamentoController pagamentoController = new PagamentoController(pagamento);
        IPagamentoStrategy pagamentoStrategy;
        
        //Pagar com cartão
        pagamentoStrategy = new PagamentoCartaoCredito();
        
        pagamentoController.processar(pagamentoStrategy);

        pagamentoController.pagar(pagamentoStrategy);
    }

}
