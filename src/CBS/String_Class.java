package CBS;

public class String_Class {

	public static void main(String[] args) {
		String name = "bor-Shen";
		String first_name = new String("Chen");
		StringBuffer stringBuffer = new StringBuffer("excellent");
		
		char love[] = {'I',' ','l','o','v','e',' ','M','i','s','s',' ','W','e','i','-','W','e','i',' '};
		String str = new String(love,0,love.length);
		
		System.out.println(str);
		
		System.out.println(name.replace('b', 'B'));
		
		char ans[] = new char [love.length];
		str.getChars(12, 19, ans, 0);
		System.out.println(String.valueOf(ans));
		
		System.out.println(str.charAt(12));
		
		System.out.println(str.length());
		
		System.out.println(str.trim());
		System.out.println(str.trim().length());
		
		System.out.println(str.substring(2));
		
		System.out.println(str.substring(2,7));
		
		System.out.println(first_name.toUpperCase());
		
		System.out.println(first_name.toLowerCase());
		
		String[] splitStrings = str.split(" ");
		System.out.println(splitStrings[3]);
		
		System.out.println(name.copyValueOf(love, 7, 12));
		
		char[] test = name.toCharArray();
		System.out.println(test[0]);
		
		byte[] test2 = name.getBytes();
		System.out.println(test2[0]);
		
		System.out.println(str.length());
		System.out.println("test".length());
		
		System.out.println(str.indexOf("Wei"));
		
		System.out.println(str.lastIndexOf("Wei"));
		
		System.out.println("abc".compareTo("abc"));
		
		System.out.println("abc".compareToIgnoreCase("ABC"));
		
		System.out.println("abc".equals("ABC"));
		
		System.out.println("abc".equalsIgnoreCase("ABC"));
		
		System.out.println("abc".contentEquals(stringBuffer));
		
		System.out.println(first_name + " " + name);
	}

}
