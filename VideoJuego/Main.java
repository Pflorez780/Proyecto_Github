public class Main {
    public static void main(String[] args) {
        //se usa un constructor de 4 parametros porque se conocen todos los datos desde que fue creado
        Enemigo enemigo1 = new Enemigo("Lobos", 100, 15.3, false);
        //se usa un constructor de 2 parametros porque solo se conocen 2 datos del enemigo
        Enemigo enemigo2 = new Enemigo("Polilla", 20);
        enemigo2.Setvelocidad(95);
        enemigo2.Setaereo(true);
        //se usa el constructor de 4 parametros porque  se conoce los distintos datos de el bandido,
        // Después se modifican algunos atributos para adaptar el enemigo al diseño del juego.
        CercanoE bandidos = new CercanoE("Pueblo humano", 10, 50.5, true);
        bandidos.Setnombre("Bandidos");
        bandidos.Setvida(75);
        bandidos.Setvelocidad(25);
        bandidos.Setaereo(false);
        //se usa el constructor de 2 parametros porque es un enemigo que ataca al fondo de la pantalla, con una interaccion situacional
        // Con este conocimiento solo se usa el porcentaje de armadura y si tiene arma o no.
        CercanoE cazadores = new CercanoE(100, true);
        cazadores.Setnombre("Cazadores De la montaña");
        cazadores.Setvida(100);
        cazadores.Setvelocidad(30);
        cazadores.Setaereo(false);
        //Se usa el constructor de 4 parametros diseñado para arqueros, pero se conoce que no ataca cuerpo a cuerpo y el limitante del carcaj.
        DistanciaE arqueroE = new DistanciaE("Arquero de fuego", false, 75, 100);
        arqueroE.Setnombre("Arquero Elemental");
        arqueroE.Setvida(90);
        arqueroE.Setvelocidad(30);
        arqueroE.Setaereo(false);
        //Se usa el constructor de 3 parametros diseñado para magos, pero se conoce su modo de ataque y el alcance de este.
        DistanciaE Hielo = new DistanciaE("Mago de hielo", true, 100);
        Hielo.Setnombre("Mago de hielo");
        Hielo.Setvida(80);
        Hielo.Setvelocidad(25);
        Hielo.Setaereo(false);
        //Se usa el constructor de 3 parametros para jefes de mapa, ademas se conoce el nivel de fuerza y el escudo de este.
        PesadoE Bruto = new PesadoE(false, 50, 375);
        Bruto.Setnombre("Bruto");
        Bruto.Setvelocidad(10);
        //Se usa el constructor de 3 parametros para pesados, conociendose su velocidad, y fuerza de escudo (En este caso piel)
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
