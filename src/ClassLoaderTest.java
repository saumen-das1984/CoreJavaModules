
public class ClassLoaderTest {
	public static void main(String args[]) {
		try {
			// printing ClassLoader of this class
			System.out
					.println("ClassLoaderTest.getClass().getClassLoader() : " + ClassLoaderTest.class.getClassLoader());

			// trying to explicitly load this class again using Extension class loader
			Class.forName("ClassLoaderTest", true, ClassLoaderTest.class.getClassLoader().getParent());
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}

}
