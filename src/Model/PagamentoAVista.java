package Model;

public abstract class PagamentoAVista {
    private double valor;

    public PagamentoAVista(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }
}
