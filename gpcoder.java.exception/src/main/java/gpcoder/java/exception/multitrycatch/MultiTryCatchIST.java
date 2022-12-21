package gpcoder.java.exception.multitrycatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiTryCatchIST {
	public static void main(String[] args) {
		// Single Try Catch
		try {
			List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1));
			System.out.println("Result: " + (numbers.get(1) / 0));
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		// Multi Try Catch
		try {
			List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1));
			System.out.println("Result: " + (numbers.get(1) / 0));
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
