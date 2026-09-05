public class Enemigo {
    private String nombre;
    private int vida;
    private double velocidad;
    private boolean aereo;

    public Enemigo(String nombre, int vida, double velocidad, boolean aereo) {
        this.nombre = nombre;
        this.vida = vida;
        this.velocidad = velocidad;
        this.aereo = aereo;
    }

    public Enemigo(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
        velocidad = 100.2;
        aereo =true;
    }

    public Enemigo(double velocidad, boolean aereo) {
        this.velocidad = velocidad;
        this.aereo = aereo;
    }

    
    public String getnombre() {
        return nombre;
    }
    public int getvida() {
        return vida;
    }
    public double getvelocidad() {
        return velocidad;
    }
    public boolean getaereo() {
        return aereo;
    }
    public String Setnombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }
    public int Setvida(int vida) {
        this.vida = vida;
        return vida;
    }
    public double Setvelocidad(double velocidad) {
        this.velocidad = velocidad;
        return velocidad;
    }
    public boolean Setaereo(boolean aereo) {
        this.aereo = aereo;
        return aereo;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Vida: " + vida + ", Velocidad: " + velocidad + ", Es Aereo: " + aereo;
    }
    
}
