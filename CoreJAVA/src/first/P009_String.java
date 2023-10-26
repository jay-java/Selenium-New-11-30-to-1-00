package first;

public class P009_String {
	public static void main(String[] args) {
		char r = 'a';
		char c[] = {'j','a','v','a'};
		System.out.println(c); 
		String s = "hello java how are you ?";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(11));
		System.out.println(s.contains(" ?"));
		String s1 = "java";
		String s2 = "JAVA";
		s1 = "new java";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		System.out.println(sb.append(" java"));
		System.out.println(sb);
		
		StringBuilder sf = new StringBuilder("hello");
		System.out.println(sf);
		System.out.println(sf.append(" java"));
		System.out.println(sf);
	}
}
