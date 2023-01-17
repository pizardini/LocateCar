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

    }
    public List<Pessoa> listarClientes(){
        return null;
    }
}
