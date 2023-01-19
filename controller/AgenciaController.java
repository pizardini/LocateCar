package controller;

import model.Agencia;
import repository.AgenciaRepository;
import view.ViewAgencia;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static view.ViewAgencia.buscarAgencia;


public class AgenciaController {
    static AgenciaRepository agenciaRepository;
    protected static List<Agencia> agencias = new ArrayList<>();

    public AgenciaController() {
        agenciaRepository = new AgenciaRepository();
    }

    private ViewAgencia viewAgencia = new ViewAgencia();

    public boolean agenciaOpcao(int value){

        boolean continuar = true;
        switch (value) {
            case 0 -> cadastrarAgencia();
            case 1 -> listarAgencias();
            case 2 -> System.out.println("editar agência");
            case 3 -> System.out.println("remover agência");
            case 4 -> buscarAgencia();
            case 5 -> continuar = false;
        }
        return continuar;
    }

    private void cadastrarAgencia() {
        Agencia agencia = new Agencia();
        agencia = ViewAgencia.dadosAgencia();

        agenciaRepository.adicionarAgencias(agencia);
        viewAgencia.mensagemGravar();
    }

    private void listarAgencias() {

        List<Agencia> agencias = agenciaRepository.listarAgencias();
        ViewAgencia.printAgencias(agencias);
        System.out.println("");
    }

    public static List<Agencia> buscaNome(String nome) {
        return agencias.stream()
                .filter(v -> v.getNome().toLowerCase().contains(nome.toLowerCase()))
                .collect(Collectors.toList());
    }

    public static void buscar(String nome) {
        ViewAgencia.printAgencias(buscaNome(nome));
    }
}
