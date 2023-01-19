package model;

import model.entities.Pessoa;
import model.entities.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private List<Agencia> agencias;
    private String duracao;

    public Locadora() {
        this.agencias = new ArrayList<>();
    }

    public Locadora(Agencia agencia) {

        this.agencias.add(agencia);
    }

}
