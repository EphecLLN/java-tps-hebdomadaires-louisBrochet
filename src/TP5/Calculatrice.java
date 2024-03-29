package TP5;

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
	 * Cette méthode calcule le carré d’un nombre.
	 * @param n : Un nombre entier quelconque
	 * @return Un nombre >= 0, résultat de la multiplication de n par lui-même
	 */
	
	public int carre(int n) {
		return n*n;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(valeurCourante);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculatrice other = (Calculatrice) obj;
		if (Double.doubleToLongBits(valeurCourante) != Double.doubleToLongBits(other.valeurCourante))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Calculatrice [valeurCourante=" + valeurCourante + "]";
	}

	/**
	 * Méthode main permettant de lancer un test rapide de la classe calculatrice.
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		String a = "Jean Dujardin";
		String[] tab = a.split(" ");
		if(tab.length != 2){
		    tab = null;
		}
		System.out.println(tab[0]);
	}

}
