package tp01;

public class EssaiLivre {

	public static void main(String[] args) {
		Livre[] bibli = new Livre[3];
		bibli[0] = new Livre("Laurent","Doit-on virer Laurent ?",2001);
		bibli[1] = new Livre("Hugo","Le Seigneur des Hugo",1998);
		bibli[2] = new Livre("Lucas","Groupe C",2000);
		for(int idx=0;idx<bibli.length;idx ++) {
			System.out.println(bibli[idx].getTitre()+" par "+bibli[idx].getAuteur());
		}
		
	}

}
