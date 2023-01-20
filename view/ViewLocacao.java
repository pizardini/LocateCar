package view;

import controller.AgenciaController;
import controller.ClienteController;
import controller.LocadoraController;
import model.Agencia;
import model.Locacao;
import model.entities.Pessoa;
import model.entities.Veiculo;
import util.ConsoleUIHelper;

import java.util.List;

public class ViewLocacao {


    private static LocadoraController locadoraController = new LocadoraController();
    private ClienteController clienteController = new ClienteController();
    private AgenciaController agenciaController = new AgenciaController();

    private ViewVeiculo viewVeiculo = new ViewVeiculo();

    public static void printMenuLocacao() {
        System.out.println("Bem-vindo a Locação de Veiculo");

        boolean continuar = true;

        while (continuar) {
            continuar = locadoraController.locadoraOpcao(optionMenuLocadora());
        }
    }

    private static int optionMenuLocadora() {
        int option = ConsoleUIHelper.askChooseOption("O que deseja fazer: ",
                "Locar um Veiculo;",
                "Devolver Um veiculo;",
                "Voltar"
        );

        return option;
    }

    public Pessoa buscarCliente() {
        Pessoa pessoa;
        Boolean confirmar = ConsoleUIHelper.askConfirm("Cliente já cadastrado", "Sim", "Não");
        if(confirmar){
            pessoa = clienteController.buscarClienteParaLocacao();

        }else{
            pessoa = clienteController.cadastrarCliente();
        }
        return pessoa;
    }

    public Agencia buscarAgencia() {

        System.out.println("Selecione uma agencia: ");
        agenciaController.listarAgencias();

        String nomeAgencia = ConsoleUIHelper.askNoEmptyInput("Digite o nome da Agencia", 3);

        Agencia agencia = agenciaController.selecionarAgencia(nomeAgencia);
        if (agencia == null){
            System.out.println("Digitou nome errado tente novamente");
        }

        return agencia;
    }

    public Veiculo buscarVeiculo(String nomeAgencia) {

        List<Veiculo> veiculosAgencia = viewVeiculo.buscarVeiculosAgencia(nomeAgencia);
        viewVeiculo.listarTudo(veiculosAgencia);

        String placaVeiculo = ConsoleUIHelper.askNoEmptyInput("Digite a placa do veiculo que deseja locar", 3);

        Veiculo veiculo = viewVeiculo.buscarVeiculoPlaca(placaVeiculo);

        return veiculo;
    }

    public Boolean confimarLocacao() {

        return ConsoleUIHelper.askConfirm("Deseja confirmar a locação", "Sim", "Não");
    }

    public void comprovanteLocacao(Locacao locacao) {

        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("Recibo de Locação do Veiculo");
        System.out.println();
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("Data da Locação: " + locacao.getDataInicio());
        System.out.println("Nome do Cliente: " + locacao.getPessoa().getName());
        System.out.println();
        System.out.println("Nome da Agencia: " + locacao.getAgencia().getNome());
        System.out.println("Endereco da Agencia: " + locacao.getAgencia().getEndereco());
        System.out.println();
        System.out.println("Dados do Veiculo");
        System.out.println("Marca: " + locacao.getVeiculo().getFabricante());
        System.out.println("Modelo: " + locacao.getVeiculo().getModelo());
        System.out.println("Placa do Veiculo: " + locacao.getVeiculo().getPlaca());
        System.out.println("Tipo de veículo: " + locacao.getVeiculo().getTipoVeiculo());
        System.out.println("Valor da diária: " + locacao.getValorDiaria());
        System.out.println();
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");

    }

    public int escolherLocacaoDevolver(List<Locacao> locacoes, Pessoa pessoa) {
        System.out.println();
        System.out.println("Cliente: " + pessoa.getName());
        System.out.println();

        boolean temLocacao = false;

        for (int i = 0; i < locacoes.size(); i++) {
            if(locacoes.get(i).getPessoa().equals(pessoa)){

                System.out.println("# : ID: " + i +
                        " Data locação: " + locacoes.get(i).getDataInicio() + " Veiculo: " +
                        locacoes.get(i).getVeiculo().getPlaca() + " " + locacoes.get(i).getVeiculo().getModelo());

                temLocacao = true;

            }
        }
        if(!temLocacao){
            return -1;
        }

        int index = ConsoleUIHelper.askNumberInt("Digite o indice da devolução: ");

        return index;

    }

    public Locacao devoverVeiculo(Locacao locacao) {

        String dataDevolucao = ConsoleUIHelper.askNoEmptyInput("digite a data de devolucao:",3);
        int diasLocacao = ConsoleUIHelper.askNumberInt("Quantos dias de locacao");
        System.out.println("Escolha a agencia de devolucao");
        Agencia agencia = buscarAgencia();
        locacao.setDataDevolucao(dataDevolucao);
        locacao.setQtdoDias(diasLocacao);
        Double valorFinal =  valorFinal = diasLocacao * locacao.getVeiculo().getValorDiaria();
        Double vDesconto = 0.0;

        if(locacao.getPessoa().getTipoPessoa().equals("PessoaFisica")){
            if(diasLocacao > 5){
                double desconto = (diasLocacao * locacao.getVeiculo().getValorDiaria()) * 0.05;
                valorFinal = valorFinal - desconto;
                vDesconto = 5.0;
            }
        }else{
            if(diasLocacao > 3){
            double desconto = (diasLocacao * locacao.getVeiculo().getValorDiaria()) * 0.10;
            valorFinal = valorFinal - desconto;
                vDesconto = 10.0;
            }

        }
        locacao.setAgenciaDevolucao(agencia);
        locacao.setValorTotalLocacao(valorFinal);
        locacao.setDesconto(vDesconto);

        return locacao;
    }

    public void reciboDevolucao(Locacao locacao) {
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("Recibo de Devolucao");
        System.out.println();
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("Data da Locação: " + locacao.getDataInicio());
        System.out.println("Data de devolução: " + locacao.getDataDevolucao());
        System.out.println("Nome do Cliente: " + locacao.getPessoa().getName());
        System.out.println();
        System.out.println("Nome da Agencia: " + locacao.getAgencia().getNome());
        System.out.println("Endereco da Agencia: " + locacao.getAgencia().getEndereco());
        System.out.println();
        System.out.println("Dados do Veiculo");
        System.out.println("Modelo: " + locacao.getVeiculo().getModelo());
        System.out.println("Placa do Veiculo:" + locacao.getVeiculo().getPlaca());
        System.out.println("Nome do Cliente: " + locacao.getVeiculo().getTipoVeiculo());
        System.out.println("Nome do Cliente: " + locacao.getValorDiaria());
        System.out.println();
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");

        System.out.println("Quantidade de dias: " + locacao.getQtdoDias());
        System.out.println("Desconto: " + locacao.getDesconto());
        System.out.println("Valor total a Pagar: " + locacao.getValorTotalLocacao());
        System.out.println();
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");




    }
}
