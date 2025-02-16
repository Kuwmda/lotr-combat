import java.util.Random;

public class Personaje {
    // Atributos privados
    private String nombre;
    private int salud;
    private int nivel;

    // Constructor público para inicializar todos los atributos
    public Personaje(String nombre, int salud, int nivel) {
        this.nombre = nombre;
        this.salud = salud;
        this.nivel = nivel;
    }

    // Sobrecarga del constructor para incluir un atributo opcional
    public Personaje(String nombre, int salud, int nivel, int edad) {
        this(nombre, salud, nivel);
        // Llama al constructor principal

    }

    // Método para lanzar un dado con un número específico de caras y repetirlo un número específico de veces
    public static int dado(int d, int c) {
        Random r = new Random();
        int res = 0;
        for (int i = 0; i < d; i++) {
            res += r.nextInt(c) + 1;
        }
        return res;
    }

    // Getters y Setters públicos de todos los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {

        if (salud < 0) {
            salud = 0;
        }
        return salud;
    }
    public void setSalud(int salud) {
        this.salud = salud;
    }


    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
