package repository;

import model.Locacao;

import java.util.ArrayList;
import java.util.List;

public class LocacaoRepository {

    private List<Locacao> locacoes = new ArrayList<>();


    public void adicionarLocacao(Locacao locacao){

        locacoes.add(locacao);

    }

    public Locacao buscarLocacaoById(int index){

        return locacoes.get(index);

    }

    public Integer buscarIdLocacao(Locacao locacao){
        return locacoes.indexOf(locacao);
    }

    public void alterarLocacao(int index, Locacao locacao){
        locacoes.set(index, locacao);
    }


}
