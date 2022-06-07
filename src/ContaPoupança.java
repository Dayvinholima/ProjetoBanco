public class ContaPoupança extends Conta{

    private final String atendimento = "Sem Prioridades";
    private final double rendimento = 2.5;

    public ContaPoupança(String titularDaConta, String numeroAgencia, String numeroConta, double saldo) {
        super(titularDaConta, numeroAgencia, numeroConta, saldo);
    }
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Atendimento: " +  getAtendimento());
    }

    public String getAtendimento() {
        return atendimento;
    }
}
