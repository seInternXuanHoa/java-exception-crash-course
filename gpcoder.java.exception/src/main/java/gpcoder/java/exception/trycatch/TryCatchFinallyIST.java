package gpcoder.java.exception.trycatch;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class TryCatchFinallyIST {
	public static void main(String[] args) {
		try {
			System.out.println("Result: " + (10 / 0));
		} catch (Exception e) {
			System.out.println("Messenge: " + e.getMessage());
			System.out.println("Cause: " + e.getCause());
			System.out.println("To String: " + e.toString());
			System.out.println("Stack Trace: " + Arrays.toString(e.getStackTrace()));
			try {
				Thread.sleep(TimeUnit.SECONDS.toMillis(1));
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			} finally {
				System.out.println("Finally!");
			}
			e.printStackTrace();
		}
		System.out.println("Finished");
	}
}
