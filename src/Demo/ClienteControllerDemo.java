package Demo;

import java.time.LocalDate;
import java.util.Map;

import Controller.ClienteController;
import Model.Cliente;
import Model.Endereco;

public class ClienteControllerDemo {
    
    public static void main(String[] args){
        ClienteController controller = new ClienteController();

        //Criar cliente 
        controller.salvar(new Cliente("12345678909", "Luciano Braga", "06921520875", "11972046258", LocalDate.of(1999, 12, 31),new Endereco(1, "DF", "Brasilia", "Asa Norte", "STN", 0, "Ap214")));
        controller.salvar(new Cliente("12321348909", "Cliente Segundo", "08951520875", "61972046258", LocalDate.of(1988, 12, 31),new Endereco(1, "DF", "Brasilia", "Asa Norte", "STN", 0, "Ap214")));
        
        //Buscar todos os clientes
        Map<String,Cliente> map = controller.buscarTodos();
        System.out.println("\nTodos os clientes:");
        map.forEach((k,v) -> System.out.println(v));

        //Deletar cliente
        controller.excluir("12321348909");
        System.out.println("\nApós exclusao:");
        System.out.println(controller.buscarPorId("12321348909"));
        
        //Buscar por id
        Cliente cliente1 = controller.buscarPorId("12345678909").get();
        
        //Alterar cliente
        cliente1.setNome("Primeiro Cliente");
        controller.alterar(cliente1);
        
        System.out.println("\nCliente após alteração:");
        System.out.println(controller.buscarPorId("12345678909").get());
        
    }
}
