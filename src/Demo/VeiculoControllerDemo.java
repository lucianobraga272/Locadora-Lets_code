package Demo;

import java.util.Map;

import Controller.VeiculoController;
import Enums.Acessorio;
import Enums.Cambio;
import Enums.Categoria;
import Enums.Marca;
import Enums.Motor;
import Model.Veiculo;

public class VeiculoControllerDemo {

    public static void main(String[] args){
        VeiculoController controller = new VeiculoController();

        //Criar veiculos
        Acessorio[] acessorios =new Acessorio[]{Acessorio.AIRBAG,Acessorio.ALARME, Acessorio.AR_CONDICIONADO, Acessorio.COMPUTADOR_DE_BORDO, Acessorio.MULTIMIDIA, Acessorio.SENSOR_DE_ESTACIONAMENTO, Acessorio.VIDROS_ELETRICOS};
        controller.salvar(
            new Veiculo("ABC1234",2022,350.00,
            true,Marca.HYUNDAI, "HB20X",Categoria.HATCH,
            Cambio.AUTOMÁTICO,15000,Motor.COMBUSTAO, 
            acessorios));
        controller.salvar(
            new Veiculo("DEF5678",2020,300.00,
            true,Marca.HONDA, "CIVIC",Categoria.SEDAN,
            Cambio.AUTOMÁTICO,25000,Motor.COMBUSTAO, 
            acessorios));
        

        //Buscar todos
        Map<String,Veiculo> map = controller.buscarTodos();
        System.out.println("\nTodos os veiculos:");
        map.forEach((k,v) -> System.out.println(v));

        //Buscar por id
        Veiculo veiculo = controller.buscarPorId("ABC1234").get();

        //Alterar veiculo
        veiculo.setKm(15630);
        controller.alterar(veiculo);
        System.out.println("\nApós alteração:");
        System.out.println(controller.buscarPorId("ABC1234").get());

        //Excluir veiculo
        controller.excluir("ABC1234");
        System.out.println("\nApós exclusão:");
        System.out.println(controller.buscarPorId("ABC1234"));

        //Alugar veiculo
        controller.alugarVeiculo("DEF5678");

        //Devolver veiculo
        controller.devolverVeiculo("DEF5678", 25205);
    }
    
}
