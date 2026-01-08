package projet_info731;

public class Etudiant extends Utilisateur implements Observateur{
private int num_etudiant,scorerecapulatif,nbAvertissements;

public Etudiant(int num_etudiant,int scorerecapulatif,int nbAvertissements ,int num_tel ,String nom,String prenom,String email,String mdp)
{
	super(num_tel , nom, prenom, email, mdp);
	this.nbAvertissements=nbAvertissements;
	this.num_etudiant=num_etudiant;
	this.scorerecapulatif=scorerecapulatif;
}

public int getNum_etudiant() {
	return num_etudiant;
}

public void setNum_etudiant(int num_etudiant) {
	this.num_etudiant = num_etudiant;
}

public int getScorerecapulatif() {
	return scorerecapulatif;
}

public void setScorerecapulatif(int scorerecapulatif) {
	this.scorerecapulatif = scorerecapulatif;
}

public int getNbAvertissements() {
	return nbAvertissements;
}

public void setNbAvertissements(int nbAvertissements) {
	this.nbAvertissements = nbAvertissements;
}

@Override
public String toString() {
	return "Etudiant :"+super.toString()+"\n num_etudiant=" + num_etudiant + "\n scorerecapulatif=" + scorerecapulatif + "\n nbAvertissements="
			+ nbAvertissements ;
}

@Override
public void update(String event) {
	System.out.println("[Notification] ("+this.getNom()+" "+this.getPrenom()+")"+""+event);
	
}


}
