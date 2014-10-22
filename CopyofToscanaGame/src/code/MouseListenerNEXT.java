package code;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MouseListenerNEXT implements MouseListener {
	private int displaynum = 1;
	private int score = 0;
	JFrame frame;
	public MouseListenerNEXT(JFrame mapframe) {
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		switch(displaynum){
		case 1:
			String s1 = (String)JOptionPane.showInputDialog(frame,"1. Risolvi per 20 punti: ZRIFEEN","CIAO!",JOptionPane.WARNING_MESSAGE);
			if(s1.equals("firenze")||s1.equals("Firenze")){
				score = score + 20;
				new FrameDisplay("Images/f2.png");
				new FrameDisplay("Images/f1.png");			}
			else{
				String s2 = (String)JOptionPane.showInputDialog(frame,"1. Risolvi per 10 punti: ZRIFEEN (Allusione:F_____E)","CIAO!",JOptionPane.WARNING_MESSAGE);
				if(s2.equals("firenze")||s2.equals("Firenze")){
					score = score + 10;
					new FrameDisplay("Images/f2.png");
					new FrameDisplay("Images/f1.png");			}
				else{
					String s3 = (String)JOptionPane.showInputDialog(frame,"1. Risolvi per 5 punti: ZRIFEEN (Allusione:FIR___E)","CIAO!",JOptionPane.WARNING_MESSAGE);
					if(s3.equals("firenze")||s3.equals("Firenze")){
						score = score + 5;
						new FrameDisplay("Images/f2.png");
						new FrameDisplay("Images/f1.png");					}
					else{
						JOptionPane.showMessageDialog(frame,"1. Soluzione: Firenze","Scusa!",JOptionPane.ERROR_MESSAGE);
						new FrameDisplay("Images/f2.png");
						new FrameDisplay("Images/f1.png");
					}
				}
			}
			displaynum++;
			break;
		case 2:
			s1 = (String)JOptionPane.showInputDialog(frame,"2. Risolvi per 20 punti: AEINS","CIAO!",JOptionPane.WARNING_MESSAGE);
			if(s1.equals("siena")||s1.equals("Siena")){
				score = score + 20;
				new FrameDisplay("Images/s2.png");
				new FrameDisplay("Images/s1.png");
			}
			else{
				String s2 = (String)JOptionPane.showInputDialog(frame,"2. Risolvi per 10 punti: AEINS (Allusione:S____)","CIAO!",JOptionPane.WARNING_MESSAGE);
				if(s2.equals("siena")||s2.equals("Siena")){
					score = score + 10;
					new FrameDisplay("Images/s2.png");
					new FrameDisplay("Images/s1.png");				}
				else{
					String s3 = (String)JOptionPane.showInputDialog(frame,"2. Risolvi per 5 punti: AEINS (Allusione:S___A)","CIAO!",JOptionPane.WARNING_MESSAGE);
					if(s3.equals("siena")||s3.equals("Siena")){
						score = score + 5;
						new FrameDisplay("Images/s2.png");
						new FrameDisplay("Images/s1.png");					}
					else{
						JOptionPane.showMessageDialog(frame,"2. Soluzione: Siena","Scusa!",JOptionPane.ERROR_MESSAGE);
						new FrameDisplay("Images/s2.png");
						new FrameDisplay("Images/s1.png");					}
				}
			}
			displaynum++;
			break;
		case 3:
			s1 = (String)JOptionPane.showInputDialog(frame,"3. Risolvi per 20 punti: APSI","CIAO!",JOptionPane.WARNING_MESSAGE);
			if(s1.equals("pisa")||s1.equals("Pisa")){
				score = score + 20;
				new FrameDisplay("Images/p2.png");
				new FrameDisplay("Images/p1.png");			}
			else{
				String s2 = (String)JOptionPane.showInputDialog(frame,"3. Risolvi per 10 punti: APSI (Allusione:P___)","CIAO!",JOptionPane.WARNING_MESSAGE);
				if(s2.equals("pisa")||s2.equals("Pisa")){
					score = score + 10;
					new FrameDisplay("Images/p2.png");
					new FrameDisplay("Images/p1.png");				}
				else{
					String s3 = (String)JOptionPane.showInputDialog(frame,"3. Risolvi per 5 punti: APSI (Allusione:P__A)","CIAO!",JOptionPane.WARNING_MESSAGE);
					if(s3.equals("pisa")||s3.equals("Pisa")){
						score = score + 5;
						new FrameDisplay("Images/p2.png");
						new FrameDisplay("Images/p1.png");					}
					else{
						JOptionPane.showMessageDialog(frame,"3. Soluzione: Pisa","Scusa!",JOptionPane.ERROR_MESSAGE);
						new FrameDisplay("Images/p2.png");
						new FrameDisplay("Images/p1.png");					}
				}
			}
			displaynum++;
			break;
		case 4:
			s1 = (String)JOptionPane.showInputDialog(frame,"4. Risolvi per 20 punti: CALCU","CIAO!",JOptionPane.WARNING_MESSAGE);
			if(s1.equals("lucca")||s1.equals("Lucca")){
				score = score + 20;
				new FrameDisplay("Images/l2.png");
				new FrameDisplay("Images/l1.png");			}
			else{
				String s2 = (String)JOptionPane.showInputDialog(frame,"4. Risolvi per 10 punti: CALCU (Allusione:L____)","CIAO!",JOptionPane.WARNING_MESSAGE);
				if(s2.equals("lucca")||s2.equals("Lucca")){
					score = score + 10;
					new FrameDisplay("Images/l2.png");
					new FrameDisplay("Images/l1.png");				}
				else{
					String s3 = (String)JOptionPane.showInputDialog(frame,"4. Risolvi per 5 punti: CALCU (Allusione:L___A)","CIAO!",JOptionPane.WARNING_MESSAGE);
					if(s3.equals("lucca")||s3.equals("Lucca")){
						score = score + 5;
						new FrameDisplay("Images/l2.png");
						new FrameDisplay("Images/l1.png");					}
					else{
						JOptionPane.showMessageDialog(frame,"4. Soluzione: Lucca","Scusa!",JOptionPane.ERROR_MESSAGE);
						new FrameDisplay("Images/l2.png");
						new FrameDisplay("Images/l1.png");					}
				}
			}
			displaynum++;
			break;
		case 5:
			s1 = (String)JOptionPane.showInputDialog(frame,"5. Risolvi per 20 punti: NTHIACI OCLSIASC","CIAO!",JOptionPane.WARNING_MESSAGE);
			if(s1.equals("chianti classico")||s1.equals("Chianti Classico")){
				score = score + 20;
				new FrameDisplay("Images/cc1.png");
			}
			else{
				String s2 = (String)JOptionPane.showInputDialog(frame,"5. Risolvi per 10 punti: NTHIACI OCLSIASC (Allusione:C_____I C______O)","CIAO!",JOptionPane.WARNING_MESSAGE);
				if(s2.equals("chianti classico")||s2.equals("Chianti Classico")){
					score = score + 10;
					new FrameDisplay("Images/cc1.png");
				}
				else{
					String s3 = (String)JOptionPane.showInputDialog(frame,"5. Risolvi per 5 punti: NTHIACI OCLSIASC (Allusione:CH___TI CL___ICO)","CIAO!",JOptionPane.WARNING_MESSAGE);
					if(s3.equals("chianti classico")||s3.equals("Chianti Classico")){
						score = score + 5;
						new FrameDisplay("Images/cc1.png");
					}
					else{
						JOptionPane.showMessageDialog(frame,"5. Soluzione: Chianti Classico","Scusa!",JOptionPane.ERROR_MESSAGE);
						new FrameDisplay("Images/cc1.png");
					}
				}
			}
			displaynum++;
			break;
		case 6:

			JOptionPane.showMessageDialog(frame,"Punteggio finale: " +score,"COMPLIMENTI!",JOptionPane.ERROR_MESSAGE);
			new FrameDisplay("Images/finalfantastic.png");

			break;

		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
