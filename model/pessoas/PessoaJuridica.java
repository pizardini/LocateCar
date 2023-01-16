package model.pessoas;

import model.entities.Pessoa;

import java.util.Objects;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String name, String telefone, String endereco, String cnpj) {
        super(name, telefone, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaJuridica that = (PessoaJuridica) o;
        return Objects.equals(cnpj, that.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnpj);
    }
}
