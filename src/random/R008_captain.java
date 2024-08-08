package random;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Stack;

public class R008_captain {
	 

	public static void main(String[] args) throws InterruptedException, AWTException {
	    final int FIVE_SECONDS = 5000;
	    final int MAX_Y = 400;
	    final int MAX_X = 400;
	    Robot robot = new Robot();
        Random random = new Random();
        while (true) {
            robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
            Thread.sleep(FIVE_SECONDS);
        	ArrayList<String> cars = new ArrayList<String>();
    	    cars.add("Volvo");
    	    cars.add("BMW");
    	    cars.add("Ford");
    	    cars.add("Mazda");
    	    System.out.println(cars.get(0));
    	    System.out.println(cars.get(1));
    	    System.out.println(String.valueOf("Volvo"));
    	    
}
}}
