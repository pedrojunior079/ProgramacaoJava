// Figura 4.6: MediaDaClasse.java (GradeBook)
// Classe MediaDaClasse que resolve o problema da média da classe
// utilizando repetição controlada por contador.

import java.util.Scanner;

public class MediaDaClasse
{
   private String nomeDoCurso; // nome do curso que MediaDaClasse represanta

   // o construtor inicializa nomeDoCurso
   public MediaDaClasse(String nome)
   {
      nomeDoCurso = nome; // inicializa nomeDoCurso
   } // fim do construtor

   // metodo para configurar o nome do curso
   public void setNomeDoCurso(String nome)
   {
      nomeDoCurso = nomeDoCurso;
   } // fim do metodo setNomeDoCurso

   // metodo para recuperar o nome do curso
   public String getNomeDoCurso()
   {
      return nomeDoCurso;
   } // fim do metodo setNomeDoCurso

   // exibe uma mensagem de boas-vindas ao usuario MediaDaClasse
   public void telaMensagem()
   {
      // getNomeDoCurso obtém o nome do curso
      System.out.printf("Brmvindo ao Livro de Notas de\n%s!\n\n",
              getNomeDoCurso());
   } // fim do metodo telaMensagem

   // determina a média da classe com base em 10 notas inseridas
   public void determinaClasseMedia()
   {
      // cria Scanner para obter entrada da janela de comando
      Scanner input = new Scanner(System.in);
      int total; // soma das notas inseridas ds janela de comando
      int notaContador; // valor da nota inserida pelo usuário
      int nota; // valor da nota inserida pelo usuário
      int media; // média das notas

      // fase de inicialização
      total = 0; // inicializa o total
      notaContador = 1; // inicializa o contador de loops

      // fase de processamento
      while(notaContador <= 10) // faz o loop 10 vezes
      {
         System.out.print("Informe nota: "); //prompt
         nota = input.nextInt(); // insere a proxima nota
         total = total + nota; // adiciona nota a total
         notaContador = notaContador + 1; // incrementa o contador por 1
      } // fim do while

      // fase de termino
      media = total / 10; // divisão de ints produz um int

      // exibe o total e a media das notas
      System.out.printf("\nO total de todas as 10 notas é %d\n", total);
      System.out.printf("Classe media é %d\n", media);
   } // fim do metodo determinaClasseMedia
} // fim da classe MediaDaClasse
