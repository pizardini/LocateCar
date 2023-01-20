package view;

import controller.AgenciaController;
import controller.ClienteController;
import controller.LocadoraController;
import model.Agencia;
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
            agencia = buscarAgencia();
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
}
