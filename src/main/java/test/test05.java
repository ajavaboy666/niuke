package test;

public class test05 {
	public final int age=10;
	public static void main(String[] args) {

		//age=11;
		
		String s1 = "Monday";
		String s2 = "Monday";
		Integer a=20;
		Integer b=20;
		StringBuffer stringBuffer1 = new StringBuffer("aa");
		StringBuffer stringBuffer2 = new StringBuffer("aa");
		//true,重写了hashcode,不再比较地址值,直接比较数值
		System.out.println(a==b);
		//true
		//重写了equals,不再比较地址值,直接比较数值
		System.out.println(a.equals(b));
		//false
		System.out.println(stringBuffer1 == stringBuffer2);
		//false
		System.out.println(stringBuffer1.equals(stringBuffer2));
		//true
		System.out.println(s1 == s2);
		//true
		System.out.println(s1.equals(s2));

	}
}
