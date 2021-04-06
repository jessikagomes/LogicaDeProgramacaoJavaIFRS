public class ControleDeFluxoExercicioJavaII10 {
    public static void main(String[] args) {
        int opcao =1;
        int soma=0;
        int quad=0;
        int num=3;
        switch (opcao){
            case 1:
                soma= num+num;
                System.out.println(soma);
                break;
            case 2:
                quad=num*num;
                System.out.println(quad);
                break;
            default:
                System.out.println("opção invalida");
        }
    }
}
