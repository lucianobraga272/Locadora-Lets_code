package Enums;

public enum Acessorio {
    AIRBAG("Airbag"), ALARME("Alarme"), AR_CONDICIONADO("Ar condicionado"), COMPUTADOR_DE_BORDO("Computador de bordo"), 
    CONTROLE_DE_TRACAO("Controle de tração"), FREIO_ABS("Freio ABS"), GPS("GPS"), MULTIMIDIA("Multimidia"), SENSOR_DE_ESTACIONAMENTO("Sensor de estacionamento"), 
    TETO_SOLAR("Teto solar"), TRACAO_4X4("Tração 4x4"), VIDROS_ELETRICOS("Vidros elétricos");
  
    private String label;

    private Acessorio(String label){
        this.label = label;
    }
    
    public String getLabel() {
        return label;
    }
}
