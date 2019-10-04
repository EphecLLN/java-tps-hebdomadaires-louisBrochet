/**
 * 
 */
package TP3;



/**
 * Cette classe modélise une date de manière simplifiée.
 * @author Virginie Van den Schrieck
 *
 */
public class Date {
	
	//variables d'instance
	int jour;
	int mois;
	int annee;
	
	public Date() {
		this.jour = 0;
		this.mois = 0;
		this.annee = 0;
	}
	
	public Date(int pJour, int pMois, int pAnnee) {
		this.jour = pJour;
		this.mois = pMois;
		this.annee = pAnnee;
	}
	
	public String toString() {
		String s = this.jour + "/" + this.mois +  "/" + this.annee;
		return s;
	}
	
	/**
	 * La méthode main permet de tester la classe date en créant un objet 
	 * au départ des arguments de la ligne de commande.  Trois arguments sont attendus, sous forme d'entiers : 
	 * Le jour, le mois et l'année.  
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String [] args) {
		Date d = new Date();
		System.out.println(d);
		
	}
}
