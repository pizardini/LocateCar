package controller;

import model.entities.Pessoa;

import java.util.List;

public class PessoaController {
    protected List<Pessoa> clientes;

    public void cadastraCliente(Pessoa cliente){
        this.clientes.add(cliente);
    }
    public void cadastraClientes(List<Pessoa> clientes){
        this.clientes.addAll(clientes);
    }
}
