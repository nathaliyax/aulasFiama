package conta;
public abstract class Conta {
    protected String numero;
    protected String agencia;
    protected String titular;
    protected double saldo;

    public Conta(String numero, String agencia, String titular, double saldoInicial) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar (double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque inválido ou saldo insuficiente.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual da conta (" + titular + "): R$ " + String.format("%.2f", saldo));
    }

    public abstract double calcularTarifaMensal();
}
