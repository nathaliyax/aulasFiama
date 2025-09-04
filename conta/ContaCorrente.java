package conta;
public class ContaCorrente extends Conta {
    private static final double TARIFA_MENSAL = 12.0;

    public ContaCorrente(String numero, String agencia, String titular, double saldoInicial) {
        super(numero, agencia, titular, saldoInicial);
    }

    @Override
    public double calcularTarifaMensal() {
        return TARIFA_MENSAL;
    }
}
