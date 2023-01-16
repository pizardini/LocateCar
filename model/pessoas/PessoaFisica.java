package model.pessoas;

import model.entities.Pessoa;

import java.util.Objects;

public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String name, String telefone, String endereco, String cpf) {
        super(name, telefone, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }


    // Para não ter duplicação de cliente
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaFisica that = (PessoaFisica) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}
