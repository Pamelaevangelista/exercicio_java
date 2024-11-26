// Interface ContaBancaria
interface ContaBancaria {
    void depositar (double valor);
    void sacar(double valor);
    double consultarSaldo();
}

// Classe ContaCorrente 
class ContaCorrente implements ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0; // Saldo inicial
    }
    @Override
     public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depositado: R$ " + valor + " . Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Valor de depósito deve ser positivo");
        }
     }

     @Override
     public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Sacado: R$ " + valor + " . Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saque inválido. Verifique o valor. ");
        }
     }

     @Override
     public double consultarSaldo() {
        return saldo;
     }

     public String getTitular() {
        return titular ;
     }
}

// Classe Principal 
public class ContaBancaria {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaCorrente("João Silva");

        conta.depositar(1000); // Depositar R$ 1000
        conta.sacar(300);  // saca R$300
        System.out.println("Saldo atual: R$ " + conta.consultarSaldo()); // consulta sald
        conta.sacar(800); // tenta acar mais do qu o disponível 
        conta.depositar(-50); // tenta epositar um valor negativo 
    }

    
}