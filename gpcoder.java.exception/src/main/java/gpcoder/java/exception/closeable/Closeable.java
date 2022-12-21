package gpcoder.java.exception.closeable;

public class Closeable implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Close!");
	}

}
