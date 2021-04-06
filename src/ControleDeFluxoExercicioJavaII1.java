import java.sql.SQLOutput;

public class ControleDeFluxoExercicioJavaII1 {
    public static void main(String[] args) {
        int mes = 1;
        int dia = 30;
        int ano = 2009;
        System.out.print(dia + " de ");
        switch (mes){
            case 1:
                System.out.print("Janeiro");
                break;
            case 2:
                System.out.print("Fevereiro");
                break;
            case 3:
                System.out.print("Março");
                break;
            case 4:
                System.out.print("Abril");
                break;
            case 5:
                System.out.print("Maio");
                break;
            case 6:
                System.out.print("Junho");
                break;
            case 7:
                System.out.print("Julho");
                break;
            case 8:
                System.out.print("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.print("Outubro");
                break;
            case 11:
                System.out.print("Novembro");
                break;
            case 12:
                System.out.print("Dezembro");
                break;
            default:
                System.out.println("inválido");
        }
        System.out.print(" de " + ano);
    }
}
