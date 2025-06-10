package com.test;

public class recursive {

	public static void main(String[] args) {
		int ab=98;
		System.out.println("ab in Main Before\t:"+ab);
		Mno ref=new Mno();
		ref.showValue(ab);
		System.out.println("ab in Main After\t"+ab);

	}

}

class Mno{
	void showValue(int ab) {
		System.out.println("Before showValue\t"+ab);
		if(ab!=0)
			showValue(ab/10);
		System.out.println("After showValue \t:"+ab);
	}
}


