// Figura 3.8: CadernoDeNotasTeste.java (GradeBookTest.java)
// Criando e manipulando um objeto CadernoDeNotas.
import java.util.Scanner; // programa utiliza Scanner

public class CadernoDeNotasTeste
{
    // metodo main inicia a execução de programa
    public static void main(String[] args)
    {
        // cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        // cria um objeto CadernoDeNotas e o atribui a meuCadernoDeNotas
        CadernoDeNotas meuCadernoDenotas = new CadernoDeNotas();

        // exibe valor inicial de nomeDoCurso
        System.out.printf("O nome inicial do curso é: %s\n\n",
                meuCadernoDenotas.getNomeDoCurso());

        // solicita e le o nome do curso
        System.out.println("Por favor informe o nome do curso:");
        String nome = input.nextLine(); // le uma linha de texto
        meuCadernoDenotas.setNomeDoCurso(nome); // configura o nome do curso
        System.out.println(); // gera saida de uma linha em branco
        // exibe mensagem de boas-vindas depois de especificar o
        // nome do curso
        meuCadernoDenotas.telaMensagem();
    } // fim de main
} // fim da classe CadernoDeNotasTeste
