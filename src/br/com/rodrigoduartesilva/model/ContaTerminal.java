package br.com.rodrigoduartesilva.model;

public class ContaTerminal {
    private int numeroConta;
    private String agencia;
    private String nomeDoCliente;
    private double saldo = 0.0;
    private String mensagem;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirDadosDaConta() {
        System.out.println(mensagem = """
                
                Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, 
                conta %d e seu saldo R$ %.2f já está disponível para saque.
                
                """.formatted(getNomeDoCliente(), getAgencia(), getNumeroConta(), getSaldo()));
    }
}
