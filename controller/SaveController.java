package controller;

import model.Agencia;
import repository.AgenciaRepository;
import repository.ClienteRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveController {

    static AgenciaRepository agenciaRepository;
    static ClienteRepository clienteRepository;

//    static VeiculoRepository veiculoRepository;
//    static LocadoraRepository locadoraRepository;

    public SaveController() {

    }
// Sistema de salvar e carregar base de dados
//    public void salvar() throws FileNotFoundException, IOException {
//        File path = new File("data.bin");
//        FileOutputStream fos = new FileOutputStream(path);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(sistema); //sistema precisa ser um objeto com uma lista englobando tudo
//        oos.flush();
//        System.out.println("Lista salva em: " + path.getPath());
//    }
//
//    public void carregar() throws FileNotFoundException, IOException, ClassNotFoundException {
//        File path = new File("agenda.bin");
//        FileInputStream fis = new FileInputStream(path);
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        sistema = (List<Sistemas>) ois.readObject(); //
//    }
}
