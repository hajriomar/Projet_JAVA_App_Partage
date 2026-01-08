package projet_info731;

import java.util.Date;

public class Test {

	 public static void main(String[] args) {

	        System.out.println("===== DEMARRAGE DU PROJET =====\n");

	        /* ======================================================
	           1. SINGLETON : REGISTRE
	        ====================================================== */
	        Registre registre = Registre.getInstance();

	        /* ======================================================
	           2. CREATION DES ETUDIANTS
	        ====================================================== */
	        Etudiant e1 = new Etudiant(
	                1001, 80, 0,
	                22113344,
	                "Ali", "Ben Salah",
	                "ali@mail.com", "1234"
	        );

	        Etudiant e2 = new Etudiant(
	                1002, 60, 1,
	                99887766,
	                "Sara", "Trabelsi",
	                "sara@mail.com", "abcd"
	        );

	        registre.ajouterEtudiant(e1);
	        registre.ajouterEtudiant(e2);

	        System.out.println("Etudiants ajoutés au registre.\n");

	        /* ======================================================
	           3. CREATION DES OBJETS METIER
	        ====================================================== */
	        Bien pc = new Bien(
	                "PC Portable",
	                "HP i5 - 16Go RAM",
	                "Informatique",
	                "Bon état"
	        );

	        Service coursJava = new Service(
	                "Cours Java",
	                "Cours particuliers Java",
	                "Formation"
	        );

	        /* ======================================================
	           4. CREATION DES ANNONCES (FACTORY AMELIOREE)
	        ====================================================== */
	        Annonce annonceBien = AnnonceFactory.creerAnnonceBien(
	                TypeAnnonce.OFFRE,
	                500f,
	                pc,
	                "PC en très bon état",
	                e1  
	        );

	        Annonce annonceService = AnnonceFactory.creerAnnonceService(
	                TypeAnnonce.DEMANDE,
	                30f,
	                "Je cherche un professeur Java",
	                coursJava,
	                e1   
	        );

	        Date debutPret = new Date();
	        Date finPret = new Date(debutPret.getTime() + 7L * 24 * 60 * 60 * 1000);

	        Annonce annoncePret = AnnonceFactory.creerAnnoncePret(
	                TypeAnnonce.OFFRE,
	                0f,
	                debutPret,
	                finPret,
	                pc,
	                e2   
	        );

	        System.out.println("Annonces créées via la Factory améliorée.\n");

	        /* ======================================================
	           5. INTERESSE / BENEFICIAIRE (HORS FACTORY)
	        ====================================================== */
	        EtudiantAnnonce relationInteresse = new EtudiantAnnonce(
	                RoleAnnonce.INTERESSE,
	                e2,
	                annonceBien
	        );

	        // l'étudiant intéressé s'abonne pour suivre les changements
	        annonceBien.inscrire(e2);

	        System.out.println("Relation INTERESSE créée.\n");

	        /* ======================================================
	           6. TEST OBSERVER : MODIFICATION PRIX
	        ====================================================== */
	        System.out.println(">>> Modification du prix de l'annonce BIEN");
	        annonceBien.modifierPrix(450f);

	        /* ======================================================
	           7. RENDEZ-VOUS (ANNONCE SERVICE)
	        ====================================================== */
	        if (annonceService instanceof AnnonceService) {
	            AnnonceService as = (AnnonceService) annonceService;

	            RendezVous rdv = new RendezVous(
	                    new Date(),
	                    new Date(),
	                    "Polytech",
	                    "confirmé"
	            );

	            as.ajouterRendezVous(rdv);
	            System.out.println("\nRendez-vous ajouté à l'annonce service.");
	        }

	        /* ======================================================
	           8. EVALUATION D'UN SERVICE
	        ====================================================== */
	        Evaluation eval = new Evaluation(5, "Très bon cours !");
	        coursJava.ajouterEvaluation(eval);

	        System.out.println("\nEvaluation ajoutée au service.");

	        /* ======================================================
	           9. AFFICHAGE FINAL
	        ====================================================== */
	        System.out.println("\n===== CONTENU DU REGISTRE =====");

	        System.out.println("\n--- Etudiants ---");
	        for (Etudiant e : registre.getEtudiants()) {
	            System.out.println(e + "\n");
	        }

	        System.out.println("\n--- Annonces ---");
	        for (Annonce a : registre.getAnnonces()) {
	            System.out.println(a + "\n");
	        }

	        System.out.println("===== FIN DU TEST =====");
	    }
	
}
