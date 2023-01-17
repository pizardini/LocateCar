package controller;

import model.Cliente;
import model.entities.Pessoa;

import java.util.List;

public class PessoaController {
    private static List<Cliente<Pessoa>> clientes;

    public void cadastraCliente(Cliente<Pessoa> cliente){
        this.clientes.add(cliente);
    }
    public void cadastraClientes(List<Cliente<Pessoa>> clientes){
        this.clientes.addAll(clientes);
    }
}
