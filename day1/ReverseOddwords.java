package week3.day1;

public class ReverseOddwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text= "I am a software tester";

System.out.println(text);
//Splitting the text with space as delimiter
String[] split=text.split(" ");

//Initialising the loop to traverse through each word

for(int i=0;i<split.length;i++) {
	//checking the index of the word is even
	if(i%2==0) {
		
		System.out.print(" " + split[i] + " ");
	}
	else {
		// converting the odd index string to character array
		char[] charArray=split[i].toCharArray();
		//Intialising the loop for reversing the odd index word
		for(int j=charArray.length-1;j>=0;j--) {
			System.out.print(charArray[j]);
		}
	}
}
	}

}
