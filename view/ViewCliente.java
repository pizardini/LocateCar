package view;

import controller.PessoaController;
import model.entities.Pessoa;
import model.pessoas.PessoaFisica;
import model.pessoas.PessoaJuridica;
import util.ConsoleUIHelper;

public class ViewCliente {

    private static PessoaController pessoaController = new PessoaController();

    public static void printMenuCliente() {
        System.out.println("Bem-vindo ao Cadastro de Cliente");

        boolean continuar = true;

        while (continuar) {
            int value = optionMenuCliente();

            switch (value) {
                case 0 -> menuCadastroCliente();
                case 1 -> System.out.println("Listar Clientes");
                case 2 -> System.out.println("Atualizar Cliente");
                case 3 -> System.out.println("Remover Cliente");
                case 4 -> System.out.println("Buscar Clientes");
                case 5 -> continuar = false;
            }

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

    public static void menuCadastroCliente() {

        int option = tipoCliente();
        switch (option) {
            case 0 -> cadastroPessoaFisica();
            case 1 -> cadastroPessoaJuridica();
        }

    }

    private static void cadastroPessoaFisica(){

        String name = ConsoleUIHelper.askNoEmptyInput("Digite o nome", 3);
        String telefone = ConsoleUIHelper.askNoEmptyInput("Digite o telefone", 3);
        String endereco = ConsoleUIHelper.askNoEmptyInput("Digite o endereco", 3);

        String cpf = ConsoleUIHelper.askNoEmptyInput("Digite o CPF", 3);

        Pessoa pessoaFisica = new PessoaFisica(name, telefone, endereco, cpf);

        pessoaController.cadastraCliente(pessoaFisica);

    }

    private static void cadastroPessoaJuridica(){

        String name = ConsoleUIHelper.askNoEmptyInput("Digite o nome da Empresa", 3);
        String telefone = ConsoleUIHelper.askNoEmptyInput("Digite o telefone da Empresa", 3);
        String endereco = ConsoleUIHelper.askNoEmptyInput("Digite o endereco da Empresa", 3);

        String cnpj = ConsoleUIHelper.askNoEmptyInput("Digite o cnpj", 3);

        Pessoa pessoaJuridica = new PessoaJuridica(name, telefone, endereco, cnpj);

        pessoaController.cadastraCliente(pessoaJuridica);

    }



}