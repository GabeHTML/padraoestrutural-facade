public class Documentacao extends SetorFuncionario {
    private static Documentacao documentacao = new Documentacao();
    private Documentacao() {};

    public static Documentacao getInstance() {
        return documentacao;
    }
}
