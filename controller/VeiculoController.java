package controller;

import model.entities.Veiculo;

import java.util.List;

public class VeiculoController {
    protected List<Veiculo> veiculos;
    public void cadastraVeiculo( Veiculo veiculo){
        this.veiculos.add(veiculo);
    }
    public void cadastraVeiculos(List<Veiculo> veiculos){
        this.veiculos.addAll(veiculos);
    }

}
