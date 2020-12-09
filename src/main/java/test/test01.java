package test;

import org.junit.Test;

public class test01 {
	public void add(Byte b) {
		b = b++;
	}
@Test
	public void test() {
		Byte a = 127;
		Byte b = 127;
		add(++a);
		System.out.print(a + " ");
		add(b);
		System.out.print(b + "");
	}
}
