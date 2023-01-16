package view;

import util.ConsoleUIHelper;

public class ViewCliente {

    public static void printMenuCliente() {
        System.out.println("Bem-vindo ao Cadastro de Cliente");
        boolean continuar = true;

        while(continuar) {
            int value = optionMenuCliente();
            switch (value) {
                case 0 -> {
                    System.out.println("adicionar Cliente");
                }
                case 5 -> continuar = false;
            }
        }
    }

    private static int optionMenuCliente() {

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


}
