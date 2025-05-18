package String;

public class Reverse_String {

	public static void main(String[] args) {
		
		//Approach using length() and charAt()  
		/*String s = "Selenium";
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--) 
		{
			rev = rev+s.charAt(i);
		}
		
		System.out.println(rev);*/
		
		//Approach by converting string to char array type
		
		String a = "java";
		String rev = "";
		
		char b []=a.toCharArray();
		
		for(int i = b.length-1; i>=0; i--)
		{
			rev = rev+b[i];
		}
		System.out.println(rev);
		
	}

}
