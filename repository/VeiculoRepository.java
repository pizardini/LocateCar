package repository;

import model.Agencia;
import model.entities.Pessoa;
import model.entities.Veiculo;
import view.ViewVeiculo;

import java.util.ArrayList;
import java.util.List;



public class VeiculoRepository {

    private List<Veiculo> veiculos;

    public VeiculoRepository() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }


    public List<Veiculo> listarVeiculo() {
        return veiculos;
    }

    public void removerVeiculo(Veiculo veiculo){
        veiculos.remove(veiculo);
    }

    public Veiculo listarVeiculoById(int id) {
        return veiculos.get(id);
    }

    public void alterarVeiculo(int id, Veiculo veiculo) {
        veiculos.set(id, veiculo);
    }



}
