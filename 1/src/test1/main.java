package test1;

public class main implements Boo {
	public static void mains() {
		System.out.println(Boo.BooClass.booInt);
	}
}

interface Boo {
	final class BooClass {
		static int booInt = 10;
	}
}