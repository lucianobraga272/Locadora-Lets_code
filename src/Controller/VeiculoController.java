package Controller;

import Interfaces.IAlugarVeiculo;
import Interfaces.IDevolverVeiculo;
import Model.Veiculo;

public class VeiculoController extends GenericoController<String, Veiculo> implements IAlugarVeiculo, IDevolverVeiculo {
    
    public void alugarVeiculo(String placa){
        Veiculo veiculo = buscarPorId(placa).get();
        veiculo.setEstaDisponivel(false);
        dao.editar(veiculo);
        // System.out.println("\nVeiculo alugado!");
    }

    public void devolverVeiculo(String placa, long kmAtual){
        Veiculo veiculo = buscarPorId(placa).get();
        veiculo.setEstaDisponivel(true);
        veiculo.setKm(kmAtual);
        dao.editar(veiculo);
        // System.out.println("\nVeiculo devolvido!");
    }
}
