package Controller;

import Interfaces.IPagamento;
import Model.Pagamento;
import Interfaces.IPagamentoStrategy;

public class PagamentoController extends GenericoController<Integer, Pagamento> implements IPagamento{
    private Pagamento pagamento;

    public PagamentoController(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void processar(IPagamentoStrategy pagamentoStrategy){
        pagamentoStrategy.coletaDadosPagamento();
    }

    public void pagar(IPagamentoStrategy pagamentoStrategy){
        pagamentoStrategy.paga(this.pagamento.getValor());
    }
    
}
