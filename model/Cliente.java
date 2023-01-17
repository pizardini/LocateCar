package model;

import model.entities.Pessoa;

public class Cliente<T extends Pessoa> {

    private T t;

    public Cliente(T t){

        this.t = t;

    }

    public T getCliente(){
        return t;
    }

    public void setCliente(T t){

        this.t = t;

    }



}
