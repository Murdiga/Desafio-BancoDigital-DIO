package Conta.ConstrutorCliente;

public class Cliente {

    private String nome;
    private int idade;
    private String cpf;
    private String estadoCivil;

    public Cliente(String nome, int idade, String cpf, String estadoCivil){

        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;

    }

    public String getNome(){

        return nome;

    }

    public int getIdade(){

        return idade;

    }

    public String getCPF(){

        return cpf;

    }

    public String getEstadoCivil(){

        return estadoCivil;

    }

    public String toString(){

        return "Cliente{'Nome: " + nome + "'"
            + ", CPF: '" + cpf + "'" 
            + ", Idade: '" + idade + "'" 
            + ", Estado Civil : '" + estadoCivil +"'}";

    }

}
