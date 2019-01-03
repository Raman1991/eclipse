package com.auribises;
final class CA{//we cannot inherit from it
	final void show() {//we cannot override it
}
}
class CB {//extends CA
	void show() {
}
}

public class finalDemo {

	public static void main(String[] args) {
		int i = 10;
		final int j = 10;
		
		i = 100;
		//j = 100; error we cannot modify/rewrite
		

	}

}
