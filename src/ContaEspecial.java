public class ContaEspecial extends Conta{

    private final String Atendimento = "com prioridades";
    private Double limiteEspecial;
    private Double saldoLimite;

    public ContaEspecial(String titularDaConta, String numeroAgencia, String numeroConta, double saldo, double limiteEspecial) {
        super(titularDaConta, numeroAgencia, numeroConta, saldo);
        this.limiteEspecial = 500.00;
        this.saldoLimite = limiteEspecial;
        if (saldo < 0){
            this.saldoLimite = limiteEspecial + saldo;
        }
    }
    public void sacar(double valor){
        if (valor <= this.getSaldo()){
            if(valor < 0){
                System.out.println("_____________________________");
                System.out.println("Saque não autorizado");
            } else {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("_____________________________");
                System.out.println("Saque Autorizado!");
                System.out.println("Seu novo saldo é de: " + this.getSaldo());
            }

        } else if(valor <= (this.getSaldo() + this.getSaldoLimite())){
            setSaldo(getSaldo() - valor);
            this.setSaldoLimite(getSaldoLimite() + getSaldo());
            System.out.println("_____________________________");
            System.out.println("Saque autorizado!");
            System.out.println("Seu novo saldo é de: " + this.getSaldo());
            System.out.println("você agora está usando "+ (limiteEspecial - getSaldoLimite()) +" de "+ this.limiteEspecial +" seu limite especial");

        } else {
            System.out.println("_____________________________");
            System.out.println("o valor que você tentou sacar é maior do que o seu limite disponivel");
        }
    }
    public void depositar(double valor){
        if (valor >= 0){
            System.out.println("_____________________________");
            System.out.println("depósito efetuado com sucesso!");
            System.out.println("seu saldo atual é de "+ (getSaldo() + valor));
            if (getSaldo() < 0 && (getSaldo() + valor) >= 0){
                System.out.println("você não está mais usando seu limite!");
            } else if (getSaldo() < 0) {
                setSaldoLimite(getSaldoLimite() + valor);
                System.out.println("você ainda está usando "+ (limiteEspecial - getSaldoLimite()) +" de "+ limiteEspecial +" do seu limite especial");
            }
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("não da pra depositar um valor negativo, dá?");
        }
    }

    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Atendimento: " +  getAtendimento());
    }

    public String getAtendimento() {
        return Atendimento;
    }

    public Double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(Double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public Double getSaldoLimite() {
        return saldoLimite;
    }

    public void setSaldoLimite(Double saldoLimite) {
        this.saldoLimite = saldoLimite;
    }
}