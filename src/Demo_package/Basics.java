package Demo_package;

import java.util.ArrayList;

public class Basics {

	static int d;// static variable

	int g = 9; // no static variable
	
	
	// non static method
	public int abc() {
		

		int h = 3;
		ge();

		return h;
		
		// System.out.println(h);

	}
	

	public static int ge() {

		int k = 3;
		System.out.println(k);
		return k;
	}

	public static void main(String[] args) {

		Basics b = new Basics();

		System.out.println(Basics.d);

		System.out.println(b.g);

		System.out.println(b.abc());
		
		System.out.println(Basics.ge());

	}

	

	
}
