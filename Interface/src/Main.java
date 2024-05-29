public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.setSaldo(200.00);
        depositar(cc, 300.00);
        System.out.println(cc.getSaldo());
    }
    private static void depositar(Conta conta, double valor){
        conta.depositar(valor);
        
    }
}