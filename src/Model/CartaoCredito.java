package Model;

import Enums.Bandeira;

public class CartaoCredito extends Cartao {

    private String mesAnoValidade;

    public CartaoCredito(String numero, int cvv, Bandeira bandeira, String mesAnoValidade) {
        super(numero, cvv, bandeira);
        this.mesAnoValidade = mesAnoValidade;
    }
    
    public String getMesAnoValidade() {
        return mesAnoValidade;
    }
    public void setMesAnoValidade(String mesAnoValidade) {
        this.mesAnoValidade = mesAnoValidade;
    }
}
