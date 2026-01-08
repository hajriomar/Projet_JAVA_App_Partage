package projet_info731;

import java.util.UUID;
import java.time.LocalDate;

public class Evaluation {
	private final String idEvaluation;
    private int note;
    private String commentaire;
    private LocalDate date;
    
    public Evaluation(int note, String commentaire)
    {
    	this.idEvaluation=UUID.randomUUID().toString();
    	this.date=LocalDate.now();
    	 this.note = note;
         this.commentaire = commentaire;
    }

    
	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getIdEvaluation() {
		return idEvaluation;
	}


	@Override
	public String toString() {
		return "Evaluation : \nidEvaluation=" + idEvaluation + "\n note=" + note + "\n commentaire=" + commentaire
				+ "\n date=" + date ;
	}
    
    
}
