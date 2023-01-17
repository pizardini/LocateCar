package view;

import controller.ClienteController;
import model.entities.Pessoa;
import util.ConsoleUIHelper;

public class ViewCliente {
    private static ClienteController clienteController = new ClienteController();
    public static void printMenuCliente() {
        System.out.println("Bem-vindo ao Cadastro de Cliente");

        boolean continuar = true;

        while(continuar) {
            int value = optionMenuCliente();
            continuar = clienteController.menuInicial(value);
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

    public void menuCadastro(){

    }


}
