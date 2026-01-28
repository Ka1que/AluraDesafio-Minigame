//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        double notaMensal = 7.8,
                notaBimestral = 9.0,
                notaFinal;

        notaFinal = (notaMensal + notaBimestral) / 2; // .1

        int casting = (int) notaFinal;

        System.out.println("nota final: " + casting); // .2

        char k = 'k';
        String o_resto = "aique";

        System.out.println( k + o_resto); // .3

        double precoProduto = 180.0;
        int quantidade = 12;
        System.out.println(precoProduto * quantidade);

        double valorEmDolares = 4.99,
                valorDoDolar = 4.94;

        System.out.println("valor em dolares do seu jogo: " + valorDoDolar * valorEmDolares);

        double precoOriginal = 12.99, desconto = 5.0;

        System.out.println(precoOriginal - (precoOriginal / (desconto * 0.01)));




    }
}