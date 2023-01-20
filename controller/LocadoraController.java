package controller;

import model.Agencia;
import model.Locacao;
import model.Locadora;
import model.entities.Pessoa;
import model.entities.Veiculo;
import org.w3c.dom.ls.LSOutput;
import repository.LocacaoRepository;
import util.ConsoleUIHelper;
import view.ViewLocacao;

import java.util.List;


public class LocadoraController {

    private static LocacaoRepository locacaoRepository = new LocacaoRepository();
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
        Locacao locacao = new Locacao();
        Pessoa pessoa = viewLocacao.buscarCliente();
        Agencia agencia = viewLocacao.buscarAgencia();
        if (agencia == null){
            return;
        }
        Veiculo veiculo = viewLocacao.buscarVeiculo(agencia.getNome());
        if (veiculo == null){
            System.out.println("Essa Agencia não tem veiculo;");
            return;
        }

        String dataInicio = ConsoleUIHelper.askNoEmptyInput("Insira a data de Inicio da Locação: ",3);
        Double valorDiaria = veiculo.getValorDiaria();

        locacao.setVeiculo(veiculo);
        locacao.setAgencia(agencia);
        locacao.setPessoa(pessoa);
        locacao.setDataInicio(dataInicio);
        locacao.setValorDiaria(valorDiaria);

        Boolean confirma = viewLocacao.confimarLocacao();
        if(confirma){
            locacaoRepository.adicionarLocacao(locacao);
            viewLocacao.comprovanteLocacao(locacao);

        }else{
            System.out.println();
            System.out.println("Operação Cancelada");
            System.out.println();
        }
    }

    private void devolverVeiculo() {

        Pessoa pessoa = viewLocacao.buscarCliente();
        List<Locacao> locacoes = locacaoRepository.listarLocacao();

        int index  = viewLocacao.escolherLocacaoDevolver(locacoes, pessoa);

        if(index == -1){
            return;
        }
        Locacao locacao = locacaoRepository.buscarLocacaoById(index);

        locacao = viewLocacao.devoverVeiculo(locacao);

        locacaoRepository.alterarLocacao(index, locacao);

        viewLocacao.reciboDevolucao(locacao);


    }

}
