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
        Boolean repetir = true;
        String name = null;
        String telefone = null;
        String endereco = null;
        String cpf = null;


        while(repetir) {
            name = ConsoleUIHelper.askNoEmptyInput("Digite o nome:", 3);
            if(!name.isEmpty() || !name.isBlank()){
                name = name.toUpperCase();
                repetir = false;
            }else {
                System.out.println("O campo esta em branco digite novamente!");
            }
        }
        repetir = true;
        while(repetir) {
            telefone = ConsoleUIHelper.askNoEmptyInput("Digite o telefone:", 3);
            if(telefone.isBlank() || telefone.isEmpty()){
                System.out.println("O campo esta em branco digite novamente!");
            }else if(telefone.length() < 7){
                System.out.println("O tamanho do telefone esta incorreto colocar tamanho minimo é 8");
            }else{
                repetir = false;
            }
        }

        repetir = true;
        while(repetir) {
            endereco = ConsoleUIHelper.askNoEmptyInput("Digite o endereco:", 3);
            if(!endereco.isEmpty() || !endereco.isBlank()){
                endereco = endereco.toUpperCase();
                repetir = false;
            }else {
                System.out.println("O campo esta em branco digite novamente!");
            }

        }

        repetir = true;
        while(repetir) {
            cpf = ConsoleUIHelper.askNoEmptyInput("Digite o CPF (digite apenas numeros)", 3);
            if(cpf.isBlank() || cpf.isEmpty()){
                System.out.println("O campo esta em branco digite novamente!");
            }else if(!(cpf.length() == 11)){
                System.out.println("Colocar apenas numeros (tamanho é 11)!");
            }else{
                repetir = false;
            }
        }

        PessoaFisica pessoaFisica = new PessoaFisica(name, telefone, endereco, cpf);
        return pessoaFisica;

    }

    public static Pessoa dadosPessoaJuridica(){
        Boolean repetir = true;
        String name = null;
        String telefone = null;
        String endereco = null;
        String cnpj = null;


        while(repetir) {
            name = ConsoleUIHelper.askNoEmptyInput("Digite o nome da Empresa", 3);
            if(!name.isEmpty() || !name.isBlank()){
                repetir = false;
            }else {
                System.out.println("O campo esta em branco digite novamente!");
            }
        }
        repetir = true;
        while(repetir) {
            telefone = ConsoleUIHelper.askNoEmptyInput("Digite o telefone da Empresa", 3);
            if(telefone.isBlank() || telefone.isEmpty()){
                System.out.println("O campo esta em branco digite novamente!");
            }else if(telefone.length() < 7){
                System.out.println("O tamanho do telefone esta incorreto colocar tamanho minimo é 8");
            }else{
                repetir = false;
            }
        }

        repetir = true;
        while(repetir) {
            endereco = ConsoleUIHelper.askNoEmptyInput("Digite o endereco da Empresa", 3);
            if(!endereco.isEmpty() || !endereco.isBlank()){
                repetir = false;
            }else {
                System.out.println("O campo esta em branco digite novamente!");
            }
        }

        repetir = true;
        while(repetir) {
            cnpj = ConsoleUIHelper.askNoEmptyInput("Digite o cnpj (digite apenas numeros)", 3);
            if(cnpj.isBlank() || cnpj.isEmpty()){
                System.out.println("O campo esta em branco digite novamente!");
            }else if(!(cnpj.length() == 14)){
                System.out.println("Colocar apenas numeros (tamanho é 14)!");
            }else{
                repetir = false;
            }
        }


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

                System.out.println("# : Nome: " + p.getName() + " --- " +
                        "CPF: " + ((PessoaFisica)p).getCpf() + " --- " + "Telefone: " + p.getTelefone());
            }

        }

        System.out.println("##############################################");
        System.out.println();
        System.out.println("Clientes  -> Pessoa Juridica");

        for (Pessoa p: clientes) {

            if(p.getTipoPessoa().equals("PessoaJuridica")) {

                System.out.println("# : Nome: " + p.getName() + " --- " +
                        "CNPJ: " + ((PessoaJuridica)p).getCnpj() + " --- " + "Telefone: " + p.getTelefone());
            }

        }

        System.out.println("##############################################");
        System.out.println();

    }

    public int tipoDeClienteBusca(){
        System.out.println("Que tipo de Cliente você esta Buscando");
        int opcao = tipoCliente();
        return opcao;
    }

    public String buscaPessoa(int option){

        String documento = null;
        boolean repetir = true;
        String tipoDocumento = "CPF";
        int tamanhoDocumento = 11;


        if(option == 1){
            tipoDocumento = "CNPJ";
            tamanhoDocumento = 14;
        }


        while(repetir) {
            documento = ConsoleUIHelper.askNoEmptyInput("Digite o "+  tipoDocumento + " (digite apenas numeros)", 3);
            if(documento.isBlank() || documento.isEmpty()){
                System.out.println("O campo esta em branco digite novamente!");
            }else if(!(documento.length() == tamanhoDocumento)){
                System.out.println("Colocar apenas numeros (tamanho é "+  tamanhoDocumento + ")!");
            }else{
                repetir = false;
            }
        }

        return documento;

    }






}