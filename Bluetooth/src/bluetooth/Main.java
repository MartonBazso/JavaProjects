package bluetooth;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.UUID;
import javax.obex.Operation;
import javax.swing.KeyStroke;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;
import javax.swing.text.JTextComponent.KeyBinding;






public class Main {

    
	
		KeyBinding asd = new KeyBinding(KeyStroke.getKeyStroke('b'), null);

    	public static void main(String[] args) throws IOException, InterruptedException {
    		while(true) {
    		try {
				Robot robot = new Robot();
				
				robot.delay(1500);
				robot.mousePress(0);
				robot.delay(1500);
				robot.keyPress(KeyEvent.VK_A);
				break;
				
				
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}}
    
    

}