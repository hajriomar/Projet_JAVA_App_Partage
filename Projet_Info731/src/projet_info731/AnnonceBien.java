package projet_info731;

public class AnnonceBien extends Annonce {

	private String description;
    
    // Relation 1 à 1 avec Bien
    private Bien bien; 
    
	public AnnonceBien(TypeAnnonce type,float prix , Bien b ,String desc)
	{
		super(type,prix);
		this.bien=b;
		this.description=desc;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Bien getBien() {
		return bien;
	}

	public void setBien(Bien bien) {
		this.bien = bien;
	}

	@Override
	public String toString() {
		return "AnnonceBien : \n"+super.toString() +"\n description=" + description + "\n bien : \n" + this.getBien().toString();
	}
	
	
}
