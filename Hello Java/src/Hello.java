import java.util.Scanner;

import sun.jvm.hotspot.runtime.StaticBaseConstructor;

public class Hello {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Your Name: \n");
		String name=sc.nextLine();
		// TODO Auto-generated method stub
		System.out.println("Hello" + name);
	}

}
