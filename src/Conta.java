public class Conta {
    private String titularDaConta;
    private String numeroAgencia;
    private String numeroConta;
    private double saldo;

    public Conta(String titularDaConta, String numeroAgencia, String numeroConta, double saldo){
        this.titularDaConta = titularDaConta;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        System.out.println("_____________________________");
        if (valor > 0){
            System.out.println("depósito efetuado com sucesso!");
            System.out.println("seu saldo atual é de "+ (getSaldo() + valor));
            setSaldo(getSaldo() + valor);
        } else if (valor == 0){
            System.out.println("você quer depositar 0 reais? você quer um biscoito?");
        }
        else {
            System.out.println("não da pra depositar um valor negativo, dá?");
        }
    }
    public void sacar(double valor){
        System.out.println("_____________________");
        if (valor <= this.getSaldo()) {
            if (valor < 0) {
                System.out.println("ta loco? querendo sacar valores negativos?");
            } else {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque efetuado com sucesso!");
                System.out.println("Seu novo saldo é de: " + this.getSaldo());
            }
        } else {
            System.out.println("o valor que você tentou sacar é maior do que o seu saldo disponivel");
        }
    }
    public void mostrarDados(){
        System.out.println("______________________");
        System.out.println("Titular: "+ getTitularDaConta());
        System.out.println("Agência: "+ getNumeroAgencia());
        System.out.println("Conta: "+ getTitularDaConta());
        System.out.println("Saldo: "+ getSaldo());

    }

    public String getTitularDaConta() {
        return titularDaConta;
    }

    public void setTitularDaConta(String titularDaConta) {
        this.titularDaConta = titularDaConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

