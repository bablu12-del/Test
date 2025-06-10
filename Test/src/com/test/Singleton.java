package com.test;
class Hello{
	private static Hello h1=null;
	
    private Hello() {
		
	}
	
	static {
		h1=new Hello();
	}
	
	public static Hello getHello() {
		return h1;
	}

}
public class Singleton {
	public static void main(String[] args) {
		Hello h1 =Hello.getHello();
		Hello h2 =Hello.getHello();
		System.out.println("h1"+h1);
		System.out.println("h2"+h2);

	}

}
