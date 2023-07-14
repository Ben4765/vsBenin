package ass1;

public class StringHandling {

	public static void main(String[] args) {
		String str= new String("HelloWorld");
		System.out.println(str.length());
		System.out.println(str.concat("Earth"));
		System.out.println(str.substring(5));
		
		
		System.out.println(str.contains("orld"));
		System.out.println(str.toLowerCase());
		System.out.println(str.replace("World", "Earth"));
		
		
		System.out.println(str.equals("HelloWorld"));
		System.out.println(str.compareTo("HelloWorld"));
		

	}

}
