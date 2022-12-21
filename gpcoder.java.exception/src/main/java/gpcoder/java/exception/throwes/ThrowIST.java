package gpcoder.java.exception.throwes;

public class ThrowIST {
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
