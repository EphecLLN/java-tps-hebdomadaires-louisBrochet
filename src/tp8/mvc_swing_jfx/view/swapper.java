package mvc_swing_jfx.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swapper{

	JFrame fenetre;
	JTextField text1 = new JTextField("oui");
	JTextField text2 = new JTextField("non");
	JButton btn = new JButton();
	
	public swapper() {
		fenetre = new JFrame();
		fenetre.setTitle("Swapper");
		fenetre.setSize(100, 100);
		
	}

}
