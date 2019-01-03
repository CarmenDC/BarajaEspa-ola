package barajaEspañola;

public class usarBaraja {

	public static void main(String[] args) {

		Baraja barajaEspañola = new Baraja();
		
		barajaEspañola.cartasMonton();
		
//		barajaEspañola.imprimirBaraja();
		
		barajaEspañola.barajarCartas();
		
		barajaEspañola.mostrarBaraja();	

		
		for (int i=0; i<5; i++ ) {
			barajaEspañola.siguienteCarta();
		}
		
		System.out.println("\n"+"El número de cartas que quedan son: " +barajaEspañola.cartasDisponibles()+"\n");

		barajaEspañola.darCartas(2);
		
		barajaEspañola.cartasMonton();
	}

}
