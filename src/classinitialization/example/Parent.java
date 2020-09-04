package classinitialization.example;

/**
 * Super class to demonstrate that Super class is loaded and initialized before
 * Subclass.
 */
class Parent {
	static {
		System.out.println("static block of Super class is initialized");
	}
	{
		System.out.println("non static blocks in super class is initialized");
	}
}
