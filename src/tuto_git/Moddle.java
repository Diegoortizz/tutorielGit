package tuto_git;

import java.util.Observable;

public class Moddle extends Observable {

	int compte;
	
	public Moddle() {
		this.compte = 0;
	}

	public void incrémente() {
		this.compte += 1;
		this.setChanged();
		this.notifyObservers(String.valueOf(this.compte));
	}
	
}
