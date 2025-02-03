// Figura 7.26: CoresArrayTeste.java --> tradução do ingles DrawRainbowTest.java
// Aplicativo de testepara exibir um arco-iris
import javax.swing.JFrame;

public class CoresArrayTeste
{
    public static void main(String[] args)
    {
       CoresArray panel = new CoresArray();
       JFrame aplicacao = new JFrame();
       aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       aplicacao.add(panel);
       aplicacao.setSize(400, 250);
       aplicacao.setVisible(true);
    } // fim de main
} //fim da classe CoresArrayTeste
