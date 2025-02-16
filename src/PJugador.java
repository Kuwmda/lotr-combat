public class PJugador extends Personaje implements Guerrero {
    private int edad;
    private int ataque;
    private int defensa;

    public PJugador(String nombre, int salud, int nivel, int ataque, int defensa) {
        super(nombre, salud, nivel);
        this.edad = 0;
        this.ataque = ataque;
        this.defensa = defensa;
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void atacar(Personaje objetivo) {
        int danio = this.ataque * this.getNivel(); // Calcula el daño como el ataque del jugador multiplicado por su nivel
        int saludObjetivo = objetivo.getSalud();

        if (danio >= saludObjetivo) {
            // Si el daño es igual o superior a la salud del objetivo, lo hace morir
            objetivo.setSalud(0);
        } else {
            // Si no, reduce la salud del objetivo
            saludObjetivo -= danio;
            objetivo.setSalud(saludObjetivo);
        }
    }

    public void defender(Personaje atacante) {
        int danio = atacante.getNivel() - this.defensa; // Calcula el daño como el nivel del atacante menos la defensa del jugador
        if (danio > 0) {
            int salud = this.getSalud();
            salud -= danio;
            if (salud < 0) {
                salud = 0;
            }
            this.setSalud(salud);
        }
    }

}


