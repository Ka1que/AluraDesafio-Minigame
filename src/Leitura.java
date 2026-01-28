import java.util.Scanner;

public class Leitura{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito");
        //String busca = scan.nextLine();
        //System.out.println("o filme digitado foi " + busca);

        long a = 0,limite = 900000000;

        long tempoInicial = System.currentTimeMillis();
        for (int i = 1; i < limite; i++) {
            a += 1;
        }

        long tempoFinal = System.currentTimeMillis();
        System.out.println("tempo final: " + (tempoFinal - tempoInicial ));

        a = 0;

        tempoInicial = System.currentTimeMillis();
        for (int i = 1; i < limite; i++) {
            a = a + 1;
        }

        tempoFinal = System.currentTimeMillis();
        System.out.println("tempo final: " + (tempoFinal - tempoInicial ));


    }
}
