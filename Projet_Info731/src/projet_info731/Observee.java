package projet_info731;

import java.util.ArrayList;
import java.util.List;

public abstract class Observee {
	
	private List<Observateur> observateurs ;
	public Observee()
	{
		this.observateurs=new ArrayList<>();
	}

    public void inscrire(Observateur o) {
        observateurs.add(o);
    }

    public void retirer(Observateur o) {
        observateurs.remove(o);
    }

    public void notifier(String event) {
        for (Observateur o : observateurs) {
            o.update(event);
        }
    }
}
