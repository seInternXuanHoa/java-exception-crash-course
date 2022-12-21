package gpcoder.java.exception.customexception;

import gpcoder.java.exception.throwes.AccessDeniedException;

public class CustomException {
	public static void access(int age) throws AccessDeniedException {
		if (age > 18) {
			System.out.println("Access is grandted!");
		} else {
			throw new AccessDeniedException("Access Denied");
		}
	}

	public static void main(String[] args) {
		int age = 12;
		try {
			access(age);
		} catch (AccessDeniedException e) {
			e.printStackTrace();
		}
		System.out.println("Finished!");
	}
}
