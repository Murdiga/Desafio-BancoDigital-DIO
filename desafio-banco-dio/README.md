# Desafio DIO (Banco Digital)

Neste desafio foi proposto desenvolver um protótipo de Banco digital com algumas funções simples, como listagem abaixo:
- Adição de nova Conta
- Métodos de Transação Bancaria (Saque, Deposito e Transferência)
- Cadastro de Cliente ao gerar no Conta Bancaria
- Montagem de lista de Contas

---
# Estrutura de Pastas
Neste projeto foi criado a pasta raiz `CONTA`, no qual possui subpastas que separam cada Construtor e classe. A estrutura presente nela é:

- ```http
  Conta\Construtor -> Neste pacote esta localizado todas as classes Conta, InterfaceConta e ListaContas
  ```

- ```http
  Conta\ConstrutorCliente -> Neste pacote esta localizado a classe Cliente, que especifica quais são as informas que devem ser informadas ao cadastrar uma nova conta
  ```

- ```http
  Conta\TipoConta -> Neste pacote esta localizado todas as classes filhas da Classe Conta, neste projeto possuimos somente duas (ContaCorrente e ContaPoupanca)
  ```

---