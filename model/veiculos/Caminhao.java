package model.veiculos;

import model.entities.Veiculo;

import java.math.BigDecimal;

public class Caminhao extends Veiculo {
    @Override
    public Double getValorDiaria() {
        return 200.0;
    }
}
