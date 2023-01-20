package controller;

import model.entities.Pessoa;
import model.pessoas.PessoaFisica;
import model.pessoas.PessoaJuridica;
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
            case 2 -> buscarCliente();
            case 3 -> continuar = false;
        }

        return continuar;

    }

    private void buscarCliente() {
        int option = viewCliente.tipoDeClienteBusca();
        String busca = viewCliente.buscaPessoa(option);
        Pessoa pessoa = buscarLista(busca, option);

        if(pessoa != null){

            int index = pessoaController.indexPessoa(pessoa);
            viewCliente.exibirCliente(index, pessoa);


        }else{
            viewCliente.mensagemSemSucessoBusca();
        }

    }

    private Pessoa buscarLista(String documento, int option){
        List<Pessoa> pessoas = pessoaController.listarClientes();
        Pessoa pessoa = null;

        String tipoCliente = "PessoaFisica";

        if(option == 1){
            tipoCliente = "PessoaJuridica";
        }
        for (Pessoa p: pessoas) {
            if(option == 0){
                if(p.getTipoPessoa().equals(tipoCliente) && ((PessoaFisica)p).getCpf().equals(documento)){
                    pessoa = p;
                }
            }else {
                if(p.getTipoPessoa().equals(tipoCliente) && ((PessoaJuridica)p).getCnpj().equals(documento)){
                    pessoa = p;
                }
            }
        }

        return pessoa;
    }


    public Pessoa cadastrarCliente() {
        Pessoa pessoa;
        int option = viewCliente.tipoCliente();

        if (option == 0) {
            pessoa = viewCliente.dadosPessoaFisica();
        } else {
            pessoa = viewCliente.dadosPessoaJuridica();
        }

        Boolean existe = verifcaExiste(pessoa);

        if (!existe) {
            pessoaController.cadastraCliente(pessoa);
            viewCliente.mensagemGravar();
        } else {
            System.out.println("===============================");
            System.out.println("!!!!CLIENTE JÁ CADASTRADO!!!!");
            System.out.println("===============================");
            System.out.println();
        }

        return pessoa;

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


    public void alterarPessoa(int index, Pessoa pessoa) {
        Pessoa pessoaAlterada;
        if(pessoa.getTipoPessoa().equals("PessoaFisica")){
            pessoaAlterada = viewCliente.dadosPessoaFisica();

        }else{
            pessoaAlterada = viewCliente.dadosPessoaJuridica();
        }

        pessoaController.alterarCliente(index, pessoaAlterada);
    }

    public Pessoa buscarClienteParaLocacao() {

        int tipo = viewCliente.tipoDeClienteBusca();
        String documento = viewCliente.buscaPessoa(tipo);

        Pessoa pessoa = buscarLista(documento, tipo);
        if (pessoa == null){

            System.out.println();
            System.out.println("Cliente não Encontrado Cadastre o cliente:");
            System.out.println();
             pessoa = cadastrarCliente();
        }

        return pessoa;

    }
}

