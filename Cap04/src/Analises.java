//Figura 4.12: Analise.java(Analysis.java)
//Analise dos resultados do exame utilizando instruções de controle aninhadas.
import java.util.Scanner; //classe utiliza a classe Scanner

public class Analises
{
    public static void main(String[] args)
    {
        //cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        int aprovado = 0;
        int reprovado = 0;
        int estudanteContador = 1;

        //processa 10 alunos utilizando o loop controlado por contador
        while(estudanteContador <= 10)
        {
            //solicita ao usuÃ¡rio uma entrada e obtpem valor fornecido pelo usuário
            System.out.print("Entre com resultado (1 = aprovado, 2 = reprovado): ");
            int resultado = input.nextInt();

            //if...else estÃ¡ aninhado na instruÃ§Ã£o while
            if(resultado == 1)
                aprovado = aprovado + 1;
            else
                reprovado = reprovado + 1;

            //incrementa estudanteContador atÃ© o loop terminar
            estudanteContador = estudanteContador + 1;
        }

        //fase de tÃ©rmino; prepara e exibe os resultados
        System.out.printf("Aprovado: %d%nReprovado: %d%n", aprovado, reprovado);

        //determina se mais de 8 alunos foram aprovados
        if(aprovado > 8)
            System.out.println("Bonus do instrutor!");
    }
}
