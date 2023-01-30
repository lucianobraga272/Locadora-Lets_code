package Controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import DAO.GenericoDAO;
import Interfaces.IBasicoController;
import Interfaces.IModel;

public class GenericoController<ID,T extends IModel<ID>> implements IBasicoController<T,ID>{
	GenericoDAO<T,ID> dao = new GenericoDAO<>();
	
	@Override
    public void salvar(T t) {
		try {
			dao.salvar(t);
			if(t.getClass().getSimpleName().charAt(t.getClass().getSimpleName().length()-1)=='a'){
				System.out.println(t.getClass().getSimpleName() + " inserida com sucesso!");
			}else{
				System.out.println(t.getClass().getSimpleName() + " inserido com sucesso!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void alterar(T t) {
		try {
			dao.salvar(t);
			if(t.getClass().getSimpleName().charAt(t.getClass().getSimpleName().length()-1)=='a'){
				System.out.println(t.getClass().getSimpleName() + " alterada com sucesso!");
			}else{
				System.out.println(t.getClass().getSimpleName() + " alterado com sucesso!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void excluir(ID id) {
		try {
			dao.deletar(id);
			System.out.println("Excluido com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public Map<ID,T> buscarTodos(){
		Map<ID,T> bd = new HashMap<>();
		try {
			bd = dao.buscarTodos();

			System.out.println("\nBuscar todos");
			bd.forEach((K,V) -> System.out.println(V));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return bd;
	}

	@Override
	public Optional<T> buscarPorId(ID id){
		Optional<T> opt = dao.buscarPorId(id);
		Optional<T> vazio = Optional.empty();
		if(opt==vazio){
			System.out.println("\nIdentificador não encontrado!");
		}else{
			System.out.println("\nIdentificador encontrado com sucesso");
		}
		return opt;
	}
    
}
