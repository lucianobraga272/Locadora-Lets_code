package Demo;

import java.util.Map;

import Controller.FuncionarioController;
import Model.Funcionario;

public class FuncionarioControllerDemo {
    
    public static void main(String[] args){
        FuncionarioController controller = new FuncionarioController();

        //Criar funcionarios
        controller.salvar(new Funcionario(1234, "Vendedor Ruim"));
        controller.salvar(new Funcionario(1235, "Vendedor Bom"));

        //Buscar todos
        Map<Integer,Funcionario> map = controller.buscarTodos();
        System.out.println("\nTodos os funcionários:");
        map.forEach((k,v) -> System.out.println(v));

        //Buscar por id
        Funcionario funcionario = controller.buscarPorId(1234).get();

        //Alterar funcionario
        funcionario.setNome("Funcionario Mais ou Menos");
        controller.alterar(funcionario);
        System.out.println("\nApós alteração:");
        System.out.println(controller.buscarPorId(1234).get());

        //Excluir funcionario
        controller.excluir(1235);
        System.out.println("\nApós exclusão:");
        System.out.println(controller.buscarPorId(1235));

    }

}
