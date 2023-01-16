package view;

import model.entities.Veiculo;
import model.veiculos.Carro;
import util.ConsoleUIHelper;

public class Menu {

    private static ViewCliente viewCliente = new ViewCliente();

    public static void printMenu() {
        System.out.println("Bem-vindo a LocateCar");
        int value = optionMenu();

        switch (value){
            case 0 -> {
                System.out.println("adicionar carro");
            }
            case 1 -> viewCliente.printMenuCliente();
        }
    }



    public static int optionMenu() {
        int option = ConsoleUIHelper.askChooseOption(
                "O que deseja fazer?",
                "Cadastrar veículos",
                "Gerenciar Cliente",
                "Cadastrar a agência onde o veículo será alugado/devolvido",
                "Alterar a agência onde o veículo será alugado/devolvido",
                "Buscar uma agência por parte do nome ou do logradouro do endereço",
                "Alugar veículo",
                "Devolver veículo",
                "Sair"
        );
        return option;
    }


    public static int tipoVeiculo() {
        int option = ConsoleUIHelper.askChooseOption("Qual tipo de veículo que deseja cadastrar?","Carro","Moto","Caminhão");
        return option;
    }
    public Carro addCarro (Carro carro) {
        String fabricante = ConsoleUIHelper.askNoEmptyInput("Digite a marca do veículo", 3);
        String modelo = ConsoleUIHelper.askNoEmptyInput("Digite o modelo do veículo", 3);
        String placa = ConsoleUIHelper.askNoEmptyInput("Digite a placa do veículo", 3);
        String ano = ConsoleUIHelper.askNoEmptyInput("Digite o ano do veículo", 3);
        return carro;
    }
}


