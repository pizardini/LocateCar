package model.veiculos;

import model.entities.Veiculo;

import java.math.BigDecimal;

public class Carro extends Veiculo {
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
