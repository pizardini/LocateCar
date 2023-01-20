package model.veiculos;

import model.entities.Veiculo;

import java.math.BigDecimal;

public class Carro extends Veiculo {
    public Carro() {
    }

    public Carro(String fabricante, String modelo, String placa, String ano, String numeroAgencia) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.numeroAgencia = numeroAgencia;
        this.alugado = false;
    }

    @Override
    public Double getValorDiaria() {
        return 150.0 ;
    }

    public String getTipoVeiculo() {
        return "Carro";
    }

    @Override
    public String toString() {
        return "Carro{" +
                "fabricante='" + fabricante + '\'' +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }
}
