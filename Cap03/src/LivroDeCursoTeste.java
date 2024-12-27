// Figura 3.5:LivroDeCurso.java (GradeBook.java)
// Cria objeto LivroDeCurso e passa uma String para
// seu metodo telaMensagem.
import java.util.Scanner; // programa utiliza Scanner

public class LivroDeCursoTeste
{
    // metodo main inicia a execução de programa
    public static void main(String[] args)
    {
        // cria Scanner parav obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        // cria um objeto LivroDeCurso e o atribui a meuLivroDeCruso
        LivroDeCurso meuLivroDeCurso = new LivroDeCurso();

        // prompt para entrada do nome do curso
        System.out.println("Por favor informe o nome do curso:");
        String nomeDoCurso = input.nextLine(); // le uma linha texto
        System.out.println(); // gera saida de uma linha em branco

        // chama metodo telaMensagem de meuLivroDeCurso
        // e passa nomeDoCurso como um argumento
        meuLivroDeCurso.telaMensagem(nomeDoCurso);
    } // fim de main
} // fim da classe LivroDeCurso
