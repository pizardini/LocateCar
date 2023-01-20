package controller;

import model.entities.Pessoa;
import repository.ClienteRepository;

import java.util.List;

public class PessoaController {
    static ClienteRepository clienteRepository;

    public PessoaController(){

        clienteRepository = new ClienteRepository();
    }

    public void cadastraCliente(Pessoa cliente){

        clienteRepository.adicionarPessoa(cliente);

    }
    public List<Pessoa> listarClientes(){

        return clienteRepository.listarPessoas();
    }

    public Pessoa listarPessoaById(int id) {

        return clienteRepository.listarPessoaById(id);

    }


    public void alterarCliente(int index, Pessoa pessoa){

        clienteRepository.alterarPessoa(index, pessoa);
    }

}