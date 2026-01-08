package projet_info731;

import java.util.UUID;

public abstract class Utilisateur {
private int num_tel;
private final String id;
private String nom,prenom,email,mdp;

public Utilisateur(int num_tel ,String nom,String prenom,String email,String mdp )
{
	this.email=email;
	this.id=UUID.randomUUID().toString();
	this.num_tel=num_tel;
	this.nom=nom;
	this.prenom=prenom;
	this.mdp=mdp;
	
	
}

public String getId() {
	return id;
}


public int getNum_tel() {
	return num_tel;
}

public void setNum_tel(int num_tel) {
	this.num_tel = num_tel;
}

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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMdp() {
	return mdp;
}

public void setMdp(String mdp) {
	this.mdp = mdp;
}

@Override
public String toString() {
	return "id=" + id + "\n num_tel=" + num_tel + "\n nom=" + nom + "\n prenom=" + prenom + "\n email=" + email
			+ "\n mdp=" + mdp ;
}


}
