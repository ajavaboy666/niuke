package test;

public class test07 {
public static void main(String[] args) {
	int a=1;
	int b;
	Integer c=1;
	Integer d=1;
	System.out.println(c==d);
	Integer e=new Integer(1);
	Integer f=1;
	System.out.println(e==f);
	
	System.out.println("a:"+a);//1
	b=++a;
	System.out.println("a:"+a);//2
	System.out.println("b:"+b);//2
	b=a++;
	System.out.println("a:"+a);//3
	System.out.println("b:"+b);//2
}
}
