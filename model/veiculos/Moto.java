package model.veiculos;

import model.entities.Veiculo;

import java.math.BigDecimal;

public class Moto extends Veiculo {
    public Moto() {
    }


    public Moto(String fabricante, String modelo, String placa, String ano, String numeroAgencia) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.numeroAgencia = numeroAgencia;
        this.alugado = false;
    }
    @Override
    public Double getValorDiaria() {
        return 100.0;
    }

    public String getTipoVeiculo() {
        return "Caminhao";
    }

    @Override
    public String toString() {
        return "Moto{" +
                "fabricante='" + fabricante + '\'' +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }
}
