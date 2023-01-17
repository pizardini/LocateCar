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

    public abstract String getTipoPessoa();

    public String getName() {
        return name;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


}