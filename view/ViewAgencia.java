package view;

import controller.AgenciaController;
import model.Agencia;
import model.Endereco;
import util.ConsoleUIHelper;

import java.util.List;

public class ViewAgencia {

    private static AgenciaController agenciaController = new AgenciaController();

    public static void printMenuAgencia() {
        System.out.println("Bem-vindo ao cadastro de agências");

        boolean continuar = true;

        while(continuar) {
            continuar = agenciaController.agenciaOpcao(optionMenuAgencia());
        }
    }

    public static int optionMenuAgencia() {
        int option = ConsoleUIHelper.askChooseOption(
                "O que deseja fazer?",
                "Cadastrar agência",
                "Listar agências",
                "Editar agência",
                "Remover agência",
                "Buscar agência",
                "Sair"
        );
        return option;
    }

    public static Agencia dadosAgencia() {
        String nome = ConsoleUIHelper.askNoEmptyInput("Digite o nome da agência", 3);
        Endereco endereco = adicionarEndereco();

        Agencia agencia = new Agencia(nome, endereco);

        return agencia;
    }

    public static Endereco adicionarEndereco() {
        String logradouro = ConsoleUIHelper.askNoEmptyInput("Digite o logradouro: ", 3);
        String numero = ConsoleUIHelper.askNoEmptyInput("Digite o número da edificação: ", 3);
        String cidade = ConsoleUIHelper.askNoEmptyInput("Digite a cidade: ", 3);
        String estado = ConsoleUIHelper.askNoEmptyInput("Digite o estado: ", 3);
        String cep = ConsoleUIHelper.askNoEmptyInput("Digite o CEP: ", 3);
        Endereco endereco = new Endereco(cep, logradouro, numero, cidade, estado);
        return endereco;
    }

    public void mensagemGravar(){

        System.out.println("Cadastro realizado com sucesso!");
        System.out.println();
    }

    public static void printAgencias(List<Agencia> agencias) {
        System.out.println("Lista de Agências cadastradas");
        System.out.println();

        for (Agencia a: agencias) {
            System.out.println("# : Nome: " + a.getNome() + " --- " +"Endereço: " + a.getEndereco());
        }
    }
    public static void buscarAgencia() {
        String nome = ConsoleUIHelper.askSimpleInput("Digite o nome da agência");
        AgenciaController.buscar(nome);
    }
}
