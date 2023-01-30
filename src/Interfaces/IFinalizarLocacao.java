package Interfaces;

import Enums.FormaPagamento;
import Model.Locacao;
import Model.Pagamento;

public interface IFinalizarLocacao {
    Pagamento finalizar(Locacao locacao, FormaPagamento formaPagamento);
}
