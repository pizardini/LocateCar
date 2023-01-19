package repository;

import model.Agencia;

import java.util.ArrayList;
import java.util.List;

public class AgenciaRepository {
    private List<Agencia> agencias;

    public AgenciaRepository() {
        agencias = new ArrayList<>();
    }

    public void adicionarAgencias(Agencia agencia) {
        agencias.add(agencia);
    }

    public List<Agencia> listarAgencias() {
        return agencias;
    }

    public void removerAgencia(Agencia agencia) {
        agencias.remove(agencia);
    }
}
