package test;

import org.junit.Test;
import org.junit.runner.RunWith;

public class test03 {
	
	static class Criteria{	 
		private Criteria criteria;
		public Criteria(Criteria criteria) {
			this.criteria = criteria;
			System.out.println("我是静态内部类");
		}			
	}	
	public static void main(String[] args) {
		System.out.println("-------------");
		new Criteria(null);
		System.out.println("-------------");
		
	}	
}
