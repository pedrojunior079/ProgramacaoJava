// Figura 4.9: LivroDeNotas.java(GradeBook.java)
// Classe LivroDeNotas que resolve o programa da média da classe
// utilizando repetições controlada pro sentinela.
import java.util.Scanner;  // programa urtiliza a classe Scanner

public class LivroDeNotas
{
    private String nomeDoCurso; // nome do cruso que esse LivroDeNotas representa

    // construtor inicializa nomeCurso
    public LivroDeNotas(String nome)
    {
        nomeDoCurso = nome; // inicializa nomeDoCurso
    } // fim do construtor

    // metodo para configurar o nome do curso
    public void setNomeDoCurso(String nome)
    {
        nomeDoCurso = nomeDoCurso; // armazena o nome do curso
    } // fim do metodo setNomeDoCurso

    // metodo para recuperar o nome do curso
    public String getNomeDoCurso()
    {
        return nomeDoCurso;
    } // fim do metodo setNomeDoCurso

    // exibe uma mensagem de boas-vindas para o usuário LivroDeNotas
    public void telaMensagem()
    {
        // getNomeDoCurso obtém o nome do curso
        System.out.printf("Brmvindo ao Livro de Notas de\n%s!\n\n",
                getNomeDoCurso());
    } // fim do metodo telaMensagem

    // determina a média de um numero arbitrario de notas
    public void determinaClasseMedia()
    {
        // cria Scanner para obter entrada da janela de comando
        Scanner input = new Scanner(System.in);
        int total; // soma das notas
        int notaContador; // valor da nota inserida
        int nota; // valor da nota
        double media; // numero com ponto de fração decimal para a media

        // fase de inicialização
        total = 0; // inicializa o total
        notaContador = 0; // inicializa o contador de loops

        // fase de processamento
        // solicita entrada e le a nota do usuário
        System.out.print("Digite a nota ou -1 para sair: ");
        nota = input.nextInt();

        // faz o loop até ler o valor de sentinela inserido pelo usuario
        while(nota != -1)
        {
            total = total + nota; // adiciona nota a total
            notaContador = notaContador + 1; // incrementa contador

            // solicita entrada e le a proxima nota fornecida pelo usuario
            System.out.print("Digite a nota ou -1 para sair: "); //prompt
            nota = input.nextInt(); // insere a proxima nota
        } // fim do while

        // fase de termino
        // se usuario inserio pelo menos uma nota...
        if(notaContador !=0)
        {
            // calcula a media de todas as notas inseridas
            media = (double) total/notaContador;

            // exibe o total e a media (com 2 digitos de precisão)
            System.out.printf("\nO total de %d notas inseridas é %d\n",
                    notaContador, total);
            System.out.printf("Classe media é %.2f\n", media);
        } // fim do if
        else // nehuma nota foi inserida, então gera mensagem apropriada
           System.out.println("Nenhuma nota foi inserida");
    } // fim do metodo determinaClasseMedia
} // fim da classe LivroDeNotas
