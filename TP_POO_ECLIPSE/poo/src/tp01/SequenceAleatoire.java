package tp01;

public class SequenceAleatoire {

	public static void main(String[] args) {
		int nbElt = Integer.parseInt(args[0]);
		int maxVal = Integer.parseInt(args[1]);
		String typeVal = "ENTIER";
		if (args.length==2) { typeVal = "ENTIER"; }
		else { typeVal = args[2]; }

		if(!typeVal.equals("ENTIER") && !typeVal.equals("REEL")) {
			System.out.println("Utilisation incorrecte: <nbElt> <maxVal> [ENTIER|REEL]");
		} else {
			for(int idx=0;idx<nbElt;idx ++) {
				if(typeVal.equals("ENTIER")) {
					System.out.println((int)(Math.random()*(maxVal)));
				} else { System.out.println(Math.random()*(maxVal));
				}
			}

		}
	}
}