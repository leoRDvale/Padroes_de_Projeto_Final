package Bridge;

public interface Dispositivo {
    boolean isLigado();
    void ligar();
    void desligar();
    int getVolume();
    void setVolume(int volume);
}