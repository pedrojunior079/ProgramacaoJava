// Figura 8.1: Hora1.java --> tradução do ingles Time1.java
// Decflaração de classe Hora1 mantém a hora no formato de 24 horas.

public class Hora1
{
    private int hora;  // 0 - 23
    private int minuto; // 0 - 59
    private int segundo; // 0 - 59

    // configura um valor de hora usando formato universal;
    // assegura que dados permaneçam consistentes configurando valores invalidos como zero
    public void setHora(int h, int m, int s)
    {
        hora = ((h >= 0 && h < 24) ? h : 0); // valida hora
        minuto = ((m >= 0 && m < 60) ? m : 0); // valida minutos
        segundo = ((s >=0 && s < 60) ? s : 0); // valida segundos
    } // fim do metodo setHora

    // converte em String no formato de hora universal (HH:MM:SS)
    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d %s", hora, minuto, segundo);
    } // fim do metodo do toUniversalString

    // converte em String no formato padrão hora (H:MM:SS AM ou PM)
    public String toString()
    {
        return String.format("%d:%02d:%02d %s",
                ((hora == 0 || hora == 12) ? 12 : hora % 12),
                minuto, segundo, (hora < 12 ? "AM" : "PM"));
    } // fim do metodo toString
} // fim da classe Hora1

