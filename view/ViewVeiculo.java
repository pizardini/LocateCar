package view;

import controller.VeiculoController;
import model.Agencia;
import model.entities.Veiculo;
import model.veiculos.Caminhao;
import model.veiculos.Carro;
import model.veiculos.Moto;
import repository.VeiculoRepository;
import util.ConsoleUIHelper;

import java.util.ArrayList;
import java.util.List;


public class ViewVeiculo {

        private static VeiculoController veiculoController = new VeiculoController();
        static VeiculoRepository veiculoRepository = new VeiculoRepository();
        private static Agencia agencia = new Agencia();
        private static List<Veiculo> veiculos = new ArrayList<>();

        public static void printMenuVeiculo() {
            System.out.println("Bem-vindo ao Cadastro de Cliente");

            boolean continuar = true;

            while (continuar) {
                continuar = veiculoController.veiculoOpcao(optionMenuVeiculo());
            }
        }
        public static int optionMenuVeiculo() {
            int option = ConsoleUIHelper.askChooseOption(
                    "O que deseja fazer?",
                    "Cadastrar Veículo",
                    "Alterar um veículo cadastrado",
                    "Buscar um veículo por parte da placa",
                    "Listar Veículos",
                    "Menu Principal",
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


    public static Veiculo dadosVeiculo() {
        int tipo = tipoVeiculo();
        Veiculo veiculo;

        String fabricante = ConsoleUIHelper.askNoEmptyInput("Digite a marca do veículo", 3).toUpperCase();
        String modelo = ConsoleUIHelper.askNoEmptyInput("Digite o modelo do veículo", 3).toUpperCase();
        String placa = ConsoleUIHelper.askNoEmptyInput("Digite a placa do veículo", 3).toUpperCase();
        String ano = ConsoleUIHelper.askNoEmptyInput("Digite o ano do veículo", 3).toUpperCase();
        String numeroAgencia = ConsoleUIHelper.askNoEmptyInput("Digite o número da agência que deseja cadastrar esse veículo", 3).toUpperCase();
        switch (tipo) {
            case 0 -> {
                veiculo = new Moto(fabricante, modelo, placa, ano, numeroAgencia);


                //adicionar na lista de veiculos da agencia
            }
            case 1 -> {
                veiculo = new Carro(fabricante, modelo, placa, ano, numeroAgencia);
                //adicionar na lista de veiculos da agencia

            }
            case 2 -> {
                veiculo = new Caminhao(fabricante, modelo, placa, ano, numeroAgencia);
                //adicionar na lista de veiculos da agencia
            }
            default -> throw new IllegalStateException("Unexpected value: " + tipo);
        }


        return veiculo;
    }


    public static void listarTudo(List<Veiculo> veiculos) {
        System.out.println("Veículos cadastrados: ");
        int i = 0;
        for (Veiculo veiculo : veiculos) {
            System.out.println(" Identificador: " + i + " Fabricante: " + veiculo.getFabricante() + " Modelo: " + veiculo.getModelo() + " Placa: " + veiculo.getPlaca() + " Ano: " + veiculo.getAno() + " Número da Agência: " + veiculo.getNumeroAgencia());
            i++;
        }
        System.out.println();
    }



    



    }



