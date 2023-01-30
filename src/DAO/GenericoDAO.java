package DAO;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import Interfaces.IDAO;
import Interfaces.IModel;

public class GenericoDAO<T extends IModel<ID>, ID> implements IDAO<T, ID>{
    public Map<ID,T> bd = new HashMap<>();

    public void salvar(T t) {
        bd.put(t.getId(), t);
    }

    public void editar(T t) {
        bd.replace(t.getId(), t);
    }

    public void deletar(ID id) {
        bd.remove(id);
    }

    public Optional<T> buscarPorId(ID id) {
       return Optional.ofNullable(bd.get(id));
    }
    
    public Map<ID,T> buscarTodos() {
        return bd;
    }
    
}
