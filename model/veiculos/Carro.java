package model.veiculos;

import model.entities.Veiculo;

import java.math.BigDecimal;

public class Carro extends Veiculo {
    @Override
    public BigDecimal getValorDiaria() {
        return null;
    }

    public void setModel(String model){
        modelo = model;
    }
    public String getModel(){
        return modelo;
    }
    public void teste(){
        System.out.println(modelo);
    }
}
