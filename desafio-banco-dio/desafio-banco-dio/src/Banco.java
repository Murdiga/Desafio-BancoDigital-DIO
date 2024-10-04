
import Conta.Construtor.Conta;
import Conta.Construtor.ListaConta;
import Conta.ConstrutorCliente.Cliente;
import Conta.TipoConta.ContaCorrente;
import Conta.TipoConta.ContaPoupanca;

public class Banco {
    public static void main(String[] args) throws Exception {

        ListaConta listaConta = new ListaConta();

        Conta cc = new ContaCorrente(new Cliente("Cliente 1", 25, "123.456.789-00", "Solteiro"));
        Conta poupanca = new ContaPoupanca(new Cliente("Cliente 2", 32, "321.654.987-00", "Casado"));
        Conta cc1 = new ContaCorrente(new Cliente("Cliente 3", 30, "231.564.897-01", "Viuvo"));

        cc.imprimirExtrato();

        cc.depositar(300);

        cc.imprimirExtrato();

        poupanca.imprimirExtrato();

        cc.transferir(250, poupanca);

        cc.imprimirExtrato();

        poupanca.imprimirExtrato();
        
        listaConta.adicionarConta(cc);
        listaConta.adicionarConta(poupanca);
        listaConta.adicionarConta(cc1);

        listaConta.exibirConta();

    }
}
