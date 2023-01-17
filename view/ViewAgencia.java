package view;

import model.Agencia;
import model.Endereco;
import util.ConsoleUIHelper;

public class ViewAgencia {
    public static Agencia cadastrarAgencia(Agencia agencia) {
        String nome = ConsoleUIHelper.askNoEmptyInput("Digite o nome da agência", 3);
        Endereco endereco = adicionarEndereco();
        agencia = new Agencia(nome, endereco);
        return agencia;
    }

    public static Endereco adicionarEndereco() {
        String logradouro = ConsoleUIHelper.askSimpleInput("Digite o logradouro: ");
        String numero = ConsoleUIHelper.askSimpleInput("Digite o número da edificação: ");
        String cidade = ConsoleUIHelper.askSimpleInput("Digite a cidade: ");
        String estado = ConsoleUIHelper.askSimpleInput("Digite o estado: ");
        String cep = ConsoleUIHelper.askSimpleInput("Digite o CEP: ");
        Endereco endereco = new Endereco(cep, logradouro, numero, cidade, estado);
        return endereco;
    }
}
