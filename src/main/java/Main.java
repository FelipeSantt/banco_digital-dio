public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        c1.setNome("Lorenna");
        Cliente c2 = new Cliente();
        c2.setNome("Felipe");


        Conta cc = new ContaCorrente(c1);
        Conta poupanca = new ContaPoupanca(c2);

        cc.depositar(250);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
