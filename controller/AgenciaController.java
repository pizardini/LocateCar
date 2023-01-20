package controller;

import model.Agencia;
import repository.AgenciaRepository;
import view.ViewAgencia;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class AgenciaController {
    static AgenciaRepository agenciaRepository;


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
            case 4 -> viewAgencia.buscarAgencia();
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
        System.out.println("Lista de Agências cadastradas");
        ViewAgencia.printAgencias(agencias);
    }

    public static void buscar(String nome) {
        List<Agencia> agenciasEncontradas = new ArrayList<>();
        List<Agencia> agencias = agenciaRepository.listarAgencias();

        for (int i = 0; i < agencias.size(); i++) {
            if(agencias.get(i).getNome().contains(nome)) {
                agenciasEncontradas.add(agencias.get(i));
            }
        }

        if(agenciasEncontradas.size() == 0) {
            System.out.println("Nenhuma agência encontrada");
        } else {
            System.out.println("Agências encontradas:");
            ViewAgencia.printAgencias(agenciasEncontradas);
        }

    }
}
