import java.awt.AWTException;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Main extends Canvas{

	
	static BufferedImage image;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("asd");
		JFrame frame = new JFrame("My Drawing");
		Canvas canvas = new Main();
		canvas.setSize(400, 400);
		frame.add(canvas);
		frame.pack();
		frame.setVisible(true);
		try {
			 image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			
			
			
		} catch (Exception e) {
			
			System.out.println("lol");
		}
		
	}
	
	
	
	
	
	
	public void paint(Graphics g) {
		//g.fillOval(100, 100, 200, 200);
		g.drawImage(image, 10, 10, 400, 400, Color.CYAN, new ImageObserver() {
			
			@Override
			public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
				// TODO Auto-generated method stub
				return true;
			}
		});
	}

}
