public class Hospital extends SetorFuncionario {
    private static Hospital hospital = new Hospital();

    private Hospital() {};

    public static Hospital getInstance() {
        return hospital;
    }
}
