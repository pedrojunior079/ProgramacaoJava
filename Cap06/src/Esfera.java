// Exercicio 6.6: Esfera.java --> tradução do ingles Sphere.java
// Calcula o vulume de uma esfera.
import java.util.Scanner;

public class Esfera {
    // obtém o raio a parti do usuario e exibe o volume da esfera
    public void determinaVolumeDaEsfera() {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o raio da esfera: ");
        double raio = input.nextDouble();

        System.out.printf("Volume é %f\n", volumeEsfera(raio));
    } // fim do metodo determinaVolumeEsfera

    // calcula e retorna o volume de esfera
    public double volumeEsfera(double raio) {
        double volume = (4.0) / 3.0 * Math.pow(raio, 3);
        return volume;
    } // fim do metodo volumeEsfera
} // fim da classe Esfera
