public class ControleDeFluxo {
    public static void main(String[] args) {
        //idade <15 categoria infantil
        // idade <=15 && idade < 18 juvenil
        // idade >= 18 adulto

        int idade=16;
        String categoria;
        if(idade <15) {
            categoria = "Categoria Infantil";
        }else if(idade >=15 && idade < 18){
            categoria = "Categoria Juvenil";
        }else{
            categoria ="Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
