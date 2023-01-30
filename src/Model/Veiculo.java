package Model;

import java.util.Arrays;

import Enums.Acessorio;
import Enums.Cambio;
import Enums.Categoria;
import Enums.Marca;
import Enums.Motor;
import Interfaces.IModel;

public class Veiculo implements IModel<String> {
    private String placa;
    private int anoFabricacao;
    private double valorDiaria;
    private boolean estaDisponivel;
    private Marca marca;
    private String modelo;
    private Categoria categoria;
    private Cambio cambio;
    private long km;
    private Motor tipoMotor;
    private Acessorio[] acessorios;

    public Veiculo(String placa, int anoFabricacao, double valorDiaria, boolean estaDisponivel, Marca marca,
            String modelo, Categoria categoria, Cambio cambio, long km, Motor tipoMotor, Acessorio[] acessorios) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.valorDiaria = valorDiaria;
        this.estaDisponivel = estaDisponivel;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
        this.cambio = cambio;
        this.km = km;
        this.tipoMotor = tipoMotor;
        this.acessorios = acessorios;
    }

    public String getId(){
        return this.placa;
    }

    public void setId(String placa){
        this.placa = placa;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public boolean isEstaDisponivel() {
        return estaDisponivel;
    }

    public void setEstaDisponivel(boolean estaDisponivel) {
        this.estaDisponivel = estaDisponivel;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Cambio getCambio() {
        return cambio;
    }

    public void setCambio(Cambio cambio) {
        this.cambio = cambio;
    }

    public long getKm() {
        return km;
    }

    public void setKm(long km) {
        this.km = km;
    }

    public Motor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(Motor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public Acessorio[] getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(Acessorio[] acessorios) {
        this.acessorios = acessorios;
    }

    @Override
    public String toString() {
        return "Veiculo [\nplaca="+ getId() +", \nanoFabricacao=" + anoFabricacao + ", \nvalorDiaria=" + valorDiaria + ", \nestaDisponivel="
                + estaDisponivel + ", \nmarca=" + marca + ", \nmodelo=" + modelo + ", \ncategoria=" + categoria + ", cambio="
                + cambio + ", \nkm=" + km + ", \ntipoMotor=" + tipoMotor + ", \nacessorios=" + Arrays.toString(acessorios)
                + "]";
    }

    
}
