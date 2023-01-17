package model.veiculos;

import model.entities.Veiculo;

import java.math.BigDecimal;

public class Moto extends Veiculo {
    public Moto() {
    }

    public Moto(String fabricante, String modelo, String placa, String ano) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.alugado = false;
    }
    @Override
    public Double getValorDiaria() {
        return 100.0;
    }
}
