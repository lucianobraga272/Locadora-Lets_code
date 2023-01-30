package Enums;

public enum FormaPagamento {
    
    
    CARTAO("Cartão"), 
    DINHEIRO("Dinheiro"), 
    PIX("Pix"), 
    TRANSFERENCIA("Transferência");

    private String label;

    private FormaPagamento(String label){
        this.label = label;
    }

    public String getLabel(){
        return this.label;
    }
}
