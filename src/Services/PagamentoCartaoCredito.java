package Services;



import Enums.Bandeira;
import Interfaces.IPagamentoStrategy;
import Model.CartaoCredito;

public class PagamentoCartaoCredito implements IPagamentoStrategy {
    private CartaoCredito cartaoCredito;

    @Override
    public void coletaDadosPagamento() {
        System.out.println("\nColeta dados do cartão de credito para processar pagamento");
        this.cartaoCredito = new CartaoCredito("4929 5979 9238 9366", 123, Bandeira.VISA, "11/2030");
    }

    @Override
    public void paga(double montante) {
        System.out.println("\nProcessando pagamento...");
        System.out.println("Pagamento com cartão de crédito efetuado com sucesso! \nValor: R$ "+String.format("%.2f", montante) );
    }

    public CartaoCredito getCartao() {
        return cartaoCredito;
    }

    public void setCartao(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }
    
}
