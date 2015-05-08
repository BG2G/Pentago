
public class Plateau {

	private MiniPlateau[][] plateau = new MiniPlateau[2][2];
	private Partie partie;

	public Plateau(Partie partie) {
		this.partie = partie;
		for(int i = 0; i<2; i++){
			for(int j = 0; j<2; j++){
				int list[]={i,j};
				this.plateau[i][j] = new MiniPlateau(list,this);	
			}
		}

	}

	public void rotation(String sens, int[] coord){
		if(coord[1] == 1){
			int i=1;
			if(coord[2]==1){
				int j=1;
				if(sens.equals("gauche")){
					plateau[i][j].rotGauche();
				}else{

				}
			}else{
				int j=2;
				plateau[i][j].rotGauche();
			}
		}else{
			int i=2;
			if(coord[2]==1){
				int j=1;
				if(sens.equals("gauche")){
					plateau[i][j].rotGauche();
				}else{

				}
			}else{
				int j=2;
				plateau[i][j].rotGauche();
			}
		}
	}

	public MiniPlateau[][] getPlateau() {
		return plateau;
	}

	public void setPlateau(MiniPlateau[][] plateau) {
		this.plateau = plateau;
	}





}
