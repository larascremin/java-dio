package sintaxe.metodos;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentar() {
        volume++;
    }

    public void diminuir() {
        volume--;
    }

    public void subirCanal() {
        canal++;
    }

    public void descerCanal() {
        canal++;
    }

    public void escolherCanal(int novoCanal) {
        canal = novoCanal;
    }
}
