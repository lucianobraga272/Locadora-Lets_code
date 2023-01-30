package Interfaces;

public interface IPagamento {
    void processar(IPagamentoStrategy pagamentoStrategy);

    void pagar(IPagamentoStrategy pagamentoStrategy);
}
