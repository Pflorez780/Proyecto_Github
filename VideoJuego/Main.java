public class Main {
    public static void main(String[] args) {
        Enemigo enemigo1 = new Enemigo("Lobos", 100, 15.3, false);
        Enemigo enemigo2 = new Enemigo("Polilla", 20);
        enemigo2.Setvelocidad(95);
        enemigo2.Setaereo(true);
        CercanoE bandidos = new CercanoE("Pueblo humano", 10, 50.5, true);
        bandidos.Setnombre("Bandidos");
        bandidos.Setvida(75);
        bandidos.Setvelocidad(25);
        bandidos.Setaereo(false);
        CercanoE cazadores = new CercanoE(100, true);
        cazadores.Setnombre("Cazadores");
        cazadores.Setvida(100);
        cazadores.Setvelocidad(30);
        cazadores.Setaereo(false);
    }
}
