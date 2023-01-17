package view;

import util.ConsoleUIHelper;

public class ViewCliente {
    public static void printMenuCliente() {
        System.out.println("Bem-vindo ao Cadastro de Cliente");

        boolean continuar = true;

        while(continuar) {
            int value = optionMenuCliente();

            switch (value) {
                case 0 -> System.out.println("Listar Clientes");
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

    public void menuCadastro(){

    }


}
