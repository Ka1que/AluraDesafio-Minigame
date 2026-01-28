import java.util.Random;
import java.util.Scanner;

public class AkINTor {
    public static void main(String[] args) {

        int tentativas = 5,
            resposta = new Random().nextInt(100),
            valor;
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem-vindo ao minigame de adivinhe o numero de 1 a 100 \n e você possui 5 tentativas");

        while (tentativas > 0){

            System.out.println(" digite um numero:");
            valor = scan.nextInt();
            tentativas -= 1;

            if (valor == resposta){
                System.out.println("Meus parabéns você ganhou");
                break;
            } else if (tentativas == 0){
                System.out.println("infelizmente não foi dessa vez mas talvez na próxima");
            } else if (valor < resposta){
                System.out.printf("você ainda não acertou, tentativas restante:%d\n dica: o seu valor é menor do que a resposta\n", tentativas);
            } else if (valor > resposta){
                System.out.printf("você ainda não acertou, tentativas restante:%d\n dica:  o seu valor é maior do que a resposta\n", tentativas);
            }

        }

    }
}
