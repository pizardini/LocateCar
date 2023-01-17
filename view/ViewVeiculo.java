package view;

import model.Agencia;
import model.Endereco;
import model.veiculos.Caminhao;
import model.veiculos.Carro;
import model.veiculos.Moto;
import util.ConsoleUIHelper;


public class ViewVeiculo {
    static Moto moto = new Moto();
    static Carro carro = new Carro();
    static Caminhao caminhao = new Caminhao();
    public static int optionMenu() {
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


    public static int tipoVeiculo() {
        int option = ConsoleUIHelper.askChooseOption(
                "Qual tipo de veículo que deseja cadastrar?",
                "Moto",
                "Carro",
                "Caminhão");
        return option;
    }

    public static void cadastrarVeiculo(Agencia agencia) {
        int tipo = tipoVeiculo();
        switch (tipo) {
            case 0 -> {
                moto = adicionarMoto(moto);
                //adicionar na lista de veiculos da agencia
            }
            case 1 -> {
                carro = adicionarCarro(carro);
                //adicionar na lista de veiculos da agencia

            }
            case 2 -> {
                caminhao = adicionarCaminhao(caminhao);
                //adicionar na lista de veiculos da agencia
            }
        }
    }





    public static Carro adicionarCarro(Carro carro) {
        String fabricante = ConsoleUIHelper.askNoEmptyInput("Digite a marca do veículo", 3);
        String modelo = ConsoleUIHelper.askNoEmptyInput("Digite o modelo do veículo", 3);
        String placa = ConsoleUIHelper.askNoEmptyInput("Digite a placa do veículo", 3);
        String ano = ConsoleUIHelper.askNoEmptyInput("Digite o ano do veículo", 3);
        //carro = new Carro(fabricante, modelo, placa, ano);
        carro.setFabricante(fabricante);
        carro.setModelo(modelo);
        carro.setPlaca(placa);
        carro.setAno(ano);
        System.out.println(carro);
        return  carro;
    }

    public static Caminhao adicionarCaminhao(Caminhao caminhao) {
        String fabricante = ConsoleUIHelper.askNoEmptyInput("Digite a marca do veículo", 3);
        String modelo = ConsoleUIHelper.askNoEmptyInput("Digite o modelo do veículo", 3);
        String placa = ConsoleUIHelper.askNoEmptyInput("Digite a placa do veículo", 3);
        String ano = ConsoleUIHelper.askNoEmptyInput("Digite o ano do veículo", 3);
       // caminhao = new Caminhao(fabricante, modelo, placa, ano);
        caminhao.setFabricante(fabricante);
        caminhao.setModelo(modelo);
        caminhao.setPlaca(placa);
        caminhao.setAno(ano);
        System.out.println(caminhao);
        return caminhao;
    }

    public static Moto adicionarMoto(Moto moto) {
        String fabricante = ConsoleUIHelper.askNoEmptyInput("Digite a marca do veículo", 3);
        String modelo = ConsoleUIHelper.askNoEmptyInput("Digite o modelo do veículo", 3);
        String placa = ConsoleUIHelper.askNoEmptyInput("Digite a placa do veículo", 3);
        String ano = ConsoleUIHelper.askNoEmptyInput("Digite o ano do veículo", 3);
        //moto = new Moto(fabricante, modelo, placa, ano);
        moto.setFabricante(fabricante);
        moto.setModelo(modelo);
        moto.setPlaca(placa);
        moto.setAno(ano);
        System.out.println(moto);
        return moto;
    }

}
