package Interfaces;


import java.util.Map;
import java.util.Optional;


public interface IDAO <T extends IModel<ID>, ID> {
    void salvar(T t);
    void editar(T t);
    void deletar(ID i);
    Optional<T> buscarPorId(ID i);
    Map<ID,T> buscarTodos();
}
