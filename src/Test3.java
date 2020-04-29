import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

class Test3 implements Cloneable,Serializable {
	
	public Test3()
	{
		System.out.println("Create Object");
	}
	



	public static void main(String[] args) throws Throwable {
		//Way 1
		Test3 t3 = new Test3();
		System.out.println(t3);
		System.out.println("***************************************************");
		
		//Way 2a
		Test3 t4 = (Test3) Class.forName("Test3").newInstance();
		System.out.println(t4);
		System.out.println("***************************************************");
		
		//Way 2b
		Test3 t5 = Test3.class.newInstance();
		System.out.println(t5);
		System.out.println("***************************************************");
		
		//Way 3
		Constructor<Test3> constructor = Test3.class.getConstructor();
		Test3 t6 = constructor.newInstance();
		System.out.println(t6);
		System.out.println("***************************************************");
		
		//Way 4
		Test3 t7 = (Test3) t6.clone();
		System.out.println(t7);
		System.out.println("***************************************************");
		
		//Way 5
//        // Serialization
//		Test3 t8 = new Test3();
//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));
//        out.writeObject(t8);
//        out.close();

        //Deserialization
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
        Test3 t9 = (Test3) in.readObject();
        in.close();
        System.out.println(t9);
		
		
	}

}

