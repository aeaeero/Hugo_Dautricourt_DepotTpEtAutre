package tp01;

public class EssaiIrregulier {

	public static void main(String[] args) {
		Irregulier structure = new Irregulier(new int[]{10,3,4,7});
		structure.remplissageAleatoire();
		System.out.println(structure.affichage());
	}

}
