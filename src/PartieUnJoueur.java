
public class PartieUnJoueur extends Partie {


	private Joueur player;
	
	public PartieUnJoueur(Joueur joueur){
		super();
		player = joueur;
	}

	public Joueur getPlayer() {
		return player;
	}

	public void setPlayer(Joueur player) {
		this.player = player;
	}
	
}
