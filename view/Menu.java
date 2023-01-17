package view;

import controller.VeiculoController;
import model.Agencia;
import model.Endereco;
import model.Locadora;
import model.veiculos.Caminhao;
import model.veiculos.Carro;
import model.veiculos.Moto;
import util.ConsoleUIHelper;

import java.util.ArrayList;
import java.util.List;

import static view.ViewAgencia.cadastrarAgencia;
import static view.ViewVeiculo.*;

public class Menu {

//    private List<Agencia> agenciaList;
//    public Menu() { this.agenciaList = new ArrayList<>();}

    Locadora locadora = new Locadora();
    private static ViewCliente viewCliente = new ViewCliente();

    public static void printMenu() {
        System.out.println("Bem-vindo a LocateCar");
        int value = optionMenu();
        Agencia agencia = new Agencia();

        switch (value){
            case 0 -> {
                cadastrarVeiculo(agencia);
                printMenu();
            }

            case 1 -> viewCliente.printMenuCliente();

            case 2 -> {
                cadastrarAgencia(agencia);
                //locadora.add(agencia); /não estou conseguindo fazer esse add funcionar
                printMenu();
            }
        }
    }






}


