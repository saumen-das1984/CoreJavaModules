package classinitialization.example1;

/**
 * Another Java program example to demonstrate class initialization and loading
 * in Java.
 */

public class ClassInitializationTest {

	public static void main(String args[]) throws InterruptedException {

		// accessing static field of Parent through child, should only initialize Parent
		System.out.println(Child.familyName);
	}
}