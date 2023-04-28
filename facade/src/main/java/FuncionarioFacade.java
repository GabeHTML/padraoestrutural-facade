public class FuncionarioFacade {

    public static boolean verificarPendenciasFuncionario(Funcionario funcionario) {
        if (Documentacao.getInstance().verificarPendencia(funcionario)) {
            return false;
        }
        if (Hospital.getInstance().verificarPendencia(funcionario)) {
            return false;
        }

        return true;
    }
}
