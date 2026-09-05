public class CercanoE extends Enemigo{
    boolean arma = false;
    int cantidad = 0;
    String zonaM = "Desconocida";
    double armaduraP = 0.0;

    public CercanoE(){
        super("Desconocido", 0, 0, false);
    }
    public CercanoE(String zonaM, int cantidad, double armaduraP, boolean arma) {
        super("Bandidos", 100, 75, false);
        this.zonaM = zonaM;
        this.cantidad = cantidad;
        this.armaduraP = armaduraP;
        this.arma = arma;
    }

    public CercanoE(String zonaM, int cantidad) {
        super("Insecto", 25, 20.0, true);
        this.zonaM = zonaM;
        this.cantidad = cantidad;
        this.armaduraP = 50.5;
        this.arma = true;
    }
    public CercanoE(double armaduraP, boolean arma) {
        super("Aves", 50, 30.0, true);
        this.armaduraP = armaduraP;
        this.arma = arma;
        this.zonaM= "bosque";
        this.cantidad = 5;
    }
    public String toString(){
    return "CercanoE (nombre: " + getnombre() + ", vida: " + getvida() + ", velocidad: " + getvelocidad() + ", es aereo: " + getaereo() + "zona de movimiento: " + zonaM + ", cantidad: " + cantidad
    + ", armadura promedio: " + armaduraP + ", tiene arma?: " + arma + ")";
    }
    
}
