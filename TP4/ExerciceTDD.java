/**
 * 
 */
package TP4;

/**
 * @author lb
 *
 */
public class ExerciceTDD {
	
	/**
	 * Fonction qui permet de savoir si le nombre en paramètre est pair ou non
	 * @param nombre un entier quelconque
	 * @return vrai ou faux en focntion de s'il est pair
	 */
	public boolean estPair(int nombre){
		if (nombre % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Fonction qui permet de calculer le périmètre d'un carré
	 * @param cote un double qui doit être supérieur à 0
	 * @return retourne le périmètre avec un double. Renvoie 0.0 si cote <= 0
	 */
	public double perimetreCarre(double cote) {
		double res;
		if(cote <= 0) {
			res = 0;
		}
		else {
			res = cote * 4;
		}
		return res;
	}
	
	/**
	 * Fonction qui permet de savoir le nombre d'occurence d'un caractère dans une chaîne de caractère 
	 * @param caractere un caractère quelconque
	 * @param chaine une chaîne de caractère quelconque
	 * @return un entier qui correspond au nombre d'occurence de la lettre entrée en paramètre dans la chaîne également en paramètre
	 */
	public int contientCaractere(char caractere, String chaine) {
		int compteur = 0;
		for (int i = 0; i < chaine.length(); i++) {
			if(chaine.charAt(i) == caractere) {
				compteur ++;
			}
		}
		return compteur;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
