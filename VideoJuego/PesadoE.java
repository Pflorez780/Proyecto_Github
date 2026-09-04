public class PesadoE extends Enemigo {
    String tamano;
    boolean arma;
    int escudoV;
    double fuerza;

    public PesadoE(String tamano, boolean arma, int escudoV, double fuerza) {
        super("Enemigo", 100);
        this.tamano = tamano;
        this.arma = arma;
        this.escudoV = escudoV;
        this.fuerza = fuerza;
    }
}