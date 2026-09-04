public class CercanoE extends Enemigo{
    boolean arma;
    int cantidad;
    String zonaM;
    double armaduraP;

    public CercanoE(String zonaM, int cantidad, double armaduraP, boolean arma) {
        super(zonaM, cantidad, armaduraP, arma);
        this.zonaM = zonaM;
        this.cantidad = cantidad;
        this.armaduraP = armaduraP;
        this.arma = arma;
    }

    public CercanoE(String zonaM, int cantidad) {
        super(zonaM, cantidad);
        this.zonaM = zonaM;
        this.cantidad = cantidad;
        this.armaduraP = 50.5;
        this.arma = true;
    }
    public CernacoE(double armaduraP, boolean arma) {
        super(armaduraP, arma);
        this.armaduraP = armaduraP;
        this.arma = arma;
        this.zonaM= "bosque";
        this.cantidad = 5;
    }

    
}
