// Figura 7.12: ForAprimoradoEmArray.java --> tradução do ingles EnhancedForTest.java
// Usando instrução for aprimorada para somar inteiros em um array

public class ForAprimoradoEmArray
{
    public static void main(String[] args)
    {
       int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
       int total = 0;

        // adiciona o valor de cada elemento ao total
        for(int numero : array)
            total += numero;
        System.out.printf("total de elemento no array: %d\n", total);
    } // fim de main
} // fim da classe ForAprimoradoEmArray
