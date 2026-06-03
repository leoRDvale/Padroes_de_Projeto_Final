package Bridge;

public class ControleAvancado extends Controle {

    public ControleAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void mutar() {
        System.out.println("Controle Avançado: Ativando Mudo");
        dispositivo.setVolume(0);
    }
}
