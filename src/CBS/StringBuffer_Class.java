package CBS;

public class StringBuffer_Class {

	public static void main(String[] args) {
		StringBuffer sb2 = new StringBuffer(30);
		String str = new String("JAVA Coffer");
		StringBuffer sb3 = new StringBuffer(str);
		
		System.out.println("sb2's lenght:" + sb2.length());
		
		System.out.println("sb2's capacity:" + sb2.capacity());
		
		System.out.println("sb3:" + sb3);
		
		System.out.println("sb3's lenght:" + sb3.length());
		
		System.out.println("sb3's capacity:" + sb3.capacity());
		
		sb3.setCharAt(4, '-');
		System.out.println(sb3);
		
		StringBuffer sb1 = new StringBuffer("Java");
		System.out.println(sb1);
		
		char en[] = {'S','t','r','i','n','g','B','u','f','f','e','r'};
		
		sb1.append(en,0,6);
		System.out.println("Add:" + sb1);
		
		sb1.delete(4, 10);
		System.out.println("Delete:" + sb1);
		
		sb1.insert(2, "and");
		System.out.println("Insert:" + sb1);
		
		sb1.replace(1, 5, "a");
		System.out.println("Replace:" + sb1);
		
		sb1.reverse();
		System.out.println("Reverse:" + sb1);
		
	}

}
