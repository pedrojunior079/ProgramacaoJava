// Figura 7.18: ArmazenarNotas.java --> tradução do ingles GradeBook.java
// classe GradBook com um array bidimensional para aermazenar notas

public class ArmazenarNotas
{
    private String nomeCurso; // nome do curso que eeste livro de notas representa
    private int[][] notas; // array bidimensional de notas de aluno

    // construtor de dosi argumentos inicializa nomeCurso e arrayDeNotas
    public ArmazenarNotas(String nome, int[][] notasArray)
    {
        nomeCurso = nome; // inicialia nomeCurso
        notas = notasArray; // niveis de armazenamento
    } // fim do construtor ArmazenamentoNotas de dois argumentos

    // metodo para recuperar o nome do curso
    public String getNomeCurso()
    {
        return nomeCurso;
    } // fim do metodo getNomeDoCurso

    // metodo para configurar o nome do curso
    public void setNomeCurso(String nome)
    {
        nomeCurso = nome;
    } // fim do metodo setNomeDoCurso

    // exibe uma mensagem de boas-vindas para o usuario ArmazenarNotas
    public void telaMensagem()
    {
        // getNomeCurso obtém o nome do curso
        System.out.printf("Bem vindo ao nome do curso de\n%s!\n\n", getNomeCurso());
    } // fim do metodo telaMensagem

    // realiza varias operações nos dados
    public void processaNotas()
    {
        // gera saída de array de notas
        saidaNotas();

        // chama metodos getMinimo e getMaximo
        System.out.printf("\n%s %d\n%s %d\n\n",
                "A nota mais baixa do livro de notas é", getMinimo(),
                "A nota mais alta do livro de notas é", getMaximo());

        // gera saida de grafico de distribuição de notas de todas as notas em todos os teste
        saidaGraficoDeBarras();
    } // fim do metodo processaNotas

    // localiza nota minima
    public int getMinimo()
    {
        // assume que o primeiro elemento de array de notas é o menor
        int menorNota = notas[0][0];

        // faz um loop pelas linhas do array de notas
        for(int[] estudanteClasses : notas)
        {
            // faz um loop pelas colunas da linha atual
            for(int notas: estudanteClasses)
            {
                // se a nota for menor que menorNota, atribui a nota a menorNota
                if(notas < menorNota)
                   menorNota = notas;
            } // fim do for interno
        } // fim do for externo

        return menorNota; // retorna nota mais baixa
    } // fim do metodo geMinimo

    // localiza nota maxima
    public int getMaximo()
    {
        // assume que o primeiro elemento de array de notas é o maior
        int maiorNota = notas[0][0];

        // faz um loop pelas linhas do array de notas
        for(int[] estudanteClasses : notas)
        {
            // faz um loop pelas colunas da linha atual
            for(int nota : estudanteClasses)
            {
                // se a nota fort maior que maiorNota, atribui essa nota a maiorNota
                if(nota > maiorNota)
                   maiorNota = nota;
            } // fim do for interno
        } // fim do for externo

        return maiorNota; // retorna nota mais alta
    } // fim do metodo getMaximo

    // determina a média do conjunto de partucular de notas
    public double getMedia(int[] conjuntoDeNotas)
    {
        int total = 0; // inicializa o total

        // soma notas de um aluno
        for(int  nota : conjuntoDeNotas)
            total += nota;

        // retorna média de notas
        return (double) total / conjuntoDeNotas.length;
    } // fim do metodo getMedia

    // gera saida do grafico de barras para exibir distribuição total de notas
    public void saidaGraficoDeBarras()
    {
        System.out.println("Distribuição global das notas:");

        // armazena frequencia de notas em cada intervalo de 10 notas
        int[] frequencia = new int[11];

        // para cada nota em ArmazanarNotas, incrementa a freuquencia certa
        for(int[] estudanteNotas : notas)
        {
            for(int nota : estudanteNotas)
                ++frequencia[nota / 10];
        } // fim do for externo

        // para cada frequencia de nota, imprime barra no grafico
        for(int contador = 0; contador < frequencia.length; contador++)
        {
            // imprime rotulo de barra ("00-09: ", ..., "90-99: ", "100: ")
            if(contador == 10)
               System.out.printf("%5d: ", 100);
            else
               System.out.printf("%02d-%02d: ", contador * 10, contador * 10 + 9);

            // imprima a barra de asterisco
            for(int estrelas = 0; estrelas < frequencia[contador]; estrelas++)
                System.out.print("*");

            System.out.println(); // inicia uma nova linha de saida
        } // fim do for externo
    } // fim do metodo saidaGraficoDeBarras

    // gera a saida do conteudo do array de notas
    public void saidaNotas()
    {
        System.out.println("As notas são as seguintes:\n");
        System.out.print("                      "); // alinha titulos de coluna

        // cria um titulo de coluna para cada um dos testes
        for(int teste = 0; teste < notas[0].length; teste++)
            System.out.printf("Teste %d ", teste + 1);

        System.out.println("Media"); //titulo da coluna de média do aluno

        // cria linhas/colunas de texto que representam notas de array
        for(int estudante = 0; estudante < notas.length; estudante++)
        {
            System.out.printf("Estudante %2d", estudante + 1);

            for(int teste :  notas[estudante]) // gera saida de notas deo aluno
                System.out.printf("%8d", teste);

            // chama metodo getMedia para calcular a média do aluno;
            // passa linha de notas como o argumento para getMedia
            double media = getMedia(notas[estudante]);
            System.out.printf("%9.2f\n", media);
        } // fim do for externo
    } // fim do metodo saidaNotas
} // fim da classe InicializaArraysBidimensionais
