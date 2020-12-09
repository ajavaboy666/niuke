package test;

public class test02 {
		static final Person person = new Person(25,"cxuan");
		public static void main(String[] args) {
		  System.out.println(person);
		  person.setId(26);
		  person.setName("cxuan001");
		  System.out.println(person);
		}
}
