package view;

import controller.ClienteController;
import controller.VeiculoController;
import model.Agencia;
import model.Endereco;
import model.entities.Pessoa;
import model.entities.Veiculo;
import model.pessoas.PessoaFisica;
import model.pessoas.PessoaJuridica;
import model.veiculos.Caminhao;
import model.veiculos.Carro;
import model.veiculos.Moto;
import util.ConsoleUIHelper;
import util.RNHelperVeiculo;

import java.util.ArrayList;
import java.util.List;


public class ViewVeiculo {

        private static VeiculoController veiculoController = new VeiculoController();

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


    public static void cadastrarVeiculo() {
        int tipo = tipoVeiculo();
        Veiculo veiculo;
        switch (tipo) {
            case 0 -> {
                veiculo = new Moto();
                //adicionar na lista de veiculos da agencia
            }
            case 1 -> {
                veiculo = new Carro();
                //adicionar na lista de veiculos da agencia

            }
            case 2 -> {
                veiculo = new Caminhao();
                //adicionar na lista de veiculos da agencia
            }
            default -> throw new IllegalStateException("Unexpected value: " + tipo);
        }
        String fabricante = RNHelperVeiculo.trataFabricante();
        String modelo = RNHelperVeiculo.trataModelo();
        String placa = RNHelperVeiculo.trataPlaca();
        String ano = RNHelperVeiculo.trataAno();
        veiculo.setFabricante(fabricante);
        veiculo.setModelo(modelo);
        veiculo.setPlaca(placa);
        veiculo.setAno(ano);
        veiculoController.adicionar(veiculo);

    }


    public static void listarTudo(List<Veiculo> veiculos) {
        System.out.println("Veículos cadastrados: ");
        int i = 0;
        for (Veiculo veiculo : veiculos) {
            System.out.println(" Identificador: " + i + " Fabricante: " + veiculo.getFabricante() + " Modelo: " + veiculo.getModelo() + " Placa: " + veiculo.getPlaca() + " Ano: " + veiculo.getAno());
            i++;
        }
        System.out.println();
    }

    public static void listar() {
            listarTudo(veiculoController.listar());
    }

    public static void alterarVeiculo() {

        listar();

        List<Veiculo> veiculos = veiculoController.listar();

        String escolha = ConsoleUIHelper.askNoEmptyInput("Selecione o veículo através do índice.", 2);

        for (int i = 0; i < veiculos.size(); i++) {
            if (Integer.valueOf(escolha) == (i)) {
                System.out.println("Veículo selecionado:");
                System.out.println("[" + (i) + "] " + veiculos.get(i));
                veiculos.remove(i);
                cadastrarVeiculo();
                System.out.println("Veículo alterado com sucesso!");
            }
        }
    }


    public static void buscar() {
        VeiculoController veiculoController = new VeiculoController();

        String placa = ConsoleUIHelper.askSimpleInput("Digite a placa do veiculo");
        veiculoController.buscar(placa);
    }




    }



