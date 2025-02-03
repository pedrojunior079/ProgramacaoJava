// Figura 7.13: PassandoArray.java --> tradução do ingles PassArray.java
// Passando arrays e elementos de arrays individuais aos metodos.

public class PassandoArrays
{
    // main cria array e chama modifyArray e modifyElement
    public static void main(String[] args)
    {
       int[] array = {1, 2, 3, 4, 5};

       System.out.println("Efeitos da passagem de referência para uma matriz inteira:\n" +
               "Os valores da matriz original são:");

       // gera saida de elementos do array original
       for(int valor : array)
          System.out.printf("  %d", valor);

       modificaArray(array); // passa a referencia do array
       System.out.println("Os valores da matriz modificada são:");

       // gera saida de elementos do array modificado
       for(int valor : array)
           System.out.printf("  %d", valor);

       System.out.printf("\n\nEfeitos da passagem do valor do elemento da matriz:\n" +
               "array[3] antes de modificarElement", array[3]);

       modificaElement(array[3]); // tenta modificar o array[3]
       System.out.printf("array[3] depois de modificarElement: %d\n", array[3]);
    } // fim de main

    // multiplica cada elemento de um array por 2
    public static void modificaArray(int[] array2)
    {
        for(int contador = 0; contador < array2.length; contador++)
            array2[contador] *= 2;
    } // fim do metodo modificarArray

    // multiplica argumento por 2
    public static void modificaElement(int elemento)
    {
        elemento *= 2;
        System.out.printf("Valor do elemento em modifyElement: ", elemento);
    } // fim do metodo modificaElement
} // fim da classe PassandoArrays
