package controller;

import model.entities.Veiculo;
import model.veiculos.Caminhao;
import model.veiculos.Carro;
import model.veiculos.Moto;
import repository.VeiculoRepository;
import util.ConsoleUIHelper;
import view.Menu;
import view.ViewVeiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class VeiculoController {

    Veiculo veiculo;
    static VeiculoRepository veiculoRepository;
    protected static List<Veiculo> veiculos = new ArrayList<>();

    public VeiculoController() {
        veiculoRepository = new VeiculoRepository();
    }


    public  boolean veiculoOpcao(int value) {

        //List<Veiculo> veiculos = new ArrayList<>();
        boolean continuar = true;
        switch (value) {
            case 0 -> cadastrarVeiculo();
            case 1 -> System.out.println("Alterar Veiculo");
            case 2 -> System.out.println("Buscar veiculo");
            case 3 -> listarVeiculo();
            case 4 -> Menu.printMenuPrincipal();
            case 5 -> continuar = false;
        }
        return continuar;

    }


    public static void cadastrarVeiculo() {
        Veiculo veiculo;
        veiculo = ViewVeiculo.dadosVeiculo();

        veiculoRepository.adicionarVeiculo(veiculo);

    }



    public static List<Veiculo> listarVeiculo() {
        ViewVeiculo.listarTudo(veiculoRepository.listarVeiculo());
        return veiculos;
    }



    public Veiculo listarVeiculoById(int id) {
        return veiculoRepository.listarVeiculoById(id);
    }

    public void alterarVeiculo(int id, Veiculo veiculo) {
        veiculoRepository.alterarVeiculo(id, veiculo);
    }



}


