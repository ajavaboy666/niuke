package test;

import java.io.IOException;

public class test08 {
	public static void main(String[] args) {
		try {
			System.out.println("请输入:");
			System.in.read();
			System.out.println("888");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
