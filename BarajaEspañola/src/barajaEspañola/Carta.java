package barajaEspañola;

public class Carta implements Ocupable{
	
		
	private String paloCarta;
	private int numeroCarta;


	public String getPaloCarta() {
		return paloCarta;
	}
	public int getNumeroCarta() {
		return numeroCarta;
	}
	
	public Carta() {
		super();
	}
	
	public Carta(String paloCarta, int numeroCarta) {
		super();
		this.paloCarta = paloCarta;
		this.numeroCarta = numeroCarta;
	}
	
	
	@Override
	public String toString() {
		if (getNumeroCarta()== 10) {
		return "Sota" + " de " + getPaloCarta();
		}
		if (getNumeroCarta()== 11) {
		return "Caballo" + " de " + getPaloCarta();
		}
		if (getNumeroCarta()== 12) {
			return "Rey" + " de " + getPaloCarta();
		}
		return getNumeroCarta() + " de " + getPaloCarta();
	}
	@Override
	public Boolean isOcupado() {
		return getPaloCarta()==null?false:true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroCarta;
		result = prime * result + ((paloCarta == null) ? 0 : paloCarta.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		if (numeroCarta != other.numeroCarta)
			return false;
		if (paloCarta == null) {
			if (other.paloCarta != null)
				return false;
		} else if (!paloCarta.equals(other.paloCarta))
			return false;
		return true;
	}
	
	

}
