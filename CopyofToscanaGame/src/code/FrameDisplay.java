package code;

import java.awt.Container;

import java.awt.image.BufferedImage;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameDisplay {

	public FrameDisplay(String filename) {
		//JFRAME SETUP
		JFrame frame = new JFrame("Mamma Mia!");
		frame.setBackground(java.awt.Color.GREEN);
		//LOGO PREP, ADD LABEL TO PANEL, AND ADD PANEL TO STARTFRAME
		BufferedImage logopre = HelpfulImageMethods.loadImage(filename);
		ImageIcon iconlogopost = new ImageIcon(logopre);
		JPanel logopanel = new JPanel();
		JLabel logolabel = new JLabel(iconlogopost);
		logopanel.add(logolabel);
		
		frame.add(logopanel);
		frame.setVisible(true);
		frame.setResizable(true);
		Container p = frame.getContentPane();
		frame.getContentPane().setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		frame.pack();
	}
	

}
