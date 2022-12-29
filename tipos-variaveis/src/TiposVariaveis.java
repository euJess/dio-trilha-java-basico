public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500; // não pode ter ponto (2.500) pq conta como virgula

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;
        numero = 5;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;

        // VALOR_DE_PI = 1.25; (se tentar mudar o valor dá erro por conta do "final")
    }
}
