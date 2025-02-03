// Figura 7.24: ArrayListColecao.java -->tradução do ingles ArrayListCollection.java
// Demonstração da coleção ArrayList genérica
import java.util.ArrayList;

public class ArrayListColecao
{
    public static void main(String[] args)
    {
        // cria um novo ArrayList de strings
        ArrayList<String> items = new ArrayList<String>();

        items.add("vermelho"); // acrescenta um item a lista
        items.add(0, "amarelo"); // insere o valor no indice 0

        // cabeçalho
        System.out.print("Apresentar o conteúdo da lista com um circuito controlado por contador:");

        // exibe as cores na lista
        for(int i = 0; i < items.size(); i++)
            System.out.printf(" %s", items.get(i));

        // exibe as cores utilizando foreach no metodo tela
        tela(items, "\nApresentar o conteúdo da lista com a instrução enhanced for:");

        items.add("verde"); // adiciona "verde" ao final da lista
        items.add("amarelo"); // adiciona "amarelo" ao final da lista
        tela(items, "Lista com dois novos elementos:");

        items.remove("amarelo"); // remove o primeiro amarelo
        tela(items, "Remove primeira instancia do amarelo:");

        items.remove(1); // remove o item no indice 1
        tela(items, "Remove segundo elemento da lista (verde):");

        // verifica se um valor está em lista
        System.out.printf("\"vermelho\" é %s na lista\n", items.contains("vermelho") ? "": "não ");

        // exibe o número de elementos em List
        System.out.printf("Dimensão: %s\n", items.size());
    } // fim de main

    // exibe os elemenyos do ArrayList no console
    public static void tela(ArrayList<String> items, String header)
    {
        System.out.print(header); // exibe o cabeçalho

        // exibe cada elemento nos items
        for(String item : items)
            System.out.printf(" %s", item);

        System.out.println(); // exibe o fim de linha
    } // fim do metodo tela
} // fim da classe ArrayListColecao
