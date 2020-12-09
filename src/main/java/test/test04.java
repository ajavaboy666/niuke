package test;

import org.junit.Test;
import org.junit.runner.RunWith;

public class test04 {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		person1.setId(666);
		person2.setName("小白");
		System.out.println(person1);//Person [id=666, name=null]
		System.out.println("--------------");
		System.out.println(person2);//Person [id=0, name=小白]
		person2=person1;
//		/person2和person1指向了同一个堆内存地址,类似于住在同一个房间
		person1.setName("heihei");
		System.out.println("--------------");
		System.out.println(person2);//Person [id=666, name=heihei]
		System.out.println(person1);//Person [id=666, name=heihei]
	}	
}
