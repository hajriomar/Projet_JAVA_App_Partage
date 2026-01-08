package projet_info731;

import java.util.Date;

public class AnnonceFactory {

	
	public static Annonce creerAnnonceBien(
            TypeAnnonce type,
            float prix,
            Bien bien,
            String description,
            Etudiant createur) {

        Annonce annonce = new AnnonceBien(type, prix, bien, description);

        
        

       
        annonce.inscrire(createur);

       
        Registre.getInstance().ajouterAnnonce(annonce);

        return annonce;
    }

   
    public static Annonce creerAnnonceService(
            TypeAnnonce type,
            float prix,
            String description,
            Service service,
            Etudiant createur) {

        Annonce annonce = new AnnonceService(type, prix, description, service);

        EtudiantAnnonce relation = new EtudiantAnnonce(
                RoleAnnonce.CREATEUR,
                createur,
                annonce
        );

        annonce.inscrire(createur);
        Registre.getInstance().ajouterAnnonce(annonce);

        return annonce;
    }

   
    public static Annonce creerAnnoncePret(
            TypeAnnonce type,
            float prix,
            Date dateDebutPrevu,
            Date dateFinPrevu,
            Bien bien,
            Etudiant createur) {

        Annonce annonce = new AnnoncePret(type, prix, dateDebutPrevu, dateFinPrevu, bien);

        EtudiantAnnonce relation = new EtudiantAnnonce(
                RoleAnnonce.CREATEUR,
                createur,
                annonce
        );

        annonce.inscrire(createur);
        Registre.getInstance().ajouterAnnonce(annonce);

        return annonce;
    }
	    
	
}
