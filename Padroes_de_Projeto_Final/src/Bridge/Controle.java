package Bridge;

public class Controle {
    protected Dispositivo dispositivo;

    public Controle(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void botaoEnergia() {
        if (dispositivo.isLigado()) {
            dispositivo.desligar();
        } else {
            dispositivo.ligar();
        }
    }

    public void aumentarVolume() {
        dispositivo.setVolume(dispositivo.getVolume() + 10);
    }

    public void diminuirVolume() {
        dispositivo.setVolume(dispositivo.getVolume() - 10);
    }
}