// Figura 7.17: InicialiazaArraysBidimensionais.java --> tradução do ingles InitArray.java
// Inicializando arrays bidimensionais.

public class InicializaArraysBidimensionais
{
   // cria e gera saída de arrays bidimenisonais
   public static void main(String[] args)
   {
       int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
       int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

       System.out.println("Os valores na matriz1 por linha são");
       saidaArray(array1); // exibe array1 por linha

       System.out.println("Os valores na matriz2 por linha são");
       saidaArray(array2); // exibe array1 por linha/
   } // fim de main

   // gera saida de linhas do array
   public static void saidaArray(int[][] array)
   {
       // faz um loop pelas linhas do array
       for(int linha = 0; linha < array.length; linha++)
       {
           // faz um loop pelas colunas da linha atual
           for(int coluna = 0; coluna < array[linha].length; coluna++)
               System.out.printf("%d ", array[linha][coluna]);

           System.out.println(); // inicia nova linha de saída
       } // fim do for externo
   } // fim do metodo saidaArray
} // fim da classe InicializaArrayBidimensionais
