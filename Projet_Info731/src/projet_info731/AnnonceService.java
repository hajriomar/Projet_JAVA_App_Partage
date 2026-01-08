package projet_info731;

import java.util.ArrayList;
import java.util.List;

public class AnnonceService extends Annonce{

	 private Service service;
	 private List<RendezVous> listeRendezVous;
	 private String description;
	    
	public AnnonceService(TypeAnnonce type,float prix,String description, Service service)
	{
		super( type, prix);
		this.description = description;
        this.service = service;
        this.listeRendezVous = new ArrayList<>();
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public List<RendezVous> getListeRendezVous() {
		return listeRendezVous;
	}

    public void ajouterRendezVous(RendezVous rendezVous) {
    	if (!listeRendezVous.contains(rendezVous)) {
    	this.listeRendezVous.add(rendezVous);
    	}
    	else {
    		System.out.println("rendezVous deja existe !!!!");
    	}
    }


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
