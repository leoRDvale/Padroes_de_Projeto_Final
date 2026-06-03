package Bridge;


public class Main {
    public static void main(String[] args) {
        Dispositivo tv = new TvSamsung();

        System.out.println("--- Testando Controle Básico ---");
        Controle controleBasico = new Controle(tv);
        controleBasico.botaoEnergia();
        controleBasico.aumentarVolume();

        System.out.println("\n--- Testando Controle Avançado ---");
        ControleAvancado controleAvancado = new ControleAvancado(tv);
        controleAvancado.mutar();
        controleAvancado.botaoEnergia();
    }
}