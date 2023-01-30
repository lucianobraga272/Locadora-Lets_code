package Model;

import Enums.Bandeira;

public abstract class Cartao {

    private String numero;
    private int cvv;
    private Bandeira bandeira;

    public Cartao(String numero, int cvv, Bandeira bandeira) {
        this.numero = numero;
        this.cvv = cvv;
        this.bandeira = bandeira;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public int getCvv() {
        return cvv;
    }
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    public Bandeira getBandeira() {
        return bandeira;
    }
    public void setBandeira(Bandeira bandeira) {
        this.bandeira = bandeira;
    }
}
