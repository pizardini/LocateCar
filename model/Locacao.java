package model;

import model.entities.Pessoa;
import model.entities.Veiculo;

public class Locacao {

    private Pessoa pessoa;
    private Agencia agencia;
    private Agencia AgenciaDevolucao;
    private Veiculo veiculo;
    private String dataInicio;
    private String dataDevolucao;
    private Integer qtdoDias;
    private Double desconto;

    private Double valorDiaria;

    private Double valorTotalLocacao;

    public Agencia getAgenciaDevolucao() {
        return AgenciaDevolucao;
    }

    public void setAgenciaDevolucao(Agencia agenciaDevolucao) {
        AgenciaDevolucao = agenciaDevolucao;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Double getValorTotalLocacao() {
        return valorTotalLocacao;
    }

    public void setValorTotalLocacao(Double valorTotalLocacao) {
        this.valorTotalLocacao = valorTotalLocacao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Integer getQtdoDias() {
        return qtdoDias;
    }

    public void setQtdoDias(Integer qtdoDias) {
        this.qtdoDias = qtdoDias;
    }
}
