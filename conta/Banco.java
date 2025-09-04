package conta;

public class Banco {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente("123", "001", "Victor", 1000.0);
        Conta cp = new ContaPoupanca("456", "001", "Nathalia", 500.0);
        Conta pj = new ContaPessoaJuridica("789", "002", "Empresa XYZ", 5000.0);

        System.out.println("=== Operações ===");

        cc.depositar(300);
        cc.sacar(150);
        cc.exibirSaldo();
        System.out.println("Tarifa mensal CC: R$ " + cc.calcularTarifaMensal());
        System.out.println();

        cp.depositar(100);
        cp.sacar(50);
        cp.exibirSaldo();
        System.out.println("Tarifa mensal CP: R$ " + cp.calcularTarifaMensal());
        System.out.println();

        pj.depositar(1000);
        pj.sacar(500);
        pj.exibirSaldo();
        System.out.println("Tarifa mensal PJ: R$ " + pj.calcularTarifaMensal());
    }
}
