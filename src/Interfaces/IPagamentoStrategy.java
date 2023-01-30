package Interfaces;


public interface IPagamentoStrategy {
   
    void coletaDadosPagamento();
    void paga(double montante);    
}
