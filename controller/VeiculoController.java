package controller;

import model.Agencia;
import model.entities.Pessoa;
import model.entities.Veiculo;
import model.veiculos.Caminhao;
import model.veiculos.Carro;
import model.veiculos.Moto;
import util.ConsoleUIHelper;
import view.Menu;
import view.ViewVeiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class VeiculoController {
    protected static List<Veiculo> veiculos = new ArrayList<>();
    //Agencia agencia = new Agencia();

    public static boolean veiculoOpcao(int value) {

        //List<Veiculo> veiculos = new ArrayList<>();
        boolean continuar = true;
        switch (value) {
            case 0 -> ViewVeiculo.cadastrarVeiculo();
            case 1 -> ViewVeiculo.alterarVeiculo();
            case 2 -> ViewVeiculo.buscar();
            case 3 -> ViewVeiculo.listar();
            case 4 -> Menu.printMenuPrincipal();
            case 5 -> continuar = false;
        }
        return continuar;

    }


    public void adicionar(Veiculo veiculo) {
       this.veiculos.add(veiculo);
    }


    public static List<Veiculo> buscarPorFabricante(String placa) {
        return veiculos.stream()
                .filter(v -> v.getPlaca().toLowerCase().contains(placa.toLowerCase()))
                .collect(Collectors.toList());
    }

    public static void buscar(String placa) {
        ViewVeiculo.listarTudo(buscarPorFabricante(placa));;

    }

    public List<Veiculo> listar() {
        return this.veiculos;
    }


}


