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

public class Game {
   
    public Game() {

    	//JFRAME SETUP
		JFrame startframe = new JFrame("La Toscana Game ver 1.0");
		startframe.setBackground(java.awt.Color.BLACK);
		
		//LOGO PREP, ADD LABEL TO PANEL, AND ADD PANEL TO STARTFRAME
		BufferedImage logopre = HelpfulImageMethods.loadImage("images/titlelogo.png");
		ImageIcon iconlogopost = new ImageIcon(logopre);
		JPanel logopanel = new JPanel();
		JLabel logolabel = new JLabel(iconlogopost);
		logopanel.add(logolabel);
		startframe.add(logopanel);
		
		//BUTTON PANEL MAKER
		JPanel buttonpanel = new JPanel();
				
		//NEW GAME BUTTON
		JButton newgamebutt = new JButton("Nuovo gioco");
		newgamebutt.addMouseListener(new MouseListenerNG(startframe));
		newgamebutt.setMinimumSize(new Dimension(250,100));
		newgamebutt.setPreferredSize(new Dimension(250,100));
		newgamebutt.setMaximumSize(new Dimension(250,100));
		buttonpanel.add(newgamebutt);
		
		//QUIT BUTTON
		JButton quitbutt = new JButton("Terminato");
		quitbutt.addMouseListener(new MouseListenerQUIT());
		quitbutt.setMinimumSize(new Dimension(250,100));
		quitbutt.setPreferredSize(new Dimension(250,100));
		quitbutt.setMaximumSize(new Dimension(250,100));
		buttonpanel.add(quitbutt);
		
		//Works Cited BUTTON
		JButton wcbutt = new JButton("Bibliografia");
		wcbutt.addMouseListener(new MouseListenerWC(startframe));
		wcbutt.setMinimumSize(new Dimension(250,100));
		wcbutt.setPreferredSize(new Dimension(250,100));
		wcbutt.setMaximumSize(new Dimension(250,100));
		buttonpanel.add(wcbutt);
		
		//FRAME BASICS
		startframe.add(buttonpanel);
		startframe.setVisible(true);
		startframe.setResizable(true);
		Container p = startframe.getContentPane();
		startframe.getContentPane().setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		startframe.pack();
		startframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//PLAYING BACKGROUND MUSIC
		//new PlaySound("Sounds/AvengersThemeShort.wav");
	}
	
}
