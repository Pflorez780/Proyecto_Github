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
    public String getvida() {
        return vida;
    }
    public String getvelocidad() {
        return velocidad;
    }
    public String aereo() {
        return aereo;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Vida: " + vida + ", Velocidad: " + velocidad + ", Es Aereo: " + aereo;
    }
    
}
