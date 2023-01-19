package model;

import model.entities.Veiculo;
import model.veiculos.Caminhao;
import model.veiculos.Carro;
import model.veiculos.Moto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Agencia {
    private String nome;
    private Endereco endereco;

    private int numeroAgencia;
    private List<Veiculo> veiculos = new ArrayList<>();

    public Agencia(int numeroAgencia,  String nome, Endereco endereco){
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.endereco = endereco;
    }

    public Agencia() {
        this.veiculos = new ArrayList<>();
    }
    public Agencia(String nome, Veiculo veiculo) {
        this.nome = nome;
        this.veiculos.add(veiculo);
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
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

    public void addVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
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
