package model.veiculos;

import model.entities.Veiculo;

import java.math.BigDecimal;

public class Moto extends Veiculo {
    @Override
    public Double getValorDiaria() {
        return 100.0;
    }
}
