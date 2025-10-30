package week3.day1;

public class LearnReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String companyName="TestLeaf";
 char[] st1 = companyName.toCharArray();
for(int i=st1.length-1;i>=0;i--) {
	System.out.println(st1[i]);
}
	}

}
