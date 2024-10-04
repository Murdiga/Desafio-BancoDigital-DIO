package Conta.Construtor;

import java.util.ArrayList;
import java.util.List;

public class ListaConta{

    private List<Conta> listaContas;

    public ListaConta(){

        this.listaContas = new ArrayList<>();

    }

    public void adicionarConta(Conta conta){

        listaContas.add(conta);

    }

    public void excluirConta(String cpf){

        List<Conta> contaRemover = new ArrayList<>();

        for(Conta c : listaContas){

            if (c.cliente.getCPF().equals(cpf)) {
                
                contaRemover.add(c);

            }

        }

        System.out.println("Removendo conta cadastrada com o CPF : " + cpf);

        listaContas.removeAll(contaRemover);

    }

    public void exibirConta(){

        System.out.println(listaContas);

    }

}
