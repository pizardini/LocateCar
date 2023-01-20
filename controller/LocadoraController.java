package controller;

import model.Agencia;
import model.Locacao;
import model.Locadora;
import model.entities.Pessoa;
import model.entities.Veiculo;
import repository.LocacaoRepository;
import view.ViewLocacao;


public class LocadoraController {

    private static LocacaoRepository locacaoRepository = new LocacaoRepository();
    private Locacao locacao = new Locacao();
    private ViewLocacao viewLocacao = new ViewLocacao();
    private AgenciaController agenciaController = new AgenciaController();


    public boolean locadoraOpcao(int option) {

        boolean continuar = true;
        switch (option) {
            case 0 -> locarVeiculo();
            case 1 -> devolverVeiculo();
            case 2 -> continuar = false;
        }
        return continuar;
    }

    private void locarVeiculo() {

        Pessoa pessoa = viewLocacao.buscarCliente();
        Agencia agencia = viewLocacao.buscarAgencia();
        Veiculo veiculo = viewLocacao.buscarVeiculo(agencia.getNome());


    }

    private void devolverVeiculo() {
    }

}
