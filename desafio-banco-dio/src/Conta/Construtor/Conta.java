package Conta.Construtor;

import Conta.ConstrutorCliente.Cliente;

public abstract class Conta implements InterfaceConta{

    private static final int AGENCIA_PADRAO = 1;
    public static final String Cliente = null;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){

        this.agencia = Conta.AGENCIA_PADRAO;

        this.conta = SEQUENCIAL++;

        this.cliente = cliente;

    }

    public int getAgencia(){

        return agencia;

    }

    public int getConta(){

        return conta;

    }

    public Double getSaldo(){

        return saldo;

    }

    public void sacar(double valor){

        saldo -= valor;

    }

    public void depositar(double valor){

        saldo += valor;

    }

    public void transferir(double valor, Conta contaDestino){

        this.sacar(valor);

        contaDestino.depositar(valor);

    }

    protected void imprimirDadosComuns(){

        System.out.println("""
                Titular : %s
                Agencia : %d
                Conta   : %d
                Saldo   : %.2f
                """.formatted(cliente.getNome(), agencia, conta, saldo));

    }

    public String toString(){
        
        return "Conta{'Agencia : %d', Conta : '%d'}\nCliente{Nome : '%s', Idade : '%d', CPF : '%s', Estado Civil : '%s'}\n"
        .formatted(getAgencia(), getConta(), cliente.getNome(), 
        cliente.getIdade(), cliente.getCPF(), cliente.getEstadoCivil());

    }

}
