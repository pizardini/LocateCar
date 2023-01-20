package controller;

import model.entities.Veiculo;
import view.ViewVeiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class VeiculoController {
    private static List<Veiculo> veiculos = new ArrayList<>();
    //Agencia agencia = new Agencia();

    public static boolean veiculoOpcao(int value) {

        //List<Veiculo> veiculos = new ArrayList<>();
        boolean continuar = true;
        switch (value) {
            case 0 -> ViewVeiculo.cadastrarVeiculo();
            case 1 -> ViewVeiculo.alterarVeiculo();
            case 2 -> ViewVeiculo.buscar();
            case 3 -> ViewVeiculo.listar();
            case 4 -> continuar = false;
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

    public static Veiculo buscar(String placa) {
        ViewVeiculo.listarTudo(buscarPorFabricante(placa));;

        return null;
    }

    public List<Veiculo> listar() {
        return this.veiculos;
    }

    public Veiculo buscarPlaca(String placa) {

        Veiculo veiculo = null;
        for (int i = 0; i < veiculos.size(); i++){

            if (veiculos.get(i).getPlaca().toLowerCase().equals(placa.toLowerCase())) {
                veiculo = veiculos.get(i);
                veiculos.get(i).setAlugado(true);
            }

        }
        return veiculo;

    }

    public void alterarVeiculo (int index, Veiculo veiculo){
        veiculos.set(index, veiculo);
    }




}




