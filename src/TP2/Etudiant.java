package TP2;


/**
 * Classe permettant la représentation d'un étudiant
 * @author Virginie Van den Schrieck
 */
public class Etudiant {
	//Variables d'instance
	private String nom;
	private String prenom;
	private int matricule;
	//Cette variable d'instance est du type Date, disponible dans le même package
	private Date dateNaissance;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Etudiant() {
		this.nom = "undefined";
		this.prenom = "undefined";
		this.matricule = 0000;
		this.dateNaissance = new Date();
	}
	
	public Etudiant(String pPrenom, String pNom, int pMatricule, Date pDate) {
		this.prenom = pPrenom;
		this.nom = pNom;
		this.matricule = pMatricule;
		this.dateNaissance = pDate;
	}
	
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", matricule=" + matricule + ", dateNaissance="
				+ dateNaissance + "]";
	}
	
	/*
	 * Méthode main qui crée un étudiant et initialise les variables d'instance au départ de la ligne de commande
	 * 
	 */
	public static void main(String[] args) {
		Etudiant etu = new Etudiant();
		System.out.println(etu);
		/*etu.nom = args[0];
		etu.prenom = args[1];
		etu.matricule = Integer.parseInt(args[2]);
		etu.dateNaissance = new Date();
		etu.dateNaissance.setJour(Integer.parseInt(args[3]));
		etu.dateNaissance.setMois(Integer.parseInt(args[4]));
		etu.dateNaissance.setAnnee(Integer.parseInt(args[5]));*/
	}

}
