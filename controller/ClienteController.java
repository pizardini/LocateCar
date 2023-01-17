package controller;

import model.Cliente;
import model.entities.Pessoa;
import view.ViewCliente;

public class ClienteController {

    private PessoaController pessoaController;

    private boolean continuar = true;

    public boolean menuInicial(int value){

            switch (value) {
                case 0 -> adicionarCliente();
                case 1 -> System.out.println("Listar Clientes");
                case 2 -> System.out.println("Atualizar Cliente");
                case 3 -> System.out.println("Remover Cliente");
                case 4 -> System.out.println("Buscar Clientes");
                case 5 -> continuar = false;
            }

            return continuar;
    }


    private void adicionarCliente(){




    }





}
