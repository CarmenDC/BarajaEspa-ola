package barajaEspañola;

import java.util.ArrayList;
import java.util.Random;


public class Baraja {
	
	private final static int NUMCARTAS =40;
	
	private final static String [] PALOS = {"Oros","Copas","Espadas","Bastos"};
	private final static int[] NUMEROS = {1,2,3,4,5,6,7,10,11,12};
	
	private ArrayList<Carta> baraja = new ArrayList<>(40);

	
	public ArrayList<Carta> getBaraja() {
		return baraja;
	}

	public void setBaraja(ArrayList<Carta> baraja) {
		this.baraja = baraja;
	}

	public Baraja() {
		for(int i = 0; i<4; i++) {
			for(int j = 0; j < 10; j++) {
				baraja.add(new Carta(PALOS[i],NUMEROS[j]));
			}
		}
	}
	
	public void barajarCartas () {
		Random random = new Random();
		ArrayList<Carta> barajaAux = new ArrayList<>(40);
		int numCartas = 0;
		int tamañoBaraja = baraja.size();
		Carta proximaCarta = new Carta();
		while (numCartas<NUMCARTAS&&tamañoBaraja>0) {
			int indice = random.nextInt(tamañoBaraja);
			proximaCarta = baraja.get(indice);
			barajaAux.add(proximaCarta);
			baraja.remove(proximaCarta);
			tamañoBaraja--;
			numCartas++;
			
		}		
		setBaraja(barajaAux);
	}
	
	public void siguienteCarta() {
		if (baraja.isEmpty()) {
		System.out.println ("No hay más cartas");	
		}
		else {
		System.out.println ("La siguiente carta es: " + baraja.get(0));
		baraja.remove(0);
		}
	}
	
	
	public void mostrarBaraja() {
		for(Carta carta:baraja) {
			System.out.println (carta.toString());	
			}
		}	
	
	public int cartasDisponibles() {
		return baraja.size();		
	}

	public void darCartas(int numCartas){
		if (numCartas>baraja.size()) {
			System.out.println("No hay suficientes cartas");
		}
			else {
			for(int i = 0; i<=numCartas;i++) {
				siguienteCarta();
			}
		}
	}
	
	public void cartasMonton() {
		Baraja barajaAux = new Baraja();
		if(barajaAux.baraja.size()==baraja.size()) {
			System.out.println ("No ha salido ninguna carta");	
		}
		else {
			for (Carta carta: baraja) {
				for (Carta cartaAux: barajaAux.baraja) {
					if (carta.equals(cartaAux)){
						barajaAux.baraja.remove(cartaAux);
						break;
					}
				}
			}
			System.out.println ("Las cartas que han salido son: ");
			barajaAux.mostrarBaraja();
		}
	}
	
}
