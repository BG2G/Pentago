
public class Partie {
	
	private Plateau plateau;
	private String tour;
	private Boolean victoire = false;


public Partie(){
	
	plateau = new Plateau(this);
	tour = "blanc";
	
}



public Plateau getPlateau() {
		return plateau;
	}

	public void setPlateau(Plateau plateau) {
		this.plateau = plateau;
	}



	public String getTour() {
		return tour;
	}



	public void setTour(String tour) {
		this.tour = tour;
	}



	public Boolean getVictoire() {
		return victoire;
	}



	public void setVictoire(Boolean victoire) {
		this.victoire = victoire;
	}
	
}
