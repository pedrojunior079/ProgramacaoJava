// Figura 4.7: MediaDaClasseTeste.java(GradeBookTest.java)
// Cria o objeto da classe MediaClasseTeste e invoca seu metodo
// determinaClasseMedia

public class MediaDaClasseTeste
{
    public static void main(String[] args)
    {
        // cria o objeto minhaMediaDaClasse classe MediaDaClasse e
        // passa o nome de cursor para o construtor
        MediaDaClasse minhaMediaDaClasse = new MediaDaClasse("CS101 Introdução a Programação Java");

        minhaMediaDaClasse.telaMensagem(); // exibe a mensagem de boas vindas
        minhaMediaDaClasse.determinaClasseMedia(); // calcula a média das 10 notas
    } // fim de main
} // fim da classe MediaDaClasseTeste
