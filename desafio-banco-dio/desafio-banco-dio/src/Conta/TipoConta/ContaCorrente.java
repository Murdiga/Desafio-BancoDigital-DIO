package Conta.TipoConta;

import Conta.Construtor.Conta;
import Conta.ConstrutorCliente.Cliente;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente){

        super(cliente);

    }


    public void imprimirExtrato(){

        System.out.println("### EXTRATO CONTA CORRENTE ###");
        
        super.imprimirDadosComuns();

    }

}
