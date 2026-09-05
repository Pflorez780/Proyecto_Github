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
        cazadores.Setnombre("Cazadores De la montaña");
        cazadores.Setvida(100);
        cazadores.Setvelocidad(30);
        cazadores.Setaereo(false);
        DistanciaE arqueroE = new DistanciaE("Arquero de fuego", false, 75, 100);
        arqueroE.Setnombre("Arquero Elemental");
        arqueroE.Setvida(90);
        arqueroE.Setvelocidad(30);
        arqueroE.Setaereo(false);
        DistanciaE Hielo = new DistanciaE("Mago de hielo", true, 100);
        Hielo.Setnombre("Mago de hielo");
        Hielo.Setvida(80);
        Hielo.Setvelocidad(25);
        Hielo.Setaereo(false);
        PesadoE Bruto = new PesadoE(false, 50, 375);
        Bruto.Setnombre("Bruto");
        Bruto.Setvelocidad(10);
        PesadoE Golem = new PesadoE("Pequeno", 400, 25);
        Golem.Setnombre("Golem");
        Golem.Setvelocidad(5);
        System.out.println("======= PRUEBA DE OBJETOS =======");

        System.out.println("Enemigo 1:  " + enemigo1);
        System.out.println("---------------------------------------");
        System.out.println("Enemigo 2:  " + enemigo2);
        System.out.println("---------------------------------------");
        System.out.println("Enemigo 3:  " + bandidos);
        System.out.println("---------------------------------------");
        System.out.println("Enemigo 4:  " + cazadores);
        System.out.println("---------------------------------------");
        System.out.println("Enemigo 5:  " + arqueroE);
        System.out.println("---------------------------------------");
        System.out.println("Enemigo 6:  " + Hielo);
        System.out.println("---------------------------------------");
        System.out.println("Enemigo 7:  " + Bruto);
        System.out.println("---------------------------------------");
        System.out.println("Enemigo 8:  " + Golem);


        
    }
}
