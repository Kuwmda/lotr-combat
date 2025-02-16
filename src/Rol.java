import java.util.Random;
public class Rol {
	private static int dado(int d, int c) {
		Random r = new Random();
		int res = 0;
		for (int i=0; i < d; i++)
			res += r.nextInt(c)+1;
		return res;
	}
	private static void pjAtaca(PJugador pj, Personaje pnj)
	{
		if(pj.getSalud()>0 && pnj.getSalud()>0) {
		System.out.println(pj.getNombre() + " ataca a "+pnj.getNombre());
//Se llama al método atacar de la clase PJugador
		pj.atacar(pnj);
		if (pnj.getSalud()>0) {
			System.out.println(pnj.getNombre() + " recibe "+(pj.getAtaque()*pj.getNivel())+" puntos de daño "+"y tiene "+(pnj.getSalud())+" puntos de vida");
		} else {
			System.out.println(pnj.getNombre() + " ha muerto");
		}
	}
	}
	private static void pnjAtaca(Personaje pnj, PJugador pj) {
		if(pnj.getSalud()>0 && pj.getSalud()>0) {
			System.out.println(pnj.getNombre() + " ataca a "+pj.getNombre());
//Se llama al método defender de la clase PJugador
			pj.defender(pnj);
			if (pj.getSalud()>0) {
				System.out.println(pj.getNombre() + " recibe un ataque de "+pnj.getNombre()+" y tiene "+(pj.getSalud())+" puntos de vida");
			} else {
				System.out.println(pj.getNombre() + " ha muerto");
			}
		}
	}
	public static void main(String[] args) {
		PJugador aragorn = new PJugador("Aragorn", dado(3,100), dado(2,12), dado(1,6), dado(1,4));
		PJugador legolas = new PJugador("Legolas", dado(3,100), dado(2,12), dado(1,6), dado(1,4));
		PJugador gimli = new PJugador("Gimli", dado(3,100), dado(2,12), dado(1,6), dado(1,4));
		Personaje orco = new Personaje("Orco", dado(2,100), dado(1,12));
		Personaje urukhai = new Personaje("Urukhai", dado(2,100), dado(1,12));
		Personaje troll = new Personaje("Troll", dado(2,100), dado(1,12));
		pjAtaca(aragorn,troll);
		pjAtaca(legolas,urukhai);
		pjAtaca(gimli,orco);
		pnjAtaca(troll,aragorn);
		pnjAtaca(urukhai,legolas);
		pnjAtaca(orco,gimli);
		pjAtaca(legolas,troll);
		pjAtaca(gimli,urukhai);
		pjAtaca(aragorn,orco);
		pnjAtaca(troll,legolas);
		pnjAtaca(urukhai,gimli);
		pnjAtaca(orco,aragorn);}}
