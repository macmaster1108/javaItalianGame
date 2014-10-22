package code;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseListenerNG implements MouseListener {
	public MouseListenerNG(JFrame startframe){
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		new MapGame();
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {

	}

	@Override
	public void mouseExited(MouseEvent arg0) {

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// Auto-generated method stub

	}


}
