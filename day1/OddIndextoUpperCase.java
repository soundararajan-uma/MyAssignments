package week3.day1;

public class OddIndextoUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String text="changeme";
		 // convert string to characters
		char[] text1 = text.toCharArray();
		System.out.println(text);
		 for(int i=0;i<=text1.length-1;i++) {
			 char charAt = text.charAt(i);
			 if(i%2==0) {
				 System.out.print(Character.toLowerCase(charAt));
				 
			 }else {
				 System.out.print(Character.toUpperCase(charAt));
			 }
			 
		 }
		
	}

}
