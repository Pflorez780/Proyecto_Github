public class CercanoE extends Enemigo{
    boolean arma;
    int cantidad;
    String zonaM;
    double armaduraP;

    public CercanoE(String zonaM, int cantidad, double armaduraP, boolean arma) {
        super("bandidos", 100, 15.3, false);
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
    return "CercanoE (zona de movimiento: " + zonaM + ", cantidad: " + cantidad
    + ", armadura promedio: " + armaduraP + ", tiene arma?: " + arma + ", nombre: " + getnombre() + ", vida: " + getvida()
    + ", velocidad: " + getvelocidad() + ", es aereo?: " + getaereo() + ")";
    }
    
}
