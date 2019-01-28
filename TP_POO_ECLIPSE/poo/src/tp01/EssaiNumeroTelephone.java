package tp01;

import java.util.Random;
import td01.NumeroTelephone;

public class EssaiNumeroTelephone {

	public static void main(String[] args) {
		int nbNumero = Integer.parseInt(args[0]);
		Random nbAlea = new Random();
		NumeroTelephone[] carnet = new NumeroTelephone[nbNumero];
		for(int idx=0;idx<nbNumero;idx ++) {
			carnet[idx] = new NumeroTelephone(33,7,nbAlea.nextInt(100),nbAlea.nextInt(100),nbAlea.nextInt(100),nbAlea.nextInt(100));
		}
		for(int idx=0;idx<carnet.length;idx ++) {
			System.out.println("Numero de telephone n°"+(idx+1));
			System.out.println(carnet[idx].affichageStandard());
			System.out.println(carnet[idx].affichageInternational());
		}
	}

}
