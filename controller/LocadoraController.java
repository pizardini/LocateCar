package controller;

import model.Locadora;

public class LocadoraController {
    protected Locadora locadora;


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
    }

    private void devolverVeiculo() {
    }

}
