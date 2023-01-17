package model;

import java.util.List;

public class Locadora {
    private List<Agencia> agencias;

    public Locadora() {
    }

    public Locadora(List<Agencia> agencias) {
        this.agencias = agencias;
    }

    public List<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(List<Agencia> agencias) {
        this.agencias = agencias;
    }
}
