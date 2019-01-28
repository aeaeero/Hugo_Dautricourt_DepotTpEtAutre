package tp01;

public class Irregulier {
	int[][] tab;
	
	
	Irregulier(int[] tailleLigne){
		tab = new int[tailleLigne.length][];
		for(int idx=0;idx<tailleLigne.length;idx ++){
			tab[idx]= new int[tailleLigne[idx]];
		}
	}
	
	void remplissageAleatoire() {
		for(int idx=0;idx<tab.length;idx ++) {
			int[] tmp = tab[idx];
			for(int cpt=0;cpt<tmp.length;cpt++) {
				tmp[cpt]=((int) (Math.random()*10));
			}
			tab[idx]=tmp;
		}
	}
	
	String affichage() {
		String result = "";
		for(int idx=0;idx<tab.length;idx ++) {
			int[] tmp = tab[idx];
			for(int cpt=0;cpt<tmp.length;cpt ++) {
				result += tmp[cpt] + " | ";
			}
			result += "\n";
		}
		return result;
	}
	
	// est_commun à faire
}
