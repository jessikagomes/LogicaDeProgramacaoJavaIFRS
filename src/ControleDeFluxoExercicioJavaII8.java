public class ControleDeFluxoExercicioJavaII8 {
    public static void main(String[] args) {

        int senha=1613;
        int senhacerta=1234;

        while (senha != senhacerta){
            System.out.println("Senha Incorreta, tente novamente!");
        } do {
            System.out.println("Senha Correta!");
        }while (senha == senhacerta);

    }
}
