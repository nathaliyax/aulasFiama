package conta;

public class ContaPessoaJuridica extends Conta {
    private static final double TARIFA_MENSAL = 20.0;
    private static final double TAXA_SAQUE = 1.5;

    public ContaPessoaJuridica(String numero, String agencia, String titular, double saldoInicial) {
        super(numero, agencia, titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double valorTotal = valor + TAXA_SAQUE;
        if (valor > 0 && valorTotal <= saldo) {
            saldo -= valorTotal;
            System.out.println("Saque de R$ " + valor + " realizado com taxa de R$ " + TAXA_SAQUE);
        } else {
            System.out.println("Saque inválido ou saldo insuficiente.");
        }
    }

    @Override
    public double calcularTarifaMensal() {
        return TARIFA_MENSAL;
    }
}