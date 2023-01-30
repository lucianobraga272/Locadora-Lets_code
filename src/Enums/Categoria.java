package Enums;

public enum Categoria {
    CAMINHAO("Caminhão"), CAMINHOTE("Caminhote"),HATCH("Hatch"),SEDAN("Sedan"),SUV("SUV"), MOTO("Moto");

    public final String categoria;

     private Categoria(String categoria){
        this.categoria = categoria;
     }
}
