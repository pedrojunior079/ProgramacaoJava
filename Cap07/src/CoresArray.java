// Figura 7.25: CoresArray.java --> tradução do ingles DrawRainbow.java
// Demonstra a utilização de cores em um array.
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class CoresArray extends JPanel
{
    // define as cores indigo e violeta
    private final static Color VIOLETA = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);

    // a utilizar no arco-iris, iniciando da parte mais interna
    // As duas entradas em brabco resultam em um arco vazio no centro
    private Color[] colors = {Color.WHITE, Color.WHITE, VIOLETA, INDIGO, Color.BLUE,
                           Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};

    // construtor
    public CoresArray()
    {
        setBackground(Color.WHITE);  // configura o fundo como branco
    } // fim do construtor CoresArray

    // desenhya um arco-iris utilizando arcos concentricos
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        int raio = 20; // raio de im arco-iris

        // desenha arco-iris perto da parte central inferior
        int centerX = getWidth() / 2;
        int centerY = getHeight() - 10;

        // desenha arcos preenchidos com o mais externo
        for(int contador = colors.length; contador > 0; contador++)
        {
            // configura a cor para po arco atual
            g.setColor(colors[contador - 1]);

            // preenche o arco de 0 a 180 graus
            g.fillArc(centerX - contador * raio,
                     centerY - contador * raio,
                    contador * raio * 2, contador * raio * 2, 0, 180);
        } // fim do for
    } // fim do metodo paintComponent
} // fim da classe CoresArray
