package model;

import java.util.ArrayList;
import java.util.List;

public class Locadora {


    private List<Agencia> agencias;


    public Locadora() {
        this.agencias = new ArrayList<>();
    }

    public Locadora(Agencia agencia) {
        this.agencias.add(agencia);
    }


}
