package Conta.TipoConta;

import Conta.Construtor.Conta;
import Conta.ConstrutorCliente.Cliente;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente){

        super(cliente);

    }

    public void imprimirExtrato(){

        System.out.println("### EXTRATO CONTA POUPANÇA ###");
        
        imprimirDadosComuns();

    }

}
