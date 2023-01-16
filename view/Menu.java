package view;

import model.entities.Veiculo;
import model.veiculos.Carro;
import util.ConsoleUIHelper;

public class Menu {
    public static void printMenu() {
        System.out.println("Bem-vindo a LocateCar");
        int value = optionMenu();

        switch (value){
            case 0 -> {
                System.out.println("adicionar carro");
            }
        }
    }



    public static int optionMenu() {
        int option = ConsoleUIHelper.askChooseOption(
                "O que deseja fazer?",
                "Cadastrar veículos",
                "Buscar um veículo por parte do nome",
                "Cadastrar a agência onde o veículo será alugado/devolvido",
                "Alterar a agência onde o veículo será alugado/devolvido",
                "Buscar uma agência por parte do nome ou do logradouro do endereço",
                "Cadastrar o cliente (pessoa fisica/juridica)",
                "Alterar o cliente (pessoa fisica/juridica)",
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


