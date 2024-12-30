package BrickBraker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Gameplay extends JPanel implements KeyListener, ActionListener //to detect arrowkeys from keyboard

{
	
//	private boolean play =false;
//	private int score = 0;
//	
//	private int totalBricks = 21;
//	private Timer timer;
//	private int delay = 8;
//	private int playerx = 120;
//	
//	private int ballposX = 120;
//	private int ballposY = 350;
//	private int ballXdir = -1; //dir-direction
//	private int ballYdir = -2;
	
	
	public Gameplay() {
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
//		timer = new Timer(delay, this);
//		timer.start();
	
	}

	
	public void paint(Graphics g) {
		//background
		g.setColor(Color.black);
		g.fillRect(1, 1, 692, 592);
		
		//borders
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 3, 592);
		g.fillRect(0, 0, 692, 3);
		g.fillRect(0, 0, 3, 592);
	
		
		//paddle
		g.setColor(Color.green);
		g.fillRect(playerx, 550, 100, 8);
		
		//ball
		g.setColor(Color.yellow);
		g.fillRect(ballposX, ballposY, 20, 20);
		

		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			
			if(playerx >=600) {
				playerx = 600;
			}else {
				moveRight();
			}
			
		}
		
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			if(playerx <10) {
				playerx = 10;
			}else {
				moveLeft();
			}
			
			
		}
	}


	public void moveRight() {
		// TODO Auto-generated method stub
		play = true;
		playerx+=20;
	}
	
	public void moveLeft() {
		// TODO Auto-generated method stub
		play = true;
		playerx-=20;
	}


	
}
