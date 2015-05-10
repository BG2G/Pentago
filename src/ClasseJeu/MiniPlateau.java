package ClasseJeu;

public class MiniPlateau {
	
	private Case[][] mplateau = new Case[3][3];
	private int[] coordmp = new int[2];
	private Plateau plateau;
	
	
	public MiniPlateau(int[] coordmp, Plateau plateau) {
		
		this.coordmp = coordmp;
		this.plateau=plateau;
		
		for(int i = 0; i<3; i++){
			for(int j = 0; j<3; j++){
				int list[]={i,j};
				this.mplateau[i][j] = new Case(list,this);
			}
		}
		
		
		
	}

	
	public void rotDroite(){
		Case[][] tampon = new Case[3][3];
		for(int i = 0;i<3;i++){
			for(int j = 0; j<3;j++){
				tampon[j][2-i]=this.mplateau[i][j];
			}
		}
		this.mplateau=tampon;
	}
	
	public void rotGauche(){
		Case[][] tampon = new Case[3][3];
		for(int i = 0;i<3;i++){
			for(int j = 0; j<3;j++){
				tampon[2-j][i]=this.mplateau[i][j];
			}
		}
		this.mplateau=tampon;
	}


	public Case[][] getMplateau() {
		return mplateau;
	}



	public void setMplateau(Case[][] mplateau) {
		this.mplateau = mplateau;
	}



	public int[] getCoordmp() {
		return coordmp;
	}



	public void setCoordmp(int[] coordmp) {
		this.coordmp = coordmp;
	}

	
	
	
}
