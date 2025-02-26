//Figura 5.1:WhileContador.java
//Repeticao controlada por contador com a instrucao de repeticao while.

public class WhileContador
{
    public static void main(String[] args)
    {
        int contador = 1; //declara e inicializa a variavel de controle
        while(contador <= 10) //condicao de continuacao do loop
        {
            System.out.printf("%d ", contador);
            ++contador; //variavel de controle de incremento
        } // fim do while

        System.out.println();
    } // fim de main
} // fim da classe WhileContador
