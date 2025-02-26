// Figura 7.22: ArrayManipulacao.java --> tradução em ingle ArrayManipulation.java
// Metodos da classe Arrays e System.arraycopy
import java.util.Arrays;

public class ArrayManipulacao
{
    public static void main(String[] args)
    {
        // classifica doubleArray em ordem crescente
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);
        System.out.printf("\ndoubleArray: ");

        for(double valor: doubleArray)
            System.out.printf("%.1f", valor);

        // preenche o array de 10 elementos com 7s
        int[] preencheIntArray = new int[10];
        Arrays.fill(preencheIntArray, 7);
        telaArray(preencheIntArray, "preencheIntArray");

        // copia array intArray em array intArrayCopy
        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        telaArray(intArray, "intArray");
        telaArray(intArrayCopy, "intArrayCopy");

        // compara a igualdade de intArray e intArrayCopy
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("\n\nintArray %s intArrayCopy\n", (b ? "==" : "!="));

        // compara a igualdade de intArray e preencheIntArray
        b = Arrays.equals(intArray, preencheIntArray);
        System.out.printf("intArray %s preencheIntArray\n", (b ? "==" : "!="));

        // pesquisa em intArray o valor de 5
        int local = Arrays.binarySearch(intArray, 5);

        if(local >= 0)
            System.out.printf("Encontro 5 no elemento %d em intArray\n", local);
        else
            System.out.println("5 não encontrado em intArray");

        // pesquisa em intArray o valor 8763
        local = Arrays.binarySearch(intArray, 8763);

        if(local >= 0)
            System.out.printf("Encontrou 8763 no elemento %d em intArray\n", local);
        else
            System.out.println("8763 não encontrado em intArray");
    } // fim de main

    // gera saida de valores em cada array
    public static void telaArray(int[] array, String descricao)
    {
        System.out.printf("\n%s", descricao);

        for(int valor : array)
            System.out.printf("%d", valor);
    } // fim do metodo telaArray
} //frim da classe ArrayManipulacao
