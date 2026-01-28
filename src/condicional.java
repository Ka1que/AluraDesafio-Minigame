public class condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 4.1;
        String tipoPlano = "normal";

        if (anoDeLancamento > 2025) {
            System.out.println(" lacamento que os clientes estão curtindo!!! ");
        } else {
            System.out.println(" filme retro que vale a pena conferir!!! ");
        }

        if (tipoPlano.equals("plus") && (incluidoNoPlano == true)){
            System.out.println("filme liberado");
        } else {
            System.out.println("deve contratar um plano melhor ou alugar o filme");
        }

    }
}
