package Interfaces;

import Model.Cliente;
import Model.Funcionario;
import Model.Veiculo;

public interface IIniciarLocacao {
    void iniciar(Cliente cliente, Funcionario funcionario, Veiculo veiculo);
}
