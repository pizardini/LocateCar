package view;

import model.Agencia;
import model.Locadora;
import util.ConsoleUIHelper;


public class Menu {

    private static ViewCliente viewCliente = new ViewCliente();
    private static ViewVeiculo viewVeiculo = new ViewVeiculo();
    private static ViewLocacao viewLocacao = new ViewLocacao();

    public static void printMenuPrincipal() {
        System.out.println("Bem-vindo a LocateCar");
        int value = optionMenuPrincipal();

        switch (value) {
            case 0 -> viewVeiculo.printMenuVeiculo();

            case 1 -> viewCliente.printMenuCliente();

            case 2 -> ViewAgencia.printMenuAgencia();

            case 3 -> viewLocacao.printMenuLocacao();

            case 4 -> {
                if (ConsoleUIHelper.askConfirm("Tem certeza que deseja sair?","Sim", "Não")) {
                    System.exit(0);
                };
            }
        }
    }


    public static int optionMenuPrincipal() {
        int option = ConsoleUIHelper.askChooseOption(
                "O que deseja fazer?",
                "Gerenciar veículos",
                "Gerenciar Cliente",
                "Gerenciar agência",
                "Locadora (Locar/Devover)",
                "Sair"
        );
        return option;
    }
}


