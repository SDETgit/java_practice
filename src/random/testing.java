package random;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.Random;

public class testing {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		    
		    final int FIVE_SECONDS = 5000;
		    final int MAX_Y = 400;
		    final int MAX_X = 400;
		    Robot robot = new Robot();
	        Random random = new Random();
	        while (true) {
	            robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
	            Thread.sleep(FIVE_SECONDS);
	        }
	    }
		    
		    
		 
		
	}


