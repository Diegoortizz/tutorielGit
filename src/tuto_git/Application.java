package tuto_git;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Application extends Frame {

	public static void main(String[] args) {
		new Application();
	}
	
	public Application() {
		super();
		
		Moddle modl = new Moddle();
		Controleur ctrl = new Controleur(modl); 
		Vue vue = new Vue();
		modl.addObserver(vue);
		vue.addActionListener(ctrl);
		
		this.setTitle("coucou");
		this.add(vue);
		this.pack();
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}

}
