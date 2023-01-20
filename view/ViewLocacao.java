package view;

import controller.LocadoraController;
import util.ConsoleUIHelper;

public class ViewLocacao {


    private static LocadoraController locadoraController = new LocadoraController();

    public static void printMenuCliente() {
        System.out.println("Bem-vindo a Locação de Veiculo");

        boolean continuar = true;

        while (continuar) {
            continuar = locadoraController.locadoraOpcao(optionMenuLocadora());
        }
    }

    private static int optionMenuLocadora() {
        int option = ConsoleUIHelper.askChooseOption("O que deseja fazer: ",
                "Locar um Veiculo;",
                "Devolver Um veiculo;",
                "Voltar"
        );

        return option;
    }
}
