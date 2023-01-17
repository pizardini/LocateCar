package model.veiculos;

import model.entities.Veiculo;

import java.math.BigDecimal;

public class Caminhao extends Veiculo {
    public Caminhao() {
    }

    public Caminhao(String fabricante, String modelo, String placa, String ano) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.alugado = false;
    }
    @Override
    public Double getValorDiaria() {
        return 200.0;
    }
}
