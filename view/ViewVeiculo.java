package view;

import model.Agencia;
import model.Endereco;
import model.entities.Veiculo;
import model.veiculos.Caminhao;
import model.veiculos.Carro;
import model.veiculos.Moto;
import util.ConsoleUIHelper;
import util.RNHelperVeiculo;


public class ViewVeiculo {
    static Veiculo moto = new Moto();
    static Veiculo carro = new Carro();
    static Veiculo caminhao = new Caminhao();

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
                //moto = adicionarMoto(moto); como estava antes
                moto = adicionarVeiculo(moto);
                //adicionar na lista de veiculos da agencia
            }
            case 1 -> {
                //carro = adicionarCarro(carro); como estava antes
                carro = adicionarVeiculo(carro);
                //adicionar na lista de veiculos da agencia

            }
            case 2 -> {
                //caminhao = adicionarCaminhao(caminhao); como estava antes
                caminhao = adicionarVeiculo(caminhao);
                //adicionar na lista de veiculos da agencia
            }
        }
    }


    public static Veiculo adicionarVeiculo(Veiculo veiculo) {
        boolean flag = false;
        String fabricante ="", modelo="", placa="", ano="";
        while (!flag){

            fabricante = ConsoleUIHelper.askNoEmptyInput("Digite o fabricante do veículo", 3).toUpperCase();
            if (!RNHelperVeiculo.trataFabricante(fabricante)){
                System.out.println(fabricante + " Não é um nome válido como um fabricante, digite novamente.");
                continue;
            }
            modelo = ConsoleUIHelper.askNoEmptyInput("Digite o modelo do veículo", 3).toUpperCase();
            if (!RNHelperVeiculo.trataModelo(modelo)){
                System.out.println(modelo + " Não é um nome válido para modelo, digite novamente.");
                continue;
            }

            placa = ConsoleUIHelper.askNoEmptyInput("Digite a placa do veículo", 3).toUpperCase();
            if (!RNHelperVeiculo.trataPlaca(placa)){
                System.out.println(placa + " Não é um valor válido para uma placa de veiculo, digite novamente.");
                continue;
            }
            ano = ConsoleUIHelper.askNoEmptyInput("Digite o ano do veículo", 3);
            if (!RNHelperVeiculo.trataAno(ano)){
                System.out.println(ano + " Não é um ano válido, digite novamente.");

            }
            flag = true;
        }
        //carro = new Carro(fabricante, modelo, placa, ano);
        veiculo.setFabricante(fabricante);
        veiculo.setModelo(modelo);
        veiculo.setPlaca(placa);
        veiculo.setAno(ano);
        System.out.println(veiculo);
        return  veiculo;
    }

    //como estava antes \/
    /*public static Carro adicionarCarro(Carro carro) {
        boolean flag = false;
        String fabricante ="", modelo="", placa="", ano="";
        while (!flag){

            fabricante = ConsoleUIHelper.askNoEmptyInput("Digite o fabricante do veículo", 3).toUpperCase();
            if (!RNHelperVeiculo.trataFabricante(fabricante)){
                System.out.println(fabricante + " Não é um nome válido como um fabricante, digite novamente.");
                continue;
            }
            modelo = ConsoleUIHelper.askNoEmptyInput("Digite o modelo do veículo", 3).toUpperCase();
            if (!RNHelperVeiculo.trataModelo(modelo)){
                System.out.println(modelo + " Não é um nome válido para modelo, digite novamente.");
                continue;
            }

            placa = ConsoleUIHelper.askNoEmptyInput("Digite a placa do veículo", 3).toUpperCase();
            if (!RNHelperVeiculo.trataPlaca(placa)){
                System.out.println(placa + " Não é um valor válido para uma placa de veiculo, digite novamente.");
                continue;
            }
            ano = ConsoleUIHelper.askNoEmptyInput("Digite o ano do veículo", 3);
            if (!RNHelperVeiculo.trataAno(ano)){
                System.out.println(ano + " Não é um ano válido, digite novamente.");

            }
            flag = true;
        }
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
    }*/

}
