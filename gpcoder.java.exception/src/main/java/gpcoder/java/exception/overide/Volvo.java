package gpcoder.java.exception.overide;

import java.io.IOException;

public class Volvo extends Vehicle {

	@Override
	public void run() throws IOException, ArithmeticException {
		System.out.println("Volvo is running");
	}

}
