package projet_info731;

import java.util.Date;
import java.util.UUID;


public class RendezVous {
	private final String idRdv;
	private Date heure;
    private Date date;
    private String lieu;
    private String statut; // confirmé, annulé
    
    public RendezVous(Date heure, Date date, String lieu, String statut) {
    	this.idRdv=UUID.randomUUID().toString();
        this.heure = heure;
        this.date = date;
        this.lieu = lieu;
        this.statut = statut;
    }

	public Date getHeure() {
		return heure;
	}

	public void setHeure(Date heure) {
		this.heure = heure;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getIdRdv() {
		return idRdv;
	}

	@Override
	public String toString() {
		return "RendezVous : \n idRdv=" + idRdv + "\n heure=" + heure + "\n date=" + date + "\n lieu=" + lieu + "\n statut="
				+ statut ;
	}

    
    
    
}
