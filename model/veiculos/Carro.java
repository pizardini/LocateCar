package model.veiculos;

import model.entities.Veiculo;

import java.math.BigDecimal;

public class Carro extends Veiculo {
    @Override
    public BigDecimal getValorDiaria() {
        return null;
    }

    public void setModelo(String model){
        modelo = model;
    }
    public String getModelo(){
        return modelo;
    }
}
