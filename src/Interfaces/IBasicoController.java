package Interfaces;

import java.util.Map;
import java.util.Optional;

public interface IBasicoController<T,ID> {
    void salvar(T t);
    void alterar(T t);
    void excluir(ID i);
    Optional<T> buscarPorId(ID i);
    Map<ID,T> buscarTodos();
}
