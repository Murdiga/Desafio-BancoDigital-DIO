package Conta.Construtor;

import java.util.ArrayList;
import java.util.List;

public class ListaConta {

    private List<Conta> listaContas;

    public ListaConta(){

        this.listaContas = new ArrayList<>();

    }

    public void adicionarConta(Conta conta){

        listaContas.add(conta);

    }

    public void exibirConta(){

        System.out.println(listaContas);

    }

}
