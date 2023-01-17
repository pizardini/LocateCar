package view;

import model.Agencia;
import model.Endereco;
import model.Locadora;
import model.entities.Veiculo;
import model.veiculos.Caminhao;
import model.veiculos.Carro;
import model.veiculos.Moto;
import util.ConsoleUIHelper;

import java.util.List;

public class Menu {
    Locadora locadora = new Locadora();
    private static ViewCliente viewCliente = new ViewCliente();

    public void printMenu() {
        System.out.println("Bem-vindo a LocateCar");
        int value = optionMenu();

        switch (value){
//            case 0: cadastrarVeiculo(agencia);

            case 1: viewCliente.printMenuCliente();

            case 2: {
                Agencia agencia = new Agencia();
                agencia = cadastrarAgencia(agencia);
                //locadora.add(agencia); /não estou conseguindo fazer esse add funcionar
            }
        }
    }



    public int optionMenu() {
        int option = ConsoleUIHelper.askChooseOption(
                "O que deseja fazer?",
                "Cadastrar veículos",
                "Gerenciar Cliente",
                "Cadastrar agência ",
                "Alterar agência",
                "Buscar uma agência por parte do nome ou do logradouro do endereço",
                "Alugar veículo",
                "Devolver veículo",
                "Sair"
        );
        return option;
    }


    public int tipoVeiculo() {
        int option = ConsoleUIHelper.askChooseOption(
                "Qual tipo de veículo que deseja cadastrar?",
                "Carro",
                "Moto",
                "Caminhão");
        return option;
    }

    public void cadastrarVeiculo(Agencia agencia) {
        int tipo = tipoVeiculo();
        switch (tipo) {
            case 0 -> {
                Carro carro = new Carro();
                carro = adicionarCarro(carro);
                //adicionar na lista de veiculos da agencia
            }
            case 1 -> {
                Caminhao caminhao = new Caminhao();
                caminhao = adicionarCaminhao(caminhao);
                //adicionar na lista de veiculos da agencia
            }
            case 2 -> {
                Moto moto = new Moto();
                moto = adicionarMoto(moto);
                //adicionar na lista de veiculos da agencia
            }
        }
    }

    public Agencia cadastrarAgencia(Agencia agencia) {
        String nome = ConsoleUIHelper.askNoEmptyInput("Digite o nome da agência", 3);
        Endereco endereco = adicionarEndereco();
        agencia = new Agencia(nome, endereco);
        return agencia;
    }

    public Endereco adicionarEndereco() {
        String logradouro = ConsoleUIHelper.askSimpleInput("Digite o logradouro: ");
        String numero = ConsoleUIHelper.askSimpleInput("Digite o número da edificação: ");
        String cidade = ConsoleUIHelper.askSimpleInput("Digite a cidade: ");
        String estado = ConsoleUIHelper.askSimpleInput("Digite o estado: ");
        String cep = ConsoleUIHelper.askSimpleInput("Digite o CEP: ");
        Endereco endereco = new Endereco(cep, logradouro, numero, cidade, estado);
        return endereco;
    }

    public Carro adicionarCarro(Carro carro) {
        String fabricante = ConsoleUIHelper.askNoEmptyInput("Digite a marca do veículo", 3);
        String modelo = ConsoleUIHelper.askNoEmptyInput("Digite o modelo do veículo", 3);
        String placa = ConsoleUIHelper.askNoEmptyInput("Digite a placa do veículo", 3);
        String ano = ConsoleUIHelper.askNoEmptyInput("Digite o ano do veículo", 3);
        carro = new Carro(fabricante, modelo, placa, ano);
        return carro;
    }

    public Caminhao adicionarCaminhao(Caminhao caminhao) {
        String fabricante = ConsoleUIHelper.askNoEmptyInput("Digite a marca do veículo", 3);
        String modelo = ConsoleUIHelper.askNoEmptyInput("Digite o modelo do veículo", 3);
        String placa = ConsoleUIHelper.askNoEmptyInput("Digite a placa do veículo", 3);
        String ano = ConsoleUIHelper.askNoEmptyInput("Digite o ano do veículo", 3);
        caminhao = new Caminhao(fabricante, modelo, placa, ano);
        return caminhao;
    }

    public Moto adicionarMoto(Moto moto) {
        String fabricante = ConsoleUIHelper.askNoEmptyInput("Digite a marca do veículo", 3);
        String modelo = ConsoleUIHelper.askNoEmptyInput("Digite o modelo do veículo", 3);
        String placa = ConsoleUIHelper.askNoEmptyInput("Digite a placa do veículo", 3);
        String ano = ConsoleUIHelper.askNoEmptyInput("Digite o ano do veículo", 3);
        moto = new Moto(fabricante, modelo, placa, ano);
        return moto;
    }



}


