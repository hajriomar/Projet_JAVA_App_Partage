package projet_info731;

import java.util.ArrayList;
import java.util.List;



public class Registre {
	
	private static Registre instance;
	private List<Annonce> listeAnnonces;
	private List<Etudiant> listeEtudiants;
	
	private Registre()
	{
		this.listeAnnonces = new ArrayList<>();
        this.listeEtudiants = new ArrayList<>();
	}
	
    public static Registre getInstance() {
        if (instance == null) {
            instance = new Registre();
        }
        return instance;
    }
    
    public void ajouterAnnonce(Annonce a) {
    	 if (!listeAnnonces.contains(a)) {
    	listeAnnonces.add(a);
    	 }
    	 else {
    		 System.out.println("Annonce deja existe !!!");
    	 }
    }

    public List<Annonce> getAnnonces() {
        return listeAnnonces;
    }

   
    public void ajouterEtudiant(Etudiant e) {
    	 if (!listeEtudiants.contains(e)) {
    	listeEtudiants.add(e);
    	 }
    	 else {
    		 System.out.println("Etudiant deja existe !!!");
    	 }
    }

    public List<Etudiant> getEtudiants() {
        return listeEtudiants;
    }
    
    public Annonce trouverAnnonceParId(String id) {
        for (Annonce a : listeAnnonces) {
            if (a.getId_annonce().equals(id)) {
                return a;
            }
        }
        return null;
    }

    
}
