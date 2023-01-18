package view;

import model.Agencia;
import model.Locadora;
import util.ConsoleUIHelper;

import static view.ViewAgencia.cadastrarAgencia;
import static view.ViewVeiculo.*;

public class Menu {

//    private List<Agencia> agenciaList;
//    public Menu() { this.agenciaList = new ArrayList<>();}

    Locadora locadora = new Locadora();
    private static ViewCliente viewCliente = new ViewCliente();
    private static ViewVeiculo viewVeiculo = new ViewVeiculo();

    public static void printMenuPrincipal() {
        System.out.println("Bem-vindo a LocateCar");
        int value = optionMenuPrincipal();
        Agencia agencia = new Agencia();

        switch (value) {
            case 0 -> viewVeiculo.printMenuVeiculo();


            case 1 -> viewCliente.printMenuCliente();

            case 2 -> {
                cadastrarAgencia(agencia);
                //locadora.add(agencia); /não estou conseguindo fazer esse add funcionar
                printMenuPrincipal();
            }
        }
    }


    public static int optionMenuPrincipal() {
        int option = ConsoleUIHelper.askChooseOption(
                "O que deseja fazer?",
                "Gerenciar veículos",
                "Gerenciar Cliente",
                "Cadastrar agência ",
                "Alterar agência",
                "Buscar uma agência por parte do nome ou do logradouro do endereço",
                "Alugar veículo",
                "Devolver veículo",
                "Sair"
        );
        return option;
    }
}



