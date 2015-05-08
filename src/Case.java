
public class Case {
	
	private String couleur;
	private int[] coordc = new int[2];
	private MiniPlateau mini;
	

	public Case(int[] coord, MiniPlateau mini){
		this.couleur = "gris";
		this.coordc = coord;
		this.mini = mini;
	}


	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}


	public int[] getCoordc() {
		return coordc;
	}


	public void setCoordc(int[] coordc) {
		this.coordc = coordc;
	}
	
	
	
	
}
