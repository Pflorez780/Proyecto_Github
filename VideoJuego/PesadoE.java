public class PesadoE extends Enemigo {
    String tamano = "Desconocido";
    boolean arma = false;
    int escudoV = 0;
    double fuerza = 0.0;

    public PesadoE(){
        super("Desconocido", 0, 0, false);
    }
    public PesadoE(String tamano, boolean arma, int escudoV, double fuerza) {
        super("Pesado Comun", 200, 3.0, false);
        this.tamano = tamano;
        this.arma = arma;
        this.escudoV = escudoV;
        this.fuerza = fuerza;
    }
    public PesadoE( boolean arma, int escudoV, double fuerza) {
        super("Jefe", 1000, 5.0, false);
        this.arma = arma;
        this.escudoV = escudoV;
        this.fuerza = fuerza;
        tamano = "grande";
    }
    public PesadoE(String tamano, int escudoV, double fuerza) {
        super("Mini jefe", 100, 4.0, false);
        this.tamano = tamano;
        this.escudoV = escudoV;
        this.fuerza = fuerza;
        arma = true;
    }
    public String toString(){
    return "PesadoE (nombre: " + getnombre() + ", vida: " + getvida() + ", velocidad: " + getvelocidad() + ", es aereo: " + getaereo() + ", tamaño: " + tamano + ", tiene arma: " + arma + ", escudo vida: " + escudoV + ", fuerza: " + fuerza + ")";
    }
}