package projet_info731;
import java.util.UUID;

public class Bien {
private final String idBien;
private String nom;
private String description;
private String categorie;
private String etatPhysique;

public Bien(String nom, String description, String categorie, String etatPhysique )
{
	this.idBien=UUID.randomUUID().toString();
	 this.nom = nom;
     this.description = description;
     this.categorie = categorie;
     this.etatPhysique = etatPhysique;

}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getCategorie() {
	return categorie;
}

public void setCategorie(String categorie) {
	this.categorie = categorie;
}

public String getEtatPhysique() {
	return etatPhysique;
}

public void setEtatPhysique(String etatPhysique) {
	this.etatPhysique = etatPhysique;
}

public String getIdBien() {
	return idBien;
}

@Override
public String toString() {
	return "idBien=" + idBien + "\n nom=" + nom + "\n description=" + description + "\n categorie=" + categorie
			+ "\n etatPhysique=" + etatPhysique ;
}



}
