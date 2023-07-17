import java.util.Scanner;

public class SmartTv {

    boolean  ligada = false;

    int canal = 1;
    int volume = 25;

    public void aumentarVolume () {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void diminuirVolume () {
        if (volume > 0) {
            volume = volume - 1;
        }
    }

    public void aumentarCanal () {
        if (canal < 400) {
            canal = canal + 1;
        } else canal  = 1;
    }

    public void diminuirCanal () {
        if (canal > 0) {
            canal = canal - 1;
        } else canal = 400;
    }

    public void mudarCanal() {
        Scanner ler = new Scanner(System.in);
        canal = ler.nextInt();
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}
