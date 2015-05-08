
public class Partie {
	
	private Plateau plateau;

public Plateau getPlateau() {
		return plateau;
	}

	public void setPlateau(Plateau plateau) {
		this.plateau = plateau;
	}

public Partie(){
	
	plateau = new Plateau(this);
	
}
	
}
