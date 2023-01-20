package model.veiculos;

import model.entities.Veiculo;

import java.math.BigDecimal;

public class Caminhao extends Veiculo {
    public Caminhao() {
    }

    public Caminhao(String fabricante, String modelo, String placa, String ano, String numeroAgencia) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.numeroAgencia = numeroAgencia;
        this.alugado = false;
    }
    @Override
    public Double getValorDiaria() {
        return 200.0;
    }

    @Override
    public String getTipoVeiculo() {
        return "Caminhao";
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "fabricante='" + fabricante + '\'' +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }


}
