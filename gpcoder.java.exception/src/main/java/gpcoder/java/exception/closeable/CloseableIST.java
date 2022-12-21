package gpcoder.java.exception.closeable;

public class CloseableIST {
	public static void main(String[] args) {
		try(Closeable closeable = new Closeable()) {
			System.out.println("Do something...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
