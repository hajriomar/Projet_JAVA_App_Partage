package projet_info731;

import java.util.Date;

public class AnnoncePret extends Annonce{
	
	private Date dateDebutPrevu;
    private Date dateFinPrevu;
    private Date dateRetourReel;
    private Bien bien;
	
	public AnnoncePret(TypeAnnonce type,float prix , Date dateDebutPrevu, Date dateFinPrevu,Bien b)
	{
		super(type,prix);
		this.dateDebutPrevu = dateDebutPrevu;
        this.dateFinPrevu = dateFinPrevu;
        this.dateRetourReel=null;
        this.bien=b;
	}

	public Date getDateDebutPrevu() {
		return dateDebutPrevu;
	}

	public void setDateDebutPrevu(Date dateDebutPrevu) {
		this.dateDebutPrevu = dateDebutPrevu;
	}

	public Date getDateFinPrevu() {
		return dateFinPrevu;
	}

	public void setDateFinPrevu(Date dateFinPrevu) {
		this.dateFinPrevu = dateFinPrevu;
	}

	public Date getDateRetourReel() {
		return dateRetourReel;
	}

	public void setDateRetourReel(Date dateRetourReel) {
		this.dateRetourReel = dateRetourReel;
	}

	public Bien getBien() {
		return bien;
	}

	public void setBien(Bien bien) {
		this.bien = bien;
	}
	
	
	public String toString() {
		return "AnnoncePret : \n"+super.toString() +"\n dateDebutPrevu=" + dateDebutPrevu + "\n dateFinPrevu=" + dateFinPrevu + "\n dateRetourReel="
				+ dateRetourReel + "\n bien : \n" + this.getBien().toString();
	}

	
	
}
