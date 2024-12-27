// Figura 3.7: CadernoDeNotas.java (GradeBook.java)
// classe GradeBook que contem uma variavel de instancia
// courseName e metodos para configurar e obter seu valor.

public class CadernoDeNotas
{
    private String nomeDoCurso; // nome do curso para esse CadernoDeNotas

    // metodo para configurar o nome do curso
    public void setNomeDoCurso(String nome)
    {
        nomeDoCurso = nome; // armazena o nome do curso
    } // fim do metodo setNomeDoCurso

    // metodo para recuperar o nome do curso
    public String getNomeDoCurso()
    {
        return nomeDoCurso;
    } // fim do metodo getNomeDoCurso

    // exibe uma mensagem de boas-vindas para o usuario CadernoDeNotas
    public void telaMensagem()
    {
        // chama getNomeDoCurso para obter o nome do
        // o curso que esse CadernoDeNotas representa
        System.out.printf("Bem-vindo ao livro de notas de\n%s!\n", getNomeDoCurso());
    } // fim do metodo telaMensagem
} // fim da classe CadernoDeNotas
