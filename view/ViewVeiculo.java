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
                "Carro",
                "Moto",
                "Caminhão");
        return option;
    }

    public static void cadastrarVeiculo(Agencia agencia) {
        int tipo = tipoVeiculo();
        switch (tipo) {
            case 0 -> {
                carro = adicionarCarro(carro);
                //adicionar na lista de veiculos da agencia
            }
            case 1 -> {

                caminhao = adicionarCaminhao(caminhao);
                //adicionar na lista de veiculos da agencia
            }
            case 2 -> {

                moto = adicionarMoto(moto);
                //adicionar na lista de veiculos da agencia
            }
        }
    }

    public static Agencia cadastrarAgencia(Agencia agencia) {
        String nome = ConsoleUIHelper.askNoEmptyInput("Digite o nome da agência", 3);
        Endereco endereco = adicionarEndereco();
        agencia = new Agencia(nome, endereco);
        return agencia;
    }

    public static Endereco adicionarEndereco() {
        String logradouro = ConsoleUIHelper.askSimpleInput("Digite o logradouro: ");
        String numero = ConsoleUIHelper.askSimpleInput("Digite o número da edificação: ");
        String cidade = ConsoleUIHelper.askSimpleInput("Digite a cidade: ");
        String estado = ConsoleUIHelper.askSimpleInput("Digite o estado: ");
        String cep = ConsoleUIHelper.askSimpleInput("Digite o CEP: ");
        Endereco endereco = new Endereco(cep, logradouro, numero, cidade, estado);
        return endereco;
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
        caminhao = new Caminhao(fabricante, modelo, placa, ano);
        return caminhao;
    }

    public static Moto adicionarMoto(Moto moto) {
        String fabricante = ConsoleUIHelper.askNoEmptyInput("Digite a marca do veículo", 3);
        String modelo = ConsoleUIHelper.askNoEmptyInput("Digite o modelo do veículo", 3);
        String placa = ConsoleUIHelper.askNoEmptyInput("Digite a placa do veículo", 3);
        String ano = ConsoleUIHelper.askNoEmptyInput("Digite o ano do veículo", 3);
        moto = new Moto(fabricante, modelo, placa, ano);
        return moto;
    }

}
