package projet_info731;

import java.util.UUID;


public class EtudiantAnnonce {

	private final String idEtudiantAnnonce;
	private RoleAnnonce role;
	private final Utilisateur utilisateur;
	private final Annonce annonce;
	
	public EtudiantAnnonce(RoleAnnonce role , Utilisateur utilisateur ,Annonce annonce )
	{
		this.idEtudiantAnnonce=UUID.randomUUID().toString();
		this.role=role;
		this.annonce=annonce;
		this.utilisateur=utilisateur;
	}

	public RoleAnnonce getRole() {
		return role;
	}

	public void setRole(RoleAnnonce role) {
		this.role = role;
	}

	public String getIdEtudiantAnnonce() {
		return idEtudiantAnnonce;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public Annonce getAnnonce() {
		return annonce;
	}
	
	
	
}
