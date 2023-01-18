package controller;

import model.Agencia;
import repository.AgenciaRepository;
import view.ViewAgencia;

import java.util.ArrayList;
import java.util.List;


public class AgenciaController {
    static AgenciaRepository agenciaRepository;

    public AgenciaController() {
        agenciaRepository = new AgenciaRepository();
    }
    private AgenciaController agenciaController = new AgenciaController();
    private ViewAgencia viewAgencia = new ViewAgencia();

    public boolean agenciaOpcao(int value){

        boolean continuar = true;
        switch (value) {
            case 0: cadastrarAgencia();
            case 1: listarAgencias();
            case 2: System.out.println("editar agência");
            case 3: System.out.println("remover agência");
            case 4: System.out.println("buscar agência");
            case 5: continuar = false;
        }
        return continuar;
    }

    private void cadastrarAgencia() {
        Agencia agencia = new Agencia();
        agencia = viewAgencia.dadosAgencia();

        agenciaRepository.adicionarAgencias(agencia);
        viewAgencia.mensagemGravar();
    }

    private void listarAgencias() {

        List<Agencia> agencias = agenciaRepository.listarAgencias();
        viewAgencia.printAgencias(agencias);
    }
}
