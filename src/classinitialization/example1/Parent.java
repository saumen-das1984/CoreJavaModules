package classinitialization.example1;

class Parent {
	// compile time constant, accessing this will not trigger class initialization
	// protected static final String familyName = "Lawson";

	protected static String familyName = "Lawson";

	static {
		System.out.println("static block of Super class is initialized");
	}
	{
		System.out.println("non static blocks in super class is initialized");
	}
}
