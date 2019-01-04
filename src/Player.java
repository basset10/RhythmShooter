import static com.osreboot.ridhvl.painter.painter2d.HvlPainter2D.hvlDrawQuadc;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Color;

public class Player {

	public static int playerSize = 30;
	public static float xPlayer = 1280/2;
	public static float yPlayer = 720/2;
	public static float xSpeed = 200f;
	public static float ySpeed = 200f;
	
	public static void update(float delta) {
	
hvlDrawQuadc(xPlayer, yPlayer, playerSize, playerSize, Color.cyan);
		
		if(Keyboard.isKeyDown(Keyboard.KEY_W)){
			yPlayer = yPlayer - (delta * ySpeed);
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_S)){
			yPlayer = yPlayer + (delta * ySpeed);
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_A)){
			xPlayer = xPlayer - (delta * ySpeed);
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_D)){
			xPlayer = xPlayer + (delta * ySpeed);
		}
		
	}
	
	
	
}
