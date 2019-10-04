package TP2;

/**
 * Cette classe modélise une calculatrice simplifiée avec une valeur courante et trois opérations. 
 * @authors vvandens, louisb
 *
 */
public class Calculatrice {
	
	private double valeurCourante; // Stocke la valeur affichée sur l'écran de la calculatrice
	
	public double getValeurCourante() {
		return valeurCourante;
	}

	public void setValeurCourante(double valeurCourante) {
		this.valeurCourante = valeurCourante;
	}

	/**
	 * constructeur par défaut
	 */
	public Calculatrice() {
		this.valeurCourante = 0.0;
	}
	
	/**
	 * Constructeur avec saisie de la valeur courante de départ
	 * @param n
	 */
	public Calculatrice(double n) {
		this.valeurCourante = n;
	}
	/**
	 * Additionne un nombre à la valeur courante
	 * @param n le nombre à ajouter à la valeur courante de la calculatrice
	 */
	void ajoute(double n) {
		valeurCourante+=n;
	}
	/**
	 * Soustrait un nombre à la valeur courante
	 * @param n le nombre à soustraire à la valeur courante de la calculatrice
	 */
	void soustrait(double n) {
		valeurCourante-=n;
	}
	/**
	 * Elève la valeur courante au carré
	 */
	void carre() {
		valeurCourante*=valeurCourante;
	}
	
	/**
	 * Méthode main permettant de lancer un test rapide de la classe calculatrice.
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		Calculatrice myCalc = new Calculatrice();
		myCalc.ajoute(5);
		myCalc.soustrait(2);
		System.out.println(myCalc.valeurCourante);
	}

}
