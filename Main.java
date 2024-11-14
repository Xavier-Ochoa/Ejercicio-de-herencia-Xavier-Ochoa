
class Jugador {
    protected String nombre;
    protected int edad;
    protected String equipo;

    public Jugador(String nombre, int edad, String equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Equipo: " + equipo);
    }
}


class Portero extends Jugador {
    private int atajadas;
    private int golesRecibidos;

    public Portero(String nombre, int edad, String equipo, int atajadas, int golesRecibidos) {
        super(nombre, edad, equipo);
        this.atajadas = atajadas;
        this.golesRecibidos = golesRecibidos;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Atajadas: " + atajadas);
        System.out.println("Goles recibidos: " + golesRecibidos);
    }
}


class Defensa extends Jugador {
    private int bloqueos;

    public Defensa(String nombre, int edad, String equipo, int bloqueos) {
        super(nombre, edad, equipo);
        this.bloqueos = bloqueos;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Bloqueos: " + bloqueos);
    }
}


class Delantero extends Jugador {
    public Delantero(String nombre, int edad, String equipo) {
        super(nombre, edad, equipo);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Posición: Delantero");
    }
}


public class Main {
    public static void main(String[] args) {
        Portero portero = new Portero("Luis", 28, "Nacional", 100, 20);
        Defensa defensa = new Defensa("Xavier", 30, "Barcelona", 50);
        Delantero delantero = new Delantero("Jhona", 25, "Liga");

        portero.mostrarInfo();
        System.out.println();
        defensa.mostrarInfo();
        System.out.println();
        delantero.mostrarInfo();
    }
}
