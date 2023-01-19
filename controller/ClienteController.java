package controller;

import model.entities.Pessoa;
import view.ViewCliente;

import java.util.List;

public class ClienteController {

    private PessoaController pessoaController = new PessoaController();
    private ViewCliente viewCliente = new ViewCliente();

    public boolean clienteOpcao(int value){

        boolean continuar = true;
        switch (value) {
            case 0 -> cadastrarCliente();
            case 1 -> listarClientes();
            case 2 -> System.out.println("Atualizar Cliente");
            case 3 -> System.out.println("Buscar Clientes");
            case 4 -> continuar = false;
        }

        return continuar;

    }

    private void cadastrarCliente(){
        Pessoa pessoa;
        int option = viewCliente.tipoCliente();

        if(option == 0){
            pessoa =  viewCliente.dadosPessoaFisica();
        } else{
            pessoa =  viewCliente.dadosPessoaJuridica();
        }

        Boolean existe = verifcaExiste(pessoa);

        if(!existe) {
            pessoaController.cadastraCliente(pessoa);
            viewCliente.mensagemGravar();
        }else{
            System.out.println("===============================");
            System.out.println("!!!!CLIENTE JÁ CADASTRADO!!!!");
            System.out.println("===============================");
            System.out.println();
        }
    }


    private void listarClientes() {

        List<Pessoa> clientes = pessoaController.listarClientes();
        viewCliente.printClientes(clientes);

    }

    private Boolean verifcaExiste(Pessoa cliente){
        Boolean existe = false;
        List<Pessoa> clientes = pessoaController.listarClientes();
        for(Pessoa c : clientes){
            if(cliente.equals(c)){
                existe = true;
            }
        }
        return existe;
    }





    public Pessoa listarClienteById(int id){

        Pessoa cliente = pessoaController.listarPessoaById(id);

        return cliente;

    }


}
