import java.awt.Image;
import java.util.Timer;

import quik.*;

@SuppressWarnings("serial")
public class run extends quikDraw {
	static quikDraw qD = new quikDraw();
	static quikIO qIO = new quikIO(System.getProperty("user.dir") + "\\src");
	static quikKeyHandler qKH = new quikKeyHandler();

	static Timer timer = new Timer();

	static int x = 0;
	static int y = 100;

	static boolean runBoolean = true;
	
	static Image koopa = qIO.imagePath("54.png");
	
	public static void main(String[] args) {
		// setup
		qD.setWindow(800, 600, "quik");
		qD.drawLine(50, 100, 150, 100);
		qD.drawRect(20, 20, 100, 100);

		qD.drawImage(koopa, 100, 100);
		startDraw();
	}

	public static void startDraw() {
		while (runBoolean) {
			draw();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void draw() {
		if(quikKeyHandler.keyPressed) {
			
		}
	}
	
	
}
