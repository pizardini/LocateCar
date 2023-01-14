package view;

import util.ConsoleUIHelper;

public class Menu {
    public static void printMenu() {
        System.out.println("Bem-vindo a LocateCar");
        int value = optionMenu();

        if (value ==0){
            System.out.println("comprado");
        }
    }



    public static int optionMenu() {
        int option = ConsoleUIHelper.askChooseOption(
                "O que deseja fazer?",
                "Cadastrar os veículos",
                "Buscar um veículo por parte do nome",
                "Cadastrar a agência onde o veículo será alugado/devolvido",
                "Alterar a agência onde o veículo será alugado/devolvido",
                "Buscar uma agência por parte do nome ou do logradouro do endereço",
                "Cadastrar o cliente (pessoa fisica/juridica)",
                "Alterar o cliente (pessoa fisica/juridica)",
                "Alugar um veículo para pessoa fisica",
                "Alugar um veículo para pessoa juridica",
                "Devolver um veículo para pessoa fisica",
                "Devolver um veículo para pessoa juridica",
                "Gerar um comprovante com todos os dados do aluguel (aberto para o grupo decidir o que vai ser demonstrado)",
                "Gerar um comprovante com todos os dados da devolução (aberto para o grupo decidir o que vai ser demonstrado)"
        );
        return option;
    }
}
