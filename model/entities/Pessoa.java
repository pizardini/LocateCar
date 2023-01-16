package model.entities;

import model.Endereco;
import model.Telefone;

import java.util.List;

public abstract class Pessoa {
    private String name;
    private String telefone;
    private String endereco;

    public Pessoa(String name, String telefone, String endereco){
        this.name = name;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getName() {
        return name;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

}