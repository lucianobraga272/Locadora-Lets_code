package Services;



import Enums.Bandeira;
import Interfaces.IPagamentoStrategy;
import Model.CartaoDebito;

public class PagamentoCartaoDebito implements IPagamentoStrategy {
    private CartaoDebito cartaoDebito;

    @Override
    public void coletaDadosPagamento() {
        System.out.println("\nColeta dados do cartão de d´rbito para processar pagamento");
        cartaoDebito = new CartaoDebito("4929 5979 9238 9366", 123, Bandeira.VISA);
    }

    @Override
    public void paga(double montante) {
        System.out.println("\nProcessando pagamento...");
        System.out.println("Pagamento com cartão de débito efetuado com sucesso! \nValor: R$ "+String.format("%.2f", montante) );
    }

    public CartaoDebito getCartao() {
        return cartaoDebito;
    }

    public void setCartao(CartaoDebito cartaoDebito) {
        this.cartaoDebito = cartaoDebito;
    }

    
    
}
