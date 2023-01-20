package repository;


import model.entities.Pessoa;


import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {

    private List<Pessoa> pessoas;


    public ClienteRepository(){
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public List<Pessoa> listarPessoas(){
        return pessoas;
    }

    public void removerPessoa(Pessoa pessoa){
        pessoas.remove(pessoa);
    }


    public Pessoa listarPessoaById(int id) {

        return pessoas.get(id);
    }


    public void alterarPessoa(int id, Pessoa pessoa){
        pessoas.set(id, pessoa);
    }
}
