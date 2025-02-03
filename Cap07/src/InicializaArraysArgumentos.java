// Figura 7.21: InicializaArraysArgumentos.java --> tradução do ingles InitArray.java
// Iicializando um array com argumentos de linha de comando.

public class InicializaArraysArgumentos
{
    public static void main(String[] args)
    {
       // verifica o numero de argumentos de linha de comando
       if(args.length != 3)
           System.out.println("Erro: Volte a introduzir o comando completo, incluindo\n" +
                   "um tamanho de matriz, um valor inicial e um incremento.");
       else
       {
           // obtem o tamanho do array a partir do primeiro argumento de linha de comando
           int arrayLength = Integer.parseInt(args[0]);
           int[] array = new int[arrayLength]; // cria o array

           // obtem o valor inicial e o incremento a partir dos arguemntos de linha de comando
           int valorInicial = Integer.parseInt(args[1]);
           int incremento  = Integer.parseInt(args[2]);

           // calcula o valor de cada elemento do array
           for(int contador = 0; contador < array.length; contador++)
               array[contador] = valorInicial + incremento * contador;

           System.out.printf("%s%8s\n", "Index", "Valor");

           // exibe o valor e o indice de array
           for(int contador = 0; contador < array.length; contador++)
               System.out.printf("%5d%8d\n", contador, array[contador]);
       } // fim de else
    } // fim de main
} // fim da classe InicializaArraysArgumentos
