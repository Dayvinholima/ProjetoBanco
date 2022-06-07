public class Principal {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("Dimas", "5861", "15844-8",500);
        ContaCorrente c2 = new ContaCorrente("Karane", "7971", "15961-8",30000);

        c1.mostrarDados();
        c2.mostrarDados();

        c1.sacar(350);
        c2.sacar(200);

        c1.depositar(235.76);

        ContaEspecial ce1 = new ContaEspecial("Dayvson", "2701", "15681-8",0, 500);

        ce1.mostrarDados();
        ce1.sacar(100);
        ce1.depositar(600);


    }
}



