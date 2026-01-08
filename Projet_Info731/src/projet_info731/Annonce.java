package projet_info731;
import java.util.UUID;
import java.time.LocalDate;

public abstract class  Annonce extends Observee{
private final String  id_annonce;
private TypeAnnonce type;
private StatutAnnonce statut;
private LocalDate datePublication;
private float prix;

public Annonce(TypeAnnonce type ,float p)
{
	super();
	this.id_annonce = UUID.randomUUID().toString();
	this.datePublication=LocalDate.now();
	this.type=type;
	this.statut=StatutAnnonce.DISPONIBLE;
	this.prix=p;
}

public float modifierPrix(float p)
{
	if(this.prix>p)
	{
		float diff=this.prix-p;
		super.notifier("Prix diminue de "+diff+" nouveau prix : "+p);
	}
	else {
		float diff=p-this.prix;
		super.notifier("Prix augmente de "+diff+" nouveau prix : "+p);
	}
	this.prix=p;
	
	
	return this.prix;
}

@Override
public String toString() {
	return "id_annonce=" + id_annonce + "\n type=" + type + "\n statut=" + statut + "\n datePublication="
			+ datePublication + "\n prix=" + prix ;
}

public TypeAnnonce getType() {
	return type;
}

public void setType(TypeAnnonce type) {
	this.type = type;
}

public StatutAnnonce getStatut() {
	return statut;
}

public void setStatutNonDisponible() {
	this.statut = StatutAnnonce.NON_DISPONIBLE;
}

public void setStatut(StatutAnnonce statut) {
    this.statut = statut;
}

public String getId_annonce() {
	return id_annonce;
}

public LocalDate getDatePublication() {
	return datePublication;
}

public float getPrix() {
	return prix;
}



}
