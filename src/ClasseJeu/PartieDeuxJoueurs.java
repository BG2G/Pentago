package ClasseJeu;

public class PartieDeuxJoueurs extends Partie{
	

	private Joueur JoueurNoir;
	private Joueur JoueurBlanc;

	public PartieDeuxJoueurs(Joueur blanc, Joueur noir){
		super();
		JoueurBlanc = blanc;
		JoueurNoir = noir;
	}

	
	public Joueur getJoueurNoir() {
		return JoueurNoir;
	}

	public void setJoueurNoir(Joueur joueurNoir) {
		JoueurNoir = joueurNoir;
	}

	public Joueur getJoueurBlanc() {
		return JoueurBlanc;
	}

	public void setJoueurBlanc(Joueur joueurBlanc) {
		JoueurBlanc = joueurBlanc;
	}
	
}
