// Figura 7.19: ArmazenarNotasTeste.java --> tradução do ingles GradeBookTest.java
// ArmzenarNotasTeste cria o objeto ArmazenarNotas usando um array bidimensional
// das notas, então invoca o metodo processaNotas para analisa-las.

public class ArmazenarNotasTeste
{
    // metodo main inicia a execução de programa
    public static void main(String[] args)
    {
        // array bidimensional de notas de aluno
        int[][] notasArray = {{87, 96, 70},
                              {68, 87, 90},
                              {94, 100, 90},
                              {100, 81, 82},
                              {83, 65, 85},
                              {78, 87, 65},
                              {85, 75, 83},
                              {91, 94, 100},
                              {76, 72, 84},
                              {87, 93, 73}};

        ArmazenarNotas meuArmazenarNotas = new ArmazenarNotas("Introdução a Programação Java", notasArray);
        meuArmazenarNotas.telaMensagem();
        meuArmazenarNotas.processaNotas();
    } // fim de main
} // fim da classe ArmazenarNotasTeste
