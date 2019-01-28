package tp01;
class Livre {
	// les attributs de la classe
	String auteur;
	String titre;
	int annee;
	// un constructeur
	Livre(String a, String t, int an) {
		auteur = a;
		titre = t;
		annee = an;
	}
	// les méthodes
	String getAuteur() {
		return auteur;
	}
	String getTitre() {
	return titre;
	}
}
