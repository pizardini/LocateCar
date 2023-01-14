package model.entities;

import java.math.BigDecimal;

public abstract class Veiculo {

    public Veiculo() {
        this.valorDiaria = getValorDiaria();
    }

    protected String fabricante;

    protected String placa;

    protected String modelo;

    protected String ano;


    protected BigDecimal valorDiaria;

    protected Boolean alugado;


    public abstract BigDecimal getValorDiaria();


}