package Bridge;

public class TvSamsung implements Dispositivo {
    private boolean ligado = false;
    private int volume = 30;

    @Override
    public boolean isLigado() { return ligado; }

    @Override
    public void ligar() { ligado = true; System.out.println("TV Samsung: Ligada"); }

    @Override
    public void desligar() { ligado = false; System.out.println("TV Samsung: Desligada"); }

    @Override
    public int getVolume() { return volume; }

    @Override
    public void setVolume(int volume) { this.volume = volume; System.out.println("TV Samsung: Volume alterado para " + volume); }
}
