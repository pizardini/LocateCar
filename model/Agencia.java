package model;

import model.entities.Veiculo;
import model.veiculos.Caminhao;
import model.veiculos.Carro;
import model.veiculos.Moto;

import java.util.List;
import java.util.Objects;

public class Agencia {
    private String nome;
    private Endereco endereco;
    private List<Veiculo> veiculos;

    public Agencia(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agencia agencia = (Agencia) o;
        return Objects.equals(nome, agencia.nome) && Objects.equals(endereco, agencia.endereco) && Objects.equals(veiculos, agencia.veiculos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, endereco, veiculos);
    }

    @Override
    public String toString() {
        return (
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", veiculos=" + veiculos
        );
    }
}
