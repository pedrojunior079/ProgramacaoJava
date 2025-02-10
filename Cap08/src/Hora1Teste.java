// Figura 8.2: Hora1Teste.java --> tradução do ingles Time1Test.java
// objeto Time1 utilizando em um aplicativo.

public class Hora1Teste
{
    public static void main(String[] args)
    {
        // ccria e incializa um objeto time1
        Hora1 hora = new Hora1(); // invoca o construtor Hora1

        // gera saida de apresentações de string da hora
        System.out.print("O tempo universal inicial é:");
        System.out.println(hora.toUniversalString());
        System.out.print("O tempo padrão inicial é:");
        System.out.println(hora.toString());
        System.out.println(); // gera a saida de uma linha em branco

        // altera a hora e gera saida da hora atualizada
        hora.setHora(13, 27, 6);
        System.out.print("A hora universal após setHora é:");
        System.out.println(hora.toUniversalString());
        System.out.print("A hora padrão após setHora é:");
        System.out.println(hora.toString());
        System.out.println(); // gera saida de uma linha em branco

        // configura a hora com valores invalidos; gera saida da hora atualizada
        hora.setHora(99, 99, 99);
        System.out.println("Após tentar definições inválidas:");
        System.out.print("Hora Universal: ");
        System.out.println(hora.toUniversalString());
        System.out.print("Hora Padrão: ");
        System.out.println(hora.toString());
    } // fim de main
}  // fim da classe Hora1Clase teste

