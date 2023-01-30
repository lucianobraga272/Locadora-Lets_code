package Model;

import Enums.Bandeira;

public class CartaoDebito extends Cartao {

    public CartaoDebito(String numero, int cvv, Bandeira bandeira) {
        super(numero, cvv, bandeira);
    }
    
}
