package test;

import java.io.IOException;

public class test09 {
	public static void main(String[] args) {
		int x = 4;
		int y = (x++) + (++x) + (x * 10);
		System.out.println(y);//70
	}
}
