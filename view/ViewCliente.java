package view;

import controller.ClienteController;
import model.entities.Pessoa;
import model.pessoas.PessoaFisica;
import model.pessoas.PessoaJuridica;
import util.ConsoleUIHelper;

import java.util.List;

public class ViewCliente {

    private static ClienteController clienteController = new ClienteController();

    public static void printMenuCliente() {
        System.out.println("Bem-vindo ao Cadastro de Cliente");

        boolean continuar = true;

        while (continuar) {
            continuar = clienteController.clienteOpcao(optionMenuCliente());
        }
    }

    public static int optionMenuCliente() {

        int option = ConsoleUIHelper.askChooseOption("Escolha a opção: ",
                "Cadastrar Cliente;",
                "Listar Clientes;",
                "Atualizar Cliente;",
                "Remover Cliente",
                "Buscar Cliente;",
                "Voltar"
        );

        return option;
    }

    public static int tipoCliente() {
        int option = ConsoleUIHelper.askChooseOption(
                "Selecione o tipo do Cliente?",
                "Pessoa Fisica",
                "Pessoa Juridica");
        return option;

    }


    public static Pessoa dadosPessoaFisica(){

        String name = ConsoleUIHelper.askNoEmptyInput("Digite o nome", 3);
        String telefone = ConsoleUIHelper.askNoEmptyInput("Digite o telefone", 3);
        String endereco = ConsoleUIHelper.askNoEmptyInput("Digite o endereco", 3);

        String cpf = ConsoleUIHelper.askNoEmptyInput("Digite o CPF", 3);

        Pessoa pessoaFisica = new PessoaFisica(name, telefone, endereco, cpf);

        return pessoaFisica;

    }

    public static Pessoa dadosPessoaJuridica(){

        String name = ConsoleUIHelper.askNoEmptyInput("Digite o nome da Empresa", 3);
        String telefone = ConsoleUIHelper.askNoEmptyInput("Digite o telefone da Empresa", 3);
        String endereco = ConsoleUIHelper.askNoEmptyInput("Digite o endereco da Empresa", 3);

        String cnpj = ConsoleUIHelper.askNoEmptyInput("Digite o cnpj", 3);

        Pessoa pessoaJuridica = new PessoaJuridica(name, telefone, endereco, cnpj);

        return pessoaJuridica;

    }

    public void mensagemGravar(){

        System.out.println("Cadastro realizado com sucesso!");
        System.out.println();
    }

    public void printClientes(List<Pessoa> clientes){

        System.out.println("Lista de Clientes Cadastrados");
        System.out.println();
        System.out.println("Clientes  -> Pessoa Fisica");

        for (Pessoa p: clientes) {

            if(p.getTipoPessoa().equals("PessoaFisica")) {

                ConsoleUIHelper.drawWithPadding(p.getName() + " --- " +
                        ((PessoaFisica)p).getCpf() + " --- " + p.getTelefone(), 250);
            }

        }

        System.out.println("##############################################");
        System.out.println();
        System.out.println("Clientes  -> Pessoa Juridica");

        for (Pessoa p: clientes) {

            if(p.getTipoPessoa().equals("PessoaJuridica")) {

                ConsoleUIHelper.drawWithPadding(p.getName() + " --- " +
                        ((PessoaJuridica)p).getCnpj() + " --- " + p.getTelefone(), 250);
            }

        }

        System.out.println("##############################################");
        System.out.println();

    }



}