public class DistanciaE extends Enemigo {
    String tipoA;
    boolean ataqueC;
    int municion;
    double alcanceM;

    public DistanciaE(String tipoA, boolean ataqueC, int municion, double alcanceM) {
        super("Enemigo", 100);
        this.tipoA = tipoA;
        this.ataqueC = ataqueC;
        this.municion = municion;
        this.alcanceM = alcanceM;
    }
}
