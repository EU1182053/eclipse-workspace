package strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char charArray[]={'w','e','l','c','o','m','e'};
		String s1="welcome";   //index :0..  String literals : literal pool
		String s2=new String(charArray);  // String object with new, heap
		String s3=new String("Hello");
		String s4=new String(s1);
		String s5=s1;
		String s6=new String();
		
		
		String cname="Neosoft";
		String newname=cname+" Technology";
		System.out.println(cname);
		System.out.println(newname);
		cname=cname.toUpperCase();  // original object gets unreferred
		System.out.println(cname);
		
		String location=new String("Rabale");
		String complocation=new String("Rabale");
		String loc="Rabale";
		String loc2="Rabale";
		/*duplicate objects can be available in heap but not in literal pool*/
		System.out.println(location==complocation);
		System.out.println(loc==loc2);
		/*length, charAt, indexOf, lastIndexOf, contact, contains, substring, 
		 * toUppeCase, toLowerCase, isEmpty,isBlank split */
		int l=location.length();
		System.out.println(l);
		String s="Har Ghar Tirangaa";
		System.out.println("Length: "+s.length());
		System.out.println("Character at index 3: "+s.charAt(4));
		System.out.println("first occurence of specified character: "+s.indexOf("G"));
		System.out.println("last occurence of specified character:"+s.lastIndexOf("a"));
		System.out.println("Returns true if specified character is present: "+s.contains("T"));
		System.out.println("gives you the sub string with beginIndex and endIndex: "+s.substring(3));
		System.out.println("Convert to Upper Case: "+s.toUpperCase());
		System.out.println("Convert to Lower Case: "+s.toLowerCase());
		System.out.println("true if empty string: "+s.isEmpty());
		System.out.println("true if only blank spaces"+s.isBlank());
		
	}

}
