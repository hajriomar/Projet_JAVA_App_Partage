package projet_info731;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class Service {
	private final String  idService;
    private String nom;
    private String description;
    private String categorie;
    private List<Evaluation> evaluations;
    
    public Service(String nom, String description, String categorie)
    {
    	this.idService=UUID.randomUUID().toString();
    	 this.nom = nom;
         this.description = description;
         this.categorie = categorie;
         this.evaluations = new ArrayList<>();
    	
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

	public List<Evaluation> getEvaluations() {
		return evaluations;
	}

	 public void ajouterEvaluation(Evaluation eval) {
	        this.evaluations.add(eval);
	    }

	public String getIdService() {
		return idService;
	}
    
    
    
    
}
