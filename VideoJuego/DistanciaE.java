public class DistanciaE extends Enemigo {
    String tipoA;
    boolean ataqueC;
    int municion;
    double alcanceM;

    public DistanciaE(String tipoA, boolean ataqueC, int municion, double alcanceM) {
        super("Arquero", 100, 10.5, false);
        this.tipoA = tipoA;
        this.ataqueC = ataqueC;
        this.municion = municion;
        this.alcanceM = alcanceM;
    }
    public DistanciaE(String tipoA, int municion, double alcanceM) {
        super("Militar", 115, 12.0, false);
        this.tipoA = tipoA;
        ataqueC = true;
        this.municion = municion;
        this.alcanceM = alcanceM;

    }
    public DistanciaE(String tipoA, boolean ataqueC , double alcanceM) {
        super("Mago", 100, 8.5, true);
        this.tipoA = tipoA;
        this.ataqueC = ataqueC;
        this.alcanceM = alcanceM;

    }

    public String toString(){
    return "DistanciaE (tipo de ataque: " + tipoA + ", ataque cuerpo a cuerpo?: " + ataqueC
    + ", cantidad de municion: " + municion + ", alcance del ataque: " + alcanceM + ", nombre: " + getnombre() + ", vida: " + getvida()
    + ", velocidad: " + getvelocidad() + ", es aereo?: " + aereo() + ")";
    }
}
