public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337,24226);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente raiza = new Cliente();
        raiza.setNome("Raiza de Paula");

        conta.setTitular(raiza);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("progrmadora");
        //agora em duas linhas:
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programadora");
    }
}
