public class ContaCorrente extends Conta {

    private final String atendimento = "Sem Prioridades";

    public ContaCorrente(String titularDaConta, String numeroConta, String numeroAgencia, double saldo) {
        super(titularDaConta, numeroConta, numeroAgencia, saldo);
    }
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Atendimento: " +  getAtendimento());
    }

    public String getAtendimento() {
        return atendimento;
    }

}