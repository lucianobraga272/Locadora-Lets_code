package Services;

import Interfaces.IPagamentoStrategy;
import Model.Pix;

public class PagamentoPix implements IPagamentoStrategy {
    Pix pix;

    @Override
    public void coletaDadosPagamento() {
        System.out.println("\nInforma dados do pix para processar pagamento");
        this.pix = new Pix("61987672123");
    }

    @Override
    public void paga(double montante) {
        System.out.println("\nProcessando pagamento...");
        System.out.println("Pagamento com pix efetuado com sucesso! \nValor: R$ "+String.format("%.2f", montante) );
        
    }
    
}
