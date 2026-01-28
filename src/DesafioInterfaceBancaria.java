import java.util.Scanner;

public class DesafioInterfaceBancaria {

    public static void main(String[] args) {
        // declaração de variaveis e metodos implementados
        Scanner scan = new Scanner(System.in);
        double valor;
        boolean isRun = true;

        //dados do cliente
        String nome = "Clark Kent";
        String tipoConta = "CC";
        Double saldo = 2500.0;

        //mensagem inicial com formatação
        System.out.printf("**********************************************************\n");
        System.out.println("\n  Dados iniciais do Cliente \n");
        System.out.printf("  Nome:           %28s \n", nome);
        System.out.printf("  Tipo da conta:  %28s \n", tipoConta);
        System.out.printf("  Saldo da conta: %28s \n\n", saldo);
        System.out.printf("**********************************************************\n");

        //laço de decisão para operações
        while(isRun){
            System.out.println("\nOperações: \n");
            System.out.printf("  1 - Consultar saldo\n");
            System.out.printf("  2 - Transferir\n");
            System.out.printf("  3 - depositar\n");
            System.out.printf("  4 - sair\n");
            System.out.println("\n Digite a opção desejada: \n");

            //receber o tipo da operação
            int operacao = scan.nextInt();


            switch (operacao) {
                case 1:
                    System.out.println("valor em conta é : R$ " + saldo);
                    break;
                case 2:
                    System.out.println("digite o valor a ser transferido: ");
                    valor = scan.nextDouble();
                    if (valor>saldo){
                        System.out.println("valor invalido");
                    }else {
                        saldo -= valor;
                    }
                    System.out.println("valor em conta agora é : R$ " + saldo);
                    break;
                case 3:
                    System.out.println("digite o valor a ser depositado: ");
                    valor = scan.nextDouble();
                    saldo += valor;
                    System.out.println("valor em conta agora é : R$ " + saldo);
                    break;
                case 4:
                    System.out.println("obrigado pela preferencia e até mais!!!");
                    isRun = false;
                    break;
                default:
                    System.out.println("Numero de operação invalido");
                    break;
            }

        }


    }
}
