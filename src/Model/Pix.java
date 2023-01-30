package Model;

public class Pix {

    private String chave;
    private String qrCode;

    public Pix(String chave) {
        this.chave = chave;
    }

    public Pix(String chave, String qrCode) {
        this.chave = chave;
        this.qrCode = qrCode;
    }

    public String getChave() {
        return chave;
    }
    public void setChave(String chave) {
        this.chave = chave;
    }
    public String getQrCode() {
        return qrCode;
    }
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }
    
}
