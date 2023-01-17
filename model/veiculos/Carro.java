package model.veiculos;

import model.entities.Veiculo;

import java.math.BigDecimal;

public class Carro extends Veiculo {
    public Carro() {
    }

    public Carro(String fabricante, String modelo, String placa, String ano) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.alugado = false;
    }

    @Override
    public Double getValorDiaria() {
        return 150.0 ;
    }

    public void setModelo(String model){
        modelo = model;
    }
    public String getModelo(){
        return modelo;
    }
}
