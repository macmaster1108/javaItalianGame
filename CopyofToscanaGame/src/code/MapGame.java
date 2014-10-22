package code;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.image.BufferedImage;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MapGame {
	

	
	public MapGame(){

		
		//JFRAME SETUP
		JFrame mapframe = new JFrame("Map");
		mapframe.setBackground(java.awt.Color.BLACK);
		
		//LOGO PREP, ADD LABEL TO PANEL, AND ADD PANEL TO STARTFRAME   *MAP
		BufferedImage logopre = HelpfulImageMethods.loadImage("images/mapslide.png");
		ImageIcon iconlogopost = new ImageIcon(logopre);
		JPanel logopanel = new JPanel();
		JLabel logolabel = new JLabel(iconlogopost);
		logopanel.add(logolabel);
		mapframe.add(logopanel);
		
		//BUTTON PANEL MAKER
		JPanel buttonpanel = new JPanel();

		//NEXT BUTTON
		JButton newgamebutt = new JButton("Dopo");
		newgamebutt.addMouseListener(new MouseListenerNEXT(mapframe));
		newgamebutt.setMinimumSize(new Dimension(300,120));
		newgamebutt.setPreferredSize(new Dimension(300,120));
		newgamebutt.setMaximumSize(new Dimension(300,120));
		buttonpanel.add(newgamebutt);
		
		//FRAME BASICS
		mapframe.add(buttonpanel);
		mapframe.setVisible(true);
		mapframe.setResizable(true);
		Container p = mapframe.getContentPane();
		mapframe.getContentPane().setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		mapframe.pack();
		
	}

}
