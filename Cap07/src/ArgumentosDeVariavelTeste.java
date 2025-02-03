// Figura 7.20 ArgumentoDeVariavelTeste.java --> tradução do ingles VarargsTeste.java
// Utilizando listas de argumentos dfe comprimento variavel.

public class ArgumentosDeVariavelTeste
{
    // calcula a media
    public static double media( double... numeros)
    {
        double total = 0.0; // inicaliza o total

        // calcula o total utilizando a instrução for aprimorada
        for(double d: numeros)
            total += d;

        return total / numeros.length;
    } // fim do metodo media

    public static void main(String[] args)
    {
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;


        System.out.printf("d1 = %.1f\nd2 = %1f\nd3 - %.1f\nd4 = %.1f\n\n",
                d1, d2, d3, d4);
        System.out.printf("Média de d1 e d2 é %.1f\n", media(d1, d2));
        System.out.printf("Media de d1, d2 e d3 é %.1f\n", media(d1, d2, d3));
        System.out.printf("Média de d1, d2, d3 e d4 é %.1f\n", media(d1, d2, d3, d4));
    }
}
