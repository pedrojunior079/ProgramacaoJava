// Figura 4.10: LivroDeNotasTeste.java(GradeBookTest.java)
// Cria o objeto da classe LivroDeNotas e invoca seu metodo determinaClasseMedia

public class LivroDeNotasTeste
{
    public static void main(String[] args)
    {
        // cria o objeto meuLivroDeNotas classe LivroDeNotas e
        // passa o nome de cursor para o construtor
        LivroDeNotas meuLivroDeNotas = new LivroDeNotas("CS101 Introdução a Programação Java");

        meuLivroDeNotas.telaMensagem(); // exibe a mensagem de boas vindas
        meuLivroDeNotas.determinaClasseMedia(); // calcula a média
    } // fim de main
} // fim da classe LivroDeNotasTeste
